/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author fioli
 */
public class GUIAdministradorProcesos extends javax.swing.JFrame {

    /**
     * Creates new form GUIAdministradorProcesos_1
     */
    public GUIAdministradorProcesos() {
        initComponents();
    }

    public JButton getBtnAgregarMaquina() {
        return btnAgregarMaquina;
    }

    public void setBtnAgregarMaquina(JButton btnAgregarMaquina) {
        this.btnAgregarMaquina = btnAgregarMaquina;
    }

    public JButton getBtnAgregarProceso() {
        return btnAgregarProceso;
    }

    public void setBtnAgregarProceso(JButton btnAgregarProceso) {
        this.btnAgregarProceso = btnAgregarProceso;
    }

    public JButton getBtnAsignarRecursosMaquina() {
        return btnAsignarRecursosMaquina;
    }

    public void setBtnAsignarRecursosMaquina(JButton btnAsignarRecursosMaquina) {
        this.btnAsignarRecursosMaquina = btnAsignarRecursosMaquina;
    }

    public JButton getBtnAsignarRecursosProceso() {
        return btnAsignarRecursosProceso;
    }

    public void setBtnAsignarRecursosProceso(JButton btnAsignarRecursosProceso) {
        this.btnAsignarRecursosProceso = btnAsignarRecursosProceso;
    }

    public JButton getBtnConsultarMaquina() {
        return btnConsultarMaquina;
    }

    public void setBtnConsultarMaquina(JButton btnConsultarMaquina) {
        this.btnConsultarMaquina = btnConsultarMaquina;
    }

    public JButton getBtnConsultarProceso() {
        return btnConsultarProceso;
    }

    public void setBtnConsultarProceso(JButton btnConsultarProceso) {
        this.btnConsultarProceso = btnConsultarProceso;
    }

    public JButton getBtnCrearMaquina() {
        return btnCrearMaquina;
    }

    public void setBtnCrearMaquina(JButton btnCrearMaquina) {
        this.btnCrearMaquina = btnCrearMaquina;
    }

    public JButton getBtnCrearProceso() {
        return btnCrearProceso;
    }

    public void setBtnCrearProceso(JButton btnCrearProceso) {
        this.btnCrearProceso = btnCrearProceso;
    }

    public JButton getBtnEliminarMaquina() {
        return btnEliminarMaquina;
    }

    public void setBtnEliminarMaquina(JButton btnEliminarMaquina) {
        this.btnEliminarMaquina = btnEliminarMaquina;
    }

    public JButton getBtnEliminarProceso() {
        return btnEliminarProceso;
    }

    public void setBtnEliminarProceso(JButton btnEliminarProceso) {
        this.btnEliminarProceso = btnEliminarProceso;
    }

    public JButton getBtnModificarMaquina() {
        return btnModificarMaquina;
    }

    public void setBtnModificarMaquina(JButton btnModificarMaquina) {
        this.btnModificarMaquina = btnModificarMaquina;
    }

    public JButton getBtnModificarProceso() {
        return btnModificarProceso;
    }

    public void setBtnModificarProceso(JButton btnModificarProceso) {
        this.btnModificarProceso = btnModificarProceso;
    }

    public String getTxtAreaListaMaquina() {
        return txtAreaListaMaquina.getText();
    }

    public void setTxtAreaListaMaquina(String txtAreaListaMaquina) {
        this.txtAreaListaMaquina.setText(txtAreaListaMaquina);
    }

    public String getTxtAreaListaProcesos() {
        return txtAreaListaProcesos.getText();
    }

    public void setTxtAreaListaProcesos(String txtAreaListaProcesos) {
        this.txtAreaListaProcesos.setText(txtAreaListaProcesos);
    }

    public String getTxtAreaListaRecursos() {
        return txtAreaListaRecursos.getText();
    }

    public void setTxtAreaListaRecursos(String txtAreaListaRecursos) {
        this.txtAreaListaRecursos.setText(txtAreaListaRecursos);
    }

    public String getTxtAreaListaRecursosMaquina() {
        return txtAreaListaRecursosMaquina.getText();
    }

    public void setTxtAreaListaRecursosMaquina(String txtAreaListaRecursosMaquina) {
        this.txtAreaListaRecursosMaquina.setText(txtAreaListaRecursosMaquina);
    }

    public String getTxtNMaquina() {
        return txtNMaquina.getText();
    }

