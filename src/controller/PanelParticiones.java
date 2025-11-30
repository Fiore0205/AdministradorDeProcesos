package controller;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import model.*;
import java.util.ArrayList;

public class PanelParticiones extends JPanel {

    private JButton btnFijas, btnVariables, btnAsignar, btnLiberar, btnFusionar, btnCompactar;
    private JButton btnPrimerAjuste, btnMejorAjuste, btnPeorAjuste;
    private JTable tablaParticiones;
    private DefaultTableModel modeloTabla;
    private JTextArea areaMapa;

    // Objetos reales de backend
    private AdministradorProcesos admin;
    private Maquina maquina;

    public PanelParticiones() {

        setLayout(new BorderLayout());

        // Crear admin y máquina inicial
        admin = new AdministradorProcesos();
        maquina = new Maquina(1, "M1", 0, 256, 1);
        admin.getListaMaquinasActiva().add(maquina);

        // ---- PANEL SUPERIOR BOTONES ----
        JPanel panelBotones = new JPanel(new GridLayout(2, 5, 5, 5));

        btnFijas = new JButton("Particiones Fijas");
        btnVariables = new JButton("Particiones Variables");
        btnAsignar = new JButton("Asignación Dinámica");
        btnLiberar = new JButton("Liberar");
        btnFusionar = new JButton("Fusionar");
        btnCompactar = new JButton("Compactar");

        btnPrimerAjuste = new JButton("Primer Ajuste");
        btnMejorAjuste = new JButton("Mejor Ajuste");
        btnPeorAjuste = new JButton("Peor Ajuste");

        panelBotones.add(btnFijas);
        panelBotones.add(btnVariables);
        panelBotones.add(btnAsignar);
        panelBotones.add(btnLiberar);
        panelBotones.add(btnFusionar);
        panelBotones.add(btnCompactar);
        panelBotones.add(btnPrimerAjuste);
        panelBotones.add(btnMejorAjuste);
        panelBotones.add(btnPeorAjuste);

        add(panelBotones, BorderLayout.NORTH);

        // ---- TABLA DE PARTICIONES ----
        modeloTabla = new DefaultTableModel(new Object[]{"#", "Inicio", "Fin", "Tamaño", "Estado", "Proceso"}, 0);
        tablaParticiones = new JTable(modeloTabla);

        add(new JScrollPane(tablaParticiones), BorderLayout.CENTER);

        // ---- MAPA DE MEMORIA ----
        areaMapa = new JTextArea(6, 50);
        areaMapa.setFont(new Font("Consolas", Font.PLAIN, 12));
        areaMapa.setEditable(false);

        add(new JScrollPane(areaMapa), BorderLayout.SOUTH);

        // Asignar listeners
        configurarAcciones();
    }

