package view;

import javax.swing.*;

public class GUIRecurso extends JDialog {

    private JLabel lblTitulo;
    private JLabel lblNRecurso;
    private JLabel lblNombre;
    private JLabel lblUnidades;

    private JTextField txtNRecurso;
    private JTextField txtNombreRecurso;
    private JTextField txtUnidadesRecurso;

    private JButton btnAsignarRecurso;
    private JButton btnCancelar;

    public GUIRecurso(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    private void initComponents() {

        lblTitulo = new JLabel("Asignar Recurso al Proceso");
        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18));

        lblNRecurso = new JLabel("Número del Recurso:");
        lblNombre = new JLabel("Nombre del Recurso:");
        lblUnidades = new JLabel("Unidades:");

        txtNRecurso = new JTextField();
        txtNombreRecurso = new JTextField();
        txtUnidadesRecurso = new JTextField();

        btnAsignarRecurso = new JButton("Asignar");
        btnCancelar = new JButton("Cancelar");

        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setResizable(false);

        // --------------------
        // LAYOUT (GroupLayout)
        // --------------------
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                .addGroup(layout.createSequentialGroup()
                    .addGap(30)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblTitulo)
                        .addComponent(lblNRecurso)
                        .addComponent(txtNRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblNombre)
                        .addComponent(txtNombreRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblUnidades)
                        .addComponent(txtUnidadesRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnAsignarRecurso)
                            .addGap(18)
                            .addComponent(btnCancelar)))
                    .addGap(30))
        );

        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addGap(20)
                .addComponent(lblTitulo)
                .addGap(20)
                .addComponent(lblNRecurso)
                .addComponent(txtNRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15)
                .addComponent(lblNombre)
                .addComponent(txtNombreRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15)
                .addComponent(lblUnidades)
                .addComponent(txtUnidadesRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAsignarRecurso)
                    .addComponent(btnCancelar))
                .addGap(20)
        );

        pack();
    }

    // ------------------------------
    // GETTERS PARA EL CONTROLLER
    // ------------------------------

    public JButton getBtnAsignarRecurso() {
        return btnAsignarRecurso;
    }

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public String getTxtNRecurso() {
        return txtNRecurso.getText();
    }

    public String getTxtNombreRecurso() {
        return txtNombreRecurso.getText();
    }

    public String getTxtUnidadesRecurso() {
        return txtUnidadesRecurso.getText();
    }

    public void setTxtNRecurso(String txt) {
        txtNRecurso.setText(txt);
    }

    public void setTxtNombreRecurso(String txt) {
        txtNombreRecurso.setText(txt);
    }

    public void setTxtUnidadesRecurso(String txt) {
        txtUnidadesRecurso.setText(txt);
    }
}
