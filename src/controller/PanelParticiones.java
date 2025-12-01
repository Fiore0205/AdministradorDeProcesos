package controller;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import model.*;
import java.util.ArrayList;

public class PanelParticiones extends JPanel {

    private JButton btnFijas, btnVariables, btnAsignar;
    private JButton btnPrimerAjuste, btnMejorAjuste, btnPeorAjuste;
    private JTable tablaParticiones;
    private DefaultTableModel modeloTabla;
    private JTextArea areaMapa;

    private AdministradorProcesos admin;
    private Maquina maquina;

    public PanelParticiones() {

        setLayout(new BorderLayout());

        admin = new AdministradorProcesos();
        maquina = new Maquina(1, "M1", 0, 256, 1);
        admin.getListaMaquinasActiva().add(maquina);

        JPanel panelBotones = new JPanel(new GridLayout(2, 5, 5, 5));

        btnFijas = new JButton("Particiones Fijas");
        btnVariables = new JButton("Particiones Variables");
        btnAsignar = new JButton("Asignación Dinámica");

        btnPrimerAjuste = new JButton("Primer Ajuste");
        btnMejorAjuste = new JButton("Mejor Ajuste");
        btnPeorAjuste = new JButton("Peor Ajuste");

        panelBotones.add(btnFijas);
        panelBotones.add(btnVariables);
        panelBotones.add(btnAsignar);
        panelBotones.add(btnPrimerAjuste);
        panelBotones.add(btnMejorAjuste);
        panelBotones.add(btnPeorAjuste);

        add(panelBotones, BorderLayout.NORTH);

        modeloTabla = new DefaultTableModel(new Object[]{"#", "Inicio", "Fin", "Tamaño", "Estado", "Proceso"}, 0);
        tablaParticiones = new JTable(modeloTabla);
        add(new JScrollPane(tablaParticiones), BorderLayout.CENTER);

        areaMapa = new JTextArea(6, 50);
        areaMapa.setFont(new Font("Consolas", Font.PLAIN, 12));
        areaMapa.setEditable(false);
        add(new JScrollPane(areaMapa), BorderLayout.SOUTH);

        configurarAcciones();
    }

    // ============================================================
    // LISTA FIJA DE 3 PROCESOS PARA TODAS LAS PRUEBAS
    // ============================================================
    private ArrayList<Proceso> obtenerProcesosBase() {
        ArrayList<Proceso> lista = new ArrayList<>();
        lista.add(new Proceso(1, "A", 1, 0, 5, 100, 0));   // 100
        lista.add(new Proceso(2, "B", 1, 0, 5, 20, 0));    // 20
        lista.add(new Proceso(3, "C", 1, 0, 5, 40, 0));    // 40
        lista.add(new Proceso(4, "D", 1, 0, 5, 50, 0));    // 50 ← Se asigna distinto

        return lista;
    }