    public void setTxtNMaquina(String txtNMaquina) {
        this.txtNMaquina.setText(txtNMaquina);
    }

    public String getTxtNProceso() {
        return txtNProceso.getText();
    }

    public void setTxtNProceso(String txtNProceso) {
        this.txtNProceso.setText(txtNProceso);
    }

    public String getTxtNombreMaquina() {
        return txtNombreMaquina.getText();
    }

    public void setTxtNombreMaquina(String txtNombreMaquina) {
        this.txtNombreMaquina.setText(txtNombreMaquina);
    }

    public String getTxtNombreProceso() {
        return txtNombreProceso.getText();
    }

    public void setTxtNombreProceso(String txtNombreProceso) {
        this.txtNombreProceso.setText(txtNombreProceso);
    }

    public String getTxtPrioridadProceso() {
        return txtPrioridadProceso.getText();
    }

    public void setTxtPrioridadProceso(String txtPrioridadProceso) {
        this.txtPrioridadProceso.setText(txtPrioridadProceso);
    }

    public String getTxtTiempoInicio() {
        return txtTiempoInicio.getText();
    }

    public void setTxtTiempoInicio(String txtTiempoInicio) {
        this.txtTiempoInicio.setText(txtTiempoInicio);
    }

    public String getTxtTipoProceso() {
        return txtTipoProceso.getText();
    }

    public void setTxtTipoProceso(String txtTipoProceso) {
        this.txtTipoProceso.setText(txtTipoProceso);
    }

    public String getTxtUCPUMaquina() {
        return txtUCPUMaquina.getText();
    }

    public void setTxtUCPUMaquina(String txtUCPUMaquina) {
        this.txtUCPUMaquina.setText(txtUCPUMaquina);
    }

    public String getTxtUCPUProceso() {
        return txtUCPUProceso.getText();
    }

    public void setTxtUCPUProceso(String txtUCPUProceso) {
        this.txtUCPUProceso.setText(txtUCPUProceso);
    }

    public String getTxtUMemMaquina() {
        return txtUMemMaquina.getText();
    }

    public void setTxtUMemMaquina(String txtUMemMaquina) {
        this.txtUMemMaquina.setText(txtUMemMaquina);
    }

    public String getTxtUMemProceso() {
        return txtUMemProceso.getText();
    }

    public void setTxtUMemProceso(String txtUMemProceso) {
        this.txtUMemProceso.setText(txtUMemProceso);
    }

    public String getTxtUTiempoProceso() {
        return txtUTiempoProceso.getText();
    }

    public void setTxtUTiempoProceso(String txtUTiempoProceso) {
        this.txtUTiempoProceso.setText(txtUTiempoProceso);
    }

    public JButton getBtnODL() {
        return btnODL;
    }

    public void setBtnODL(JButton btnODL) {
        this.btnODL = btnODL;
    }

    public JButton getBtnPRI() {
        return btnPRI;
    }

    public void setBtnPRI(JButton btnPRI) {
        this.btnPRI = btnPRI;
    }

    public JButton getBtnParar() {
        return btnParar;
    }

    public JButton getBtnIniciar() {
        return btnIniciar;
    }

    public JButton getBtnRR() {
        return btnRR;
    }

    public void setBtnRR(JButton btnRR) {
        this.btnRR = btnRR;
    }

    public JButton getBtnTMC() {
        return btnTMC;
    }

    public void setBtnTMC(JButton btnTMC) {
        this.btnTMC = btnTMC;
    }

    public JPanel getPanel_ODL() {
        return panel_ODL;
    }

    public void setPanel_ODL(JPanel panel_ODL) {
        this.panel_ODL = panel_ODL;
    }

    public JPanel getPanel_TMC() {
        return panel_TMC;
    }

    public void setPanel_TMC(JPanel panel_TMC) {
        this.panel_TMC = panel_TMC;
    }

    public JPanel getPanel_botones_algoritmos() {
        return panel_botones_algoritmos;
    }

    public void setPanel_botones_algoritmos(JPanel panel_botones_algoritmos) {
        this.panel_botones_algoritmos = panel_botones_algoritmos;
    }

    public JPanel getPanel_parent() {
        return panel_parent;
    }

    public void setPanel_parent(JPanel panel_parent) {
        this.panel_parent = panel_parent;
    }

    public String getTxtAreaListaTablaEstadosODL() {
        return txtAreaListaTablaEstadosODL.getText();
    }