    // ============================================================
    // ACCIONES DE LOS BOTONES
    // ============================================================
    private void configurarAcciones() {

        // ---- PARTICIONES FIJAS ----
        btnFijas.addActionListener(e -> {
            ListaParticiones lp = new ListaParticiones(256, 32);
            maquina.setListaParticiones(lp);
            actualizarTabla();
            actualizarMapa();
        });

        // ---- PARTICIONES VARIABLES ----
        btnVariables.addActionListener(e -> {
            int[] cant = {2, 1, 1, 0, 0, 0};
            ListaParticiones lp = new ListaParticiones(256, cant);
            maquina.setListaParticiones(lp);
            actualizarTabla();
            actualizarMapa();
        });

        // ---- ASIGNACIÓN DINÁMICA ----
        btnAsignar.addActionListener(e -> {
            maquina.setListaParticiones(new ListaParticiones());
            maquina.getListaParticiones().agregarParticiones(new Particion(0, 255, 256));

            Proceso d1 = new Proceso(1, "D1", 1, 0, 5, 40, 0);
            Proceso d2 = new Proceso(2, "D2", 1, 0, 5, 20, 0);
            Proceso d3 = new Proceso(3, "D3", 1, 0, 5, 50, 0);

            admin.asignarMemoriaAProceso(d1, maquina, 0);
            admin.asignarMemoriaAProceso(d2, maquina, 0);
            admin.asignarMemoriaAProceso(d3, maquina, 0);

            actualizarTabla();
            actualizarMapa();
        });

        // ---- LIBERAR D2 ----
        btnLiberar.addActionListener(e -> {
            Proceso d2 = new Proceso(2, "D2", 1, 0, 5, 20, 0);
            admin.liberarMemoriaProceso(d2);
            actualizarTabla();
            actualizarMapa();
        });

        // ---- FUSIONAR ----
        btnFusionar.addActionListener(e -> {
            maquina.getListaParticiones().fusionarLibres();
            actualizarTabla();
            actualizarMapa();
        });

        // ---- COMPACTAR ----
        btnCompactar.addActionListener(e -> {
            maquina.getListaParticiones().compactar();
            actualizarTabla();
            actualizarMapa();
        });

        // ---- PRIMER AJUSTE ----
        btnPrimerAjuste.addActionListener(e -> {
            maquina.setListaParticiones(new ListaParticiones());
            maquina.getListaParticiones().agregarParticiones(new Particion(0, 255, 256));

            Proceso p1 = new Proceso(4, "P1", 1, 0, 5, 30, 0);
            Proceso p2 = new Proceso(5, "P2", 1, 0, 5, 40, 0);
            Proceso p3 = new Proceso(6, "P3", 1, 0, 5, 20, 0);

            admin.asignarMemoriaAProceso(p1, maquina, 1);
            admin.asignarMemoriaAProceso(p2, maquina, 1);
            admin.asignarMemoriaAProceso(p3, maquina, 1);

            actualizarTabla();
            actualizarMapa();
        });

        // ---- MEJOR AJUSTE ----
        btnMejorAjuste.addActionListener(e -> {
            maquina.setListaParticiones(new ListaParticiones());
            maquina.getListaParticiones().agregarParticiones(new Particion(0, 255, 256));

            Proceso b1 = new Proceso(7, "B1", 1, 0, 5, 35, 0);
            Proceso b2 = new Proceso(8, "B2", 1, 0, 5, 15, 0);
            Proceso b3 = new Proceso(9, "B3", 1, 0, 5, 45, 0);

            admin.asignarMemoriaAProceso(b1, maquina, 2);
            admin.asignarMemoriaAProceso(b2, maquina, 2);
            admin.asignarMemoriaAProceso(b3, maquina, 2);

            actualizarTabla();
            actualizarMapa();
        });

        // ---- PEOR AJUSTE ----
        btnPeorAjuste.addActionListener(e -> {
            maquina.setListaParticiones(new ListaParticiones());
            maquina.getListaParticiones().agregarParticiones(new Particion(0, 255, 256));

            Proceso w1 = new Proceso(10, "W1", 1, 0, 5, 25, 0);
            Proceso w2 = new Proceso(11, "W2", 1, 0, 5, 50, 0);
            Proceso w3 = new Proceso(12, "W3", 1, 0, 5, 30, 0);

            admin.asignarMemoriaAProceso(w1, maquina, 3);
            admin.asignarMemoriaAProceso(w2, maquina, 3);
            admin.asignarMemoriaAProceso(w3, maquina, 3);

            actualizarTabla();
            actualizarMapa();
        });
    }

    // ============================================================
    // MÉTODOS DE ACTUALIZACIÓN VISUAL
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

        // Línea de índices
        sb.append("Indices:\n");
        for (int i = 0; i < 256; i++) {
            sb.append(i % 10 == 0 ? (i + " ") : ".");
        }
        sb.append("\n\n");

        // Contenido de memoria
        sb.append("Memoria:\n");
        sb.append(lp.generarLineaMemoria()); // Debes tener este método

        areaMapa.setText(sb.toString());
    }
}