    // ============================================================
    // CONFIGURACIÓN DE BOTONES
    // ============================================================
    private void configurarAcciones() {

        // ------------ PARTICIONES FIJAS CON JOPTION ------------
        btnFijas.addActionListener(e -> {
            try {
                int total = Integer.parseInt(JOptionPane.showInputDialog(
                        this, "Ingrese tamaño TOTAL de la memoria (ej: 256):"));

                int tamanio = Integer.parseInt(JOptionPane.showInputDialog(
                        this, "Ingrese tamaño de CADA partición fija:"));

                if (total % tamanio != 0) {
                    JOptionPane.showMessageDialog(this,
                            "ERROR: El tamaño NO divide exactamente la memoria total.",
                            "Partición inválida", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                ListaParticiones lp = new ListaParticiones(total, tamanio);
                maquina.setListaParticiones(lp);
                actualizarTabla();
                actualizarMapa();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Entrada inválida.");
            }
        });

        // ------------ PARTICIONES VARIABLES CON JOPTION ------------
        btnVariables.addActionListener(e -> {

            int[] tamanios = {16, 32, 64, 128, 256, 512};
            int[] cantidades = new int[tamanios.length];

            try {
                for (int i = 0; i < tamanios.length; i++) {
                    String input = JOptionPane.showInputDialog(this,
                            "¿Cuántas particiones de tamaño " + tamanios[i] + "?");
                    if (input == null) {
                        return; // usuario canceló
                    }
                    cantidades[i] = Integer.parseInt(input);
                }

                ListaParticiones lp = new ListaParticiones(256, cantidades);
                maquina.setListaParticiones(lp);
                actualizarTabla();
                actualizarMapa();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Entrada inválida.");
            }
        });

        // ------------ ASIGNACIÓN DINÁMICA CON JOPTION ------------
        btnAsignar.addActionListener(e -> {
            try {
                int total = Integer.parseInt(JOptionPane.showInputDialog(
                        this, "Ingrese tamaño TOTAL de la memoria dinámica:"));

                maquina.setListaParticiones(new ListaParticiones());
                maquina.getListaParticiones().agregarParticiones(
                        new Particion(0, total - 1, total));

                ArrayList<Proceso> procesos = obtenerProcesosBase();

                for (Proceso p : procesos) {
                    admin.asignarMemoriaAProceso(p, maquina, 0);
                }

                actualizarTabla();
                actualizarMapa();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Entrada inválida.");
            }
        });

        // ------------ PRIMER AJUSTE ------------
        btnPrimerAjuste.addActionListener(e -> {
            maquina.setListaParticiones(new ListaParticiones());
            maquina.getListaParticiones().agregarParticiones(new Particion(0, 255, 256));

            ArrayList<Proceso> procesos = obtenerProcesosBase();

            for (Proceso p : procesos) {
                admin.asignarMemoriaAProceso(p, maquina, 1);
            }

            actualizarTabla();
            actualizarMapa();
        });

        // ------------ MEJOR AJUSTE ------------
        btnMejorAjuste.addActionListener(e -> {
            maquina.setListaParticiones(new ListaParticiones());
            maquina.getListaParticiones().agregarParticiones(new Particion(0, 255, 256));

            ArrayList<Proceso> procesos = obtenerProcesosBase();

            for (Proceso p : procesos) {
                admin.asignarMemoriaAProceso(p, maquina, 2);
            }

            actualizarTabla();
            actualizarMapa();
        });

        // ------------ PEOR AJUSTE ------------
        btnPeorAjuste.addActionListener(e -> {
            maquina.setListaParticiones(new ListaParticiones());
            maquina.getListaParticiones().agregarParticiones(new Particion(0, 255, 256));

            ArrayList<Proceso> procesos = obtenerProcesosBase();

            for (Proceso p : procesos) {
                admin.asignarMemoriaAProceso(p, maquina, 3);
            }

            actualizarTabla();
            actualizarMapa();
        });
    }

    // ============================================================
    // ACTUALIZAR TABLA Y MAPA
    // ============================================================
    private void actualizarTabla() {

        modeloTabla.setRowCount(0);

        ListaParticiones lp = maquina.getListaParticiones();
        Particion[] lista = lp.getListaParticiones();

        for (int i = 0; i < lp.getnParticionesTotales(); i++) {
            Particion p = lista[i];
            modeloTabla.addRow(new Object[]{
                i + 1,
                p.getInicioP(),
                p.getFinalP(),
                p.getNUnidadesP(),
                p.getEstadoP(),
                p.getNombreProceso()
            });
        }
    }

    private void actualizarMapa() {
        ListaParticiones lp = maquina.getListaParticiones();

        StringBuilder sb = new StringBuilder();

        sb.append("Índices:\n");
        for (int i = 0; i < 256; i++) {
            sb.append(i % 10 == 0 ? (i + " ") : ".");
        }
        sb.append("\n\n");

        sb.append("Memoria:\n");
        sb.append(lp.generarLineaMemoria());

        areaMapa.setText(sb.toString());
    }
}
