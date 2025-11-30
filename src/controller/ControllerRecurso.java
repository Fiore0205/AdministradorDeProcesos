/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.AdministradorProcesos;
import model.Recurso;
import view.GUIRecurso;

/**
 *
 * @author fioli
 */
public class ControllerRecurso implements ActionListener {

    GUIRecurso guiRecurso;
    AdministradorProcesos administradorP;
    private int tipoAsignacion; // "1. PROCESO" o "2. MAQUINA"

    public ControllerRecurso(AdministradorProcesos administradorP, int tipoAsignacion) {
        guiRecurso = new GUIRecurso(null, true);
        this.administradorP = administradorP;
        this.tipoAsignacion = tipoAsignacion;
        initEvents();
        guiRecurso.setVisible(true);
    }

    public void initEvents() {
        guiRecurso.getBtnAsignarRecurso().addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == guiRecurso.getBtnAsignarRecurso()) {
            if (asignarRecurso()) {
                guiRecurso.dispose();
            }
        }
    }

    public boolean asignarRecurso() {
        try {
            int nRecurso = Integer.parseInt(guiRecurso.getTxtNRecurso());
            int unidades = Integer.parseInt(guiRecurso.getTxtUnidadesRecurso());
            String nombre = guiRecurso.getTxtNombreRecurso();

            if (nombre.isEmpty()) {
                JOptionPane.showMessageDialog(guiRecurso, "Debe ingresar un nombre.");
                return false;
            }
            // Crear recurso
            Recurso recurso = new Recurso(nRecurso, nombre, unidades);

            // ----------- ASIGNACIÓN SEGÚN TIPO -----------
            if (tipoAsignacion == 1) {
                administradorP.asignarRecursoAProceso(recurso);

            } else if (tipoAsignacion == 2) {
                administradorP.asignarRecursoAMaquina(recurso);

            } else {
                JOptionPane.showMessageDialog(guiRecurso,
                        "Tipo de asignación inválido.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                return false;
            }

            return true;

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(
                    guiRecurso,
                    "Debe ingresar valores numéricos válidos.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
            return false;
        }
    }

    public void limpiarCampos() {
        guiRecurso.setTxtNRecurso("");
        guiRecurso.setTxtNombreRecurso("");
        guiRecurso.setTxtUnidadesRecurso("");
    }
}