    public void setTxtAreaListaTablaEstadosODL(String txtAreaListaTablaEstadosODL) {
        this.txtAreaListaTablaEstadosODL.setText(txtAreaListaTablaEstadosODL);
    }

    public String getTxtAreaListaTablaEstadosTMC() {
        return txtAreaListaTablaEstadosTMC.getText();
    }

    public void setTxtAreaListaTablaEstadosTMC(String txtAreaListaTablaEstadosTMC) {
        this.txtAreaListaTablaEstadosTMC.setText(txtAreaListaTablaEstadosTMC);
    }

    public String getTxtAreaListarRecursosMaquinasODL() {
        return txtAreaListarRecursosMaquinasODL.getText();
    }

    public void setTxtAreaListarRecursosMaquinasODL(String txtAreaListarRecursosMaquinasODL) {
        this.txtAreaListarRecursosMaquinasODL.setText(txtAreaListarRecursosMaquinasODL);
    }

    public String getTxtAreaListarRecursosMaquinasTMC() {
        return txtAreaListarRecursosMaquinasTMC.getText();
    }

    public void setTxtAreaListarRecursosMaquinasTMC(String txtAreaListarRecursosMaquinasTMC) {
        this.txtAreaListarRecursosMaquinasTMC.setText(txtAreaListarRecursosMaquinasTMC);
    }

    public String getTxtAreaMemoriaMaquinasODL() {
        return txtAreaMemoriaMaquinasODL.getText();
    }

    public void setTxtAreaMemoriaMaquinasODL(String txtAreaMemoriaMaquinasODL) {
        this.txtAreaMemoriaMaquinasODL.setText(txtAreaMemoriaMaquinasODL);
    }

    public String getTxtAreaMemoriaMaquinasTMC() {
        return txtAreaMemoriaMaquinasTMC.getText();
    }

    public void setTxtAreaMemoriaMaquinasTMC(String txtAreaMemoriaMaquinasTMC) {
        this.txtAreaMemoriaMaquinasTMC.setText(txtAreaMemoriaMaquinasTMC);
    }

    public JButton getBtnIniciarPRI() {
        return btnIniciar;
    }

    public void setBtnIniciarPRI(JButton btnIniciarPRI) {
        this.btnIniciar = btnIniciarPRI;
    }

    public JButton getBtnPararPRI() {
        return btnParar;
    }

    public void setBtnPararPRI(JButton btnPararPRI) {
        this.btnParar = btnPararPRI;
    }

    public String getTxtAreaListaTablaEstadosPRI() {
        return txtAreaListaTablaEstadosPRI.getText();
    }

    public void setTxtAreaListaTablaEstadosPRI(String txtAreaListaTablaEstadosPRI) {
        this.txtAreaListaTablaEstadosPRI.setText(txtAreaListaTablaEstadosPRI);
    }

    public String getTxtAreaListarRecursosMaquinasPRI() {
        return txtAreaListarRecursosMaquinasPRI.getText();
    }

    public void setTxtAreaListarRecursosMaquinasPRI(String txtAreaListarRecursosMaquinasPRI) {
        this.txtAreaListarRecursosMaquinasPRI.setText(txtAreaListarRecursosMaquinasPRI);
    }

    public String getTxtAreaMemoriaMaquinasPRI() {
        return txtAreaMemoriaMaquinasPRI.getText();
    }

    public void setTxtAreaMemoriaMaquinasPRI(String txtAreaMemoriaMaquinasPRI) {
        this.txtAreaMemoriaMaquinasPRI.setText(txtAreaMemoriaMaquinasPRI);
    }

    public JPanel getPanel_PRI() {
        return panel_PRI;
    }

    public void setPanel_PRI(JPanel panel_PRI) {
        this.panel_PRI = panel_PRI;
    }

    public JPanel getPanel_RR() {
        return panel_RR;
    }

    public void setPanel_RR(JPanel panel_RR) {
        this.panel_RR = panel_RR;
    }

    public String getTxtAreaListaTablaEstadosRR() {
        return txtAreaListaTablaEstadosRR.getText();
    }

    public void setTxtAreaListaTablaEstadosRR(String txtAreaListaTablaEstadosRR) {
        this.txtAreaListaTablaEstadosRR.setText(txtAreaListaTablaEstadosRR);
    }

    public JComboBox<String> getBoxTipoSimulacionODL() {
        return boxTipoSimulacionODL;
    }

    public void setBoxTipoSimulacionODL(JComboBox<String> boxTipoSimulacionODL) {
        this.boxTipoSimulacionODL = boxTipoSimulacionODL;
    }

    public JComboBox<String> getBoxTipoSimulacionPRI() {
        return boxTipoSimulacionPRI;
    }

    public void setBoxTipoSimulacionPRI(JComboBox<String> boxTipoSimulacionPRI) {
        this.boxTipoSimulacionPRI = boxTipoSimulacionPRI;
    }

    public JComboBox<String> getBoxTipoSimulacionRR() {
        return boxTipoSimulacionRR;
    }

    public void setBoxTipoSimulacionRR(JComboBox<String> boxTipoSimulacionRR) {
        this.boxTipoSimulacionRR = boxTipoSimulacionRR;
    }

    public JComboBox<String> getBoxTipoSimulacionTMC() {
        return boxTipoSimulacionTMC;
    }

    public void setBoxTipoSimulacionTMC(JComboBox<String> boxTipoSimulacionTMC) {
        this.boxTipoSimulacionTMC = boxTipoSimulacionTMC;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnCrearProceso = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtNProceso = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaListaProcesos = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaListaRecursos = new javax.swing.JTextArea();
        btnModificarProceso = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNombreProceso = new javax.swing.JTextField();
        btnEliminarProceso = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtPrioridadProceso = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTipoProceso = new javax.swing.JTextField();
        btnConsultarProceso = new javax.swing.JButton();
        btnAgregarProceso = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtUTiempoProceso = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtUMemProceso = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtUCPUProceso = new javax.swing.JTextField();
        btnAsignarRecursosProceso = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnCrearMaquina = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtNMaquina = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        btnModificarMaquina = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txtNombreMaquina = new javax.swing.JTextField();
        btnEliminarMaquina = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        txtTiempoInicio = new javax.swing.JTextField();
        btnConsultarMaquina = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        txtUMemMaquina = new javax.swing.JTextField();
        btnAgregarMaquina = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtUCPUMaquina = new javax.swing.JTextField();
        btnAsignarRecursosMaquina = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtAreaListaMaquina = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaListaRecursosMaquina = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        panel_botones_algoritmos = new javax.swing.JPanel();
        btnTMC = new javax.swing.JButton();
        btnODL = new javax.swing.JButton();
        btnRR = new javax.swing.JButton();
        btnPRI = new javax.swing.JButton();
        btnIniciar = new javax.swing.JButton();
        btnParar = new javax.swing.JButton();
        panel_parent = new javax.swing.JPanel();
        panel_TMC = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtAreaListaTablaEstadosTMC = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtAreaListarRecursosMaquinasTMC = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtAreaMemoriaMaquinasTMC = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        boxTipoSimulacionTMC = new javax.swing.JComboBox<>();
        panel_ODL = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtAreaListaTablaEstadosODL = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtAreaListarRecursosMaquinasODL = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtAreaMemoriaMaquinasODL = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        boxTipoSimulacionODL = new javax.swing.JComboBox<>();
        panel_PRI = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        txtAreaListaTablaEstadosPRI = new javax.swing.JTextArea();
        jScrollPane12 = new javax.swing.JScrollPane();
        txtAreaListarRecursosMaquinasPRI = new javax.swing.JTextArea();
        jScrollPane13 = new javax.swing.JScrollPane();
        txtAreaMemoriaMaquinasPRI = new javax.swing.JTextArea();
        jLabel21 = new javax.swing.JLabel();
        boxTipoSimulacionPRI = new javax.swing.JComboBox<>();
        panel_RR = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        txtAreaListaTablaEstadosRR = new javax.swing.JTextArea();
        boxTipoSimulacionRR = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Datos de Procesos");

        btnCrearProceso.setText("Crear");
        btnCrearProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearProcesoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("#Proceso:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Lista Procesos");

        txtAreaListaProcesos.setColumns(20);
        txtAreaListaProcesos.setRows(5);
        jScrollPane2.setViewportView(txtAreaListaProcesos);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Lista Recursos Requeridos");

        txtAreaListaRecursos.setColumns(20);
        txtAreaListaRecursos.setRows(5);
        jScrollPane1.setViewportView(txtAreaListaRecursos);

        btnModificarProceso.setText("Modificar");
        btnModificarProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarProcesoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Nombre:");

        txtNombreProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreProcesoActionPerformed(evt);
            }
        });

        btnEliminarProceso.setText("Eliminar");
        btnEliminarProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProcesoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Prioridad:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Tipo:");

        btnConsultarProceso.setText("Consultar");
        btnConsultarProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarProcesoActionPerformed(evt);
            }
        });

        btnAgregarProceso.setText("Agregar");
        btnAgregarProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProcesoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("UTiempo:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("UMem:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("UCPU:");

        btnAsignarRecursosProceso.setText("Asignar Recursos");
        btnAsignarRecursosProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarRecursosProcesoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnModificarProceso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombreProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAgregarProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnConsultarProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCrearProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEliminarProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPrioridadProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTipoProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtUTiempoProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtUMemProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtUCPUProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnAsignarRecursosProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(14, 14, 14)))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(btnCrearProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnModificarProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txtNombreProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminarProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txtPrioridadProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtTipoProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(btnConsultarProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnAgregarProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtUTiempoProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtUMemProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtUCPUProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAsignarRecursosProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Procesos", jPanel1);

        btnCrearMaquina.setBackground(new java.awt.Color(153, 153, 255));
        btnCrearMaquina.setText("Crear");
        btnCrearMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearMaquinaActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Datos de Máquina");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("#Maquina:");

        btnModificarMaquina.setBackground(new java.awt.Color(153, 153, 255));
        btnModificarMaquina.setText("Modificar");
        btnModificarMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarMaquinaActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Nombre:");

        txtNombreMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreMaquinaActionPerformed(evt);
            }
        });

        btnEliminarMaquina.setBackground(new java.awt.Color(153, 153, 255));
        btnEliminarMaquina.setText("Eliminar");
        btnEliminarMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarMaquinaActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("Tiempo Inicio:");

        btnConsultarMaquina.setBackground(new java.awt.Color(153, 153, 255));
        btnConsultarMaquina.setText("Consultar");
        btnConsultarMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarMaquinaActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setText("UMem:");

        btnAgregarMaquina.setBackground(new java.awt.Color(153, 153, 255));
        btnAgregarMaquina.setText("Agregar");
        btnAgregarMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMaquinaActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("UCPU:");

        btnAsignarRecursosMaquina.setBackground(new java.awt.Color(153, 153, 255));
        btnAsignarRecursosMaquina.setText("Asignar Recursos");
        btnAsignarRecursosMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarRecursosMaquinaActionPerformed(evt);
            }
        });

        txtAreaListaMaquina.setColumns(20);
        txtAreaListaMaquina.setRows(5);
        jScrollPane4.setViewportView(txtAreaListaMaquina);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Lista Máquinas");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Lista Recursos (DISP)");

        txtAreaListaRecursosMaquina.setColumns(20);
        txtAreaListaRecursosMaquina.setRows(5);
        jScrollPane3.setViewportView(txtAreaListaRecursosMaquina);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnConsultarMaquina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEliminarMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTiempoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnCrearMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnModificarMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAgregarMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, Short.MAX_VALUE)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNombreMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnAsignarRecursosMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtNMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtUCPUMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtUMemMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13)
                                .addGap(37, 37, 37))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(539, 539, 539)))
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15)
                                    .addComponent(btnCrearMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnModificarMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16)
                                    .addComponent(txtNombreMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnEliminarMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17)
                                    .addComponent(txtTiempoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtUMemMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(txtUCPUMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnAsignarRecursosMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13)
                                .addGap(297, 297, 297))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(btnConsultarMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnAgregarMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(196, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Máquinas", jPanel2);

        jPanel4.setBackground(new java.awt.Color(0, 51, 204));
        jPanel4.setLayout(null);

        panel_botones_algoritmos.setBackground(new java.awt.Color(102, 153, 255));
        panel_botones_algoritmos.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(153, 153, 153)));
        panel_botones_algoritmos.setForeground(new java.awt.Color(255, 255, 255));

        btnTMC.setBackground(new java.awt.Color(204, 204, 255));
        btnTMC.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        btnTMC.setForeground(new java.awt.Color(0, 0, 0));
        btnTMC.setText("Tiempo + Corto");
        btnTMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTMCActionPerformed(evt);
            }
        });

        btnODL.setBackground(new java.awt.Color(222, 69, 18));
        btnODL.setFont(new java.awt.Font("Dubai Medium", 1, 12)); // NOI18N
        btnODL.setForeground(new java.awt.Color(255, 255, 255));
        btnODL.setText("Orden de Llegada");
        btnODL.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnODL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnODLActionPerformed(evt);
            }
        });

        btnRR.setBackground(new java.awt.Color(204, 204, 255));
        btnRR.setText("Round Robin");

        btnPRI.setBackground(new java.awt.Color(204, 204, 255));
        btnPRI.setText("Prioridad");

        btnIniciar.setText("Iniciar");

        btnParar.setText("Parar");

        javax.swing.GroupLayout panel_botones_algoritmosLayout = new javax.swing.GroupLayout(panel_botones_algoritmos);
        panel_botones_algoritmos.setLayout(panel_botones_algoritmosLayout);
        panel_botones_algoritmosLayout.setHorizontalGroup(
            panel_botones_algoritmosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_botones_algoritmosLayout.createSequentialGroup()
                .addGroup(panel_botones_algoritmosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_botones_algoritmosLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(panel_botones_algoritmosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnPRI, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRR, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnODL, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTMC, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_botones_algoritmosLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnParar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        panel_botones_algoritmosLayout.setVerticalGroup(
            panel_botones_algoritmosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_botones_algoritmosLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnODL, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTMC, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRR, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPRI, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                .addGroup(panel_botones_algoritmosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIniciar)
                    .addComponent(btnParar))
                .addGap(41, 41, 41))
        );

        jPanel4.add(panel_botones_algoritmos);
        panel_botones_algoritmos.setBounds(0, 0, 270, 480);

        panel_parent.setLayout(new java.awt.CardLayout());

        panel_TMC.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 204)));

        txtAreaListaTablaEstadosTMC.setColumns(20);
        txtAreaListaTablaEstadosTMC.setRows(5);
        jScrollPane8.setViewportView(txtAreaListaTablaEstadosTMC);

        txtAreaListarRecursosMaquinasTMC.setColumns(20);
        txtAreaListarRecursosMaquinasTMC.setRows(5);
        jScrollPane9.setViewportView(txtAreaListarRecursosMaquinasTMC);

        txtAreaMemoriaMaquinasTMC.setColumns(20);
        txtAreaMemoriaMaquinasTMC.setRows(5);
        jScrollPane10.setViewportView(txtAreaMemoriaMaquinasTMC);

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Mapa Memoria");

        boxTipoSimulacionTMC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Simulación Estática", "Simulación Dinámica" }));
        boxTipoSimulacionTMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxTipoSimulacionTMCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_TMCLayout = new javax.swing.GroupLayout(panel_TMC);
        panel_TMC.setLayout(panel_TMCLayout);
        panel_TMCLayout.setHorizontalGroup(
            panel_TMCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_TMCLayout.createSequentialGroup()
                .addGroup(panel_TMCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_TMCLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(187, 187, 187))
                    .addGroup(panel_TMCLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(panel_TMCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane10)
                            .addGroup(panel_TMCLayout.createSequentialGroup()
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_TMCLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(boxTipoSimulacionTMC, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163))
        );
        panel_TMCLayout.setVerticalGroup(
            panel_TMCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_TMCLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(boxTipoSimulacionTMC, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(panel_TMCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        panel_parent.add(panel_TMC, "card3");

        panel_ODL.setBackground(new java.awt.Color(0, 51, 204));
        panel_ODL.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(153, 153, 153)));

        txtAreaListaTablaEstadosODL.setColumns(20);
        txtAreaListaTablaEstadosODL.setRows(5);
        jScrollPane5.setViewportView(txtAreaListaTablaEstadosODL);

        txtAreaListarRecursosMaquinasODL.setColumns(20);
        txtAreaListarRecursosMaquinasODL.setRows(5);
        jScrollPane6.setViewportView(txtAreaListarRecursosMaquinasODL);

        txtAreaMemoriaMaquinasODL.setColumns(20);
        txtAreaMemoriaMaquinasODL.setRows(5);
        jScrollPane7.setViewportView(txtAreaMemoriaMaquinasODL);

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Mapa Memoria");

        boxTipoSimulacionODL.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Simulación Estática", "Simulación Dinámica" }));
        boxTipoSimulacionODL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxTipoSimulacionODLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_ODLLayout = new javax.swing.GroupLayout(panel_ODL);
        panel_ODL.setLayout(panel_ODLLayout);
        panel_ODLLayout.setHorizontalGroup(
            panel_ODLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_ODLLayout.createSequentialGroup()
                .addGroup(panel_ODLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_ODLLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(187, 187, 187))
                    .addGroup(panel_ODLLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(panel_ODLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane7)
                            .addGroup(panel_ODLLayout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_ODLLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(boxTipoSimulacionODL, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163))
        );
        panel_ODLLayout.setVerticalGroup(
            panel_ODLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ODLLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(boxTipoSimulacionODL, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(panel_ODLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        panel_parent.add(panel_ODL, "card2");

        panel_PRI.setBackground(new java.awt.Color(51, 51, 255));

        txtAreaListaTablaEstadosPRI.setColumns(20);
        txtAreaListaTablaEstadosPRI.setRows(5);
        jScrollPane11.setViewportView(txtAreaListaTablaEstadosPRI);

        txtAreaListarRecursosMaquinasPRI.setColumns(20);
        txtAreaListarRecursosMaquinasPRI.setRows(5);
        jScrollPane12.setViewportView(txtAreaListarRecursosMaquinasPRI);

        txtAreaMemoriaMaquinasPRI.setColumns(20);
        txtAreaMemoriaMaquinasPRI.setRows(5);
        jScrollPane13.setViewportView(txtAreaMemoriaMaquinasPRI);

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Mapa Memoria");

        boxTipoSimulacionPRI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Simulación Estática", "Simulación Dinámica" }));
        boxTipoSimulacionPRI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxTipoSimulacionPRIActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_PRILayout = new javax.swing.GroupLayout(panel_PRI);
        panel_PRI.setLayout(panel_PRILayout);
        panel_PRILayout.setHorizontalGroup(
            panel_PRILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_PRILayout.createSequentialGroup()
                .addGroup(panel_PRILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_PRILayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(187, 187, 187))
                    .addGroup(panel_PRILayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(panel_PRILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane13)
                            .addGroup(panel_PRILayout.createSequentialGroup()
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_PRILayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(boxTipoSimulacionPRI, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(169, 169, 169))
        );
        panel_PRILayout.setVerticalGroup(
            panel_PRILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_PRILayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(boxTipoSimulacionPRI, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(panel_PRILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        panel_parent.add(panel_PRI, "card4");

        txtAreaListaTablaEstadosRR.setColumns(20);
        txtAreaListaTablaEstadosRR.setRows(5);
        jScrollPane14.setViewportView(txtAreaListaTablaEstadosRR);

        boxTipoSimulacionRR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Simulación Estática", "Simulación Dinámica" }));
        boxTipoSimulacionRR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxTipoSimulacionRRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_RRLayout = new javax.swing.GroupLayout(panel_RR);
        panel_RR.setLayout(panel_RRLayout);
        panel_RRLayout.setHorizontalGroup(
            panel_RRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_RRLayout.createSequentialGroup()
                .addGroup(panel_RRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_RRLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_RRLayout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(boxTipoSimulacionRR, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_RRLayout.setVerticalGroup(
            panel_RRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_RRLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(boxTipoSimulacionRR, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
        );

        panel_parent.add(panel_RR, "card5");

        jPanel4.add(panel_parent);
        panel_parent.setBounds(280, 0, 560, 480);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 845, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 845, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 564, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Algoritmos", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearMaquinaActionPerformed

    }//GEN-LAST:event_btnCrearMaquinaActionPerformed

    private void btnModificarMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarMaquinaActionPerformed

    }//GEN-LAST:event_btnModificarMaquinaActionPerformed

    private void txtNombreMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreMaquinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreMaquinaActionPerformed

    private void btnEliminarMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarMaquinaActionPerformed

    }//GEN-LAST:event_btnEliminarMaquinaActionPerformed

    private void btnConsultarMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarMaquinaActionPerformed

    }//GEN-LAST:event_btnConsultarMaquinaActionPerformed

    private void btnAgregarMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMaquinaActionPerformed

    }//GEN-LAST:event_btnAgregarMaquinaActionPerformed

    private void btnAsignarRecursosMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarRecursosMaquinaActionPerformed

    }//GEN-LAST:event_btnAsignarRecursosMaquinaActionPerformed

    private void btnCrearProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearProcesoActionPerformed

    }//GEN-LAST:event_btnCrearProcesoActionPerformed

    private void btnModificarProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarProcesoActionPerformed

    }//GEN-LAST:event_btnModificarProcesoActionPerformed

    private void txtNombreProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreProcesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreProcesoActionPerformed

    private void btnEliminarProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProcesoActionPerformed

    }//GEN-LAST:event_btnEliminarProcesoActionPerformed

    private void btnConsultarProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarProcesoActionPerformed

    }//GEN-LAST:event_btnConsultarProcesoActionPerformed

    private void btnAgregarProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProcesoActionPerformed

    }//GEN-LAST:event_btnAgregarProcesoActionPerformed

    private void btnAsignarRecursosProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarRecursosProcesoActionPerformed

    }//GEN-LAST:event_btnAsignarRecursosProcesoActionPerformed

    private void btnTMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTMCActionPerformed

    }//GEN-LAST:event_btnTMCActionPerformed

    private void btnODLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnODLActionPerformed

    }//GEN-LAST:event_btnODLActionPerformed

    private void boxTipoSimulacionRRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxTipoSimulacionRRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxTipoSimulacionRRActionPerformed

    private void boxTipoSimulacionTMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxTipoSimulacionTMCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxTipoSimulacionTMCActionPerformed

    private void boxTipoSimulacionODLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxTipoSimulacionODLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxTipoSimulacionODLActionPerformed

    private void boxTipoSimulacionPRIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxTipoSimulacionPRIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxTipoSimulacionPRIActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxTipoSimulacionODL;
    private javax.swing.JComboBox<String> boxTipoSimulacionPRI;
    private javax.swing.JComboBox<String> boxTipoSimulacionRR;
    private javax.swing.JComboBox<String> boxTipoSimulacionTMC;
    private javax.swing.JButton btnAgregarMaquina;
    private javax.swing.JButton btnAgregarProceso;
    private javax.swing.JButton btnAsignarRecursosMaquina;
    private javax.swing.JButton btnAsignarRecursosProceso;
    private javax.swing.JButton btnConsultarMaquina;
    private javax.swing.JButton btnConsultarProceso;
    private javax.swing.JButton btnCrearMaquina;
    private javax.swing.JButton btnCrearProceso;
    private javax.swing.JButton btnEliminarMaquina;
    private javax.swing.JButton btnEliminarProceso;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnModificarMaquina;
    private javax.swing.JButton btnModificarProceso;
    private javax.swing.JButton btnODL;
    private javax.swing.JButton btnPRI;
    private javax.swing.JButton btnParar;
    private javax.swing.JButton btnRR;
    private javax.swing.JButton btnTMC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel panel_ODL;
    private javax.swing.JPanel panel_PRI;
    private javax.swing.JPanel panel_RR;
    private javax.swing.JPanel panel_TMC;
    private javax.swing.JPanel panel_botones_algoritmos;
    private javax.swing.JPanel panel_parent;
    private javax.swing.JTextArea txtAreaListaMaquina;
    private javax.swing.JTextArea txtAreaListaProcesos;
    private javax.swing.JTextArea txtAreaListaRecursos;
    private javax.swing.JTextArea txtAreaListaRecursosMaquina;
    private javax.swing.JTextArea txtAreaListaTablaEstadosODL;
    private javax.swing.JTextArea txtAreaListaTablaEstadosPRI;
    private javax.swing.JTextArea txtAreaListaTablaEstadosRR;
    private javax.swing.JTextArea txtAreaListaTablaEstadosTMC;
    private javax.swing.JTextArea txtAreaListarRecursosMaquinasODL;
    private javax.swing.JTextArea txtAreaListarRecursosMaquinasPRI;
    private javax.swing.JTextArea txtAreaListarRecursosMaquinasTMC;
    private javax.swing.JTextArea txtAreaMemoriaMaquinasODL;
    private javax.swing.JTextArea txtAreaMemoriaMaquinasPRI;
    private javax.swing.JTextArea txtAreaMemoriaMaquinasTMC;
    private javax.swing.JTextField txtNMaquina;
    private javax.swing.JTextField txtNProceso;
    private javax.swing.JTextField txtNombreMaquina;
    private javax.swing.JTextField txtNombreProceso;
    private javax.swing.JTextField txtPrioridadProceso;
    private javax.swing.JTextField txtTiempoInicio;
    private javax.swing.JTextField txtTipoProceso;
    private javax.swing.JTextField txtUCPUMaquina;
    private javax.swing.JTextField txtUCPUProceso;
    private javax.swing.JTextField txtUMemMaquina;
    private javax.swing.JTextField txtUMemProceso;
    private javax.swing.JTextField txtUTiempoProceso;
    // End of variables declaration//GEN-END:variables
}
