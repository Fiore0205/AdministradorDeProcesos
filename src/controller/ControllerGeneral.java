/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import model.AdministradorProcesos;
import view.GUIAdministradorProcesos;
import view.GUIRecurso;

/**
 *
 * @author fioli
 */
public class ControllerGeneral implements ActionListener {

    AdministradorProcesos administradorP;
    GUIAdministradorProcesos guiAdmin;
    ControllerRecurso controllerR;
    private int contador;
    private boolean procesoAsignado;
    private boolean maquinaCreada;
    private Timer timer;
    private int tiempoSimulacion;
    private boolean ejecutando;
    private int algoritmoPlActual;
    private boolean esDinamico;
    private int tamanioLista;
    private boolean esEstatico;

    public ControllerGeneral() {
        administradorP = new AdministradorProcesos();
        guiAdmin = new GUIAdministradorProcesos();
        contador = 0;
        procesoAsignado = false;
        maquinaCreada = false;
        ejecutando = false;
        tiempoSimulacion = 0;
        algoritmoPlActual = 0;
        esDinamico = false;
        initEvents();
        guiAdmin.setVisible(true);
    }

    public void initEvents() {
        // ---------- PROCESOS ----------
        guiAdmin.getBtnAsignarRecursosProceso().addActionListener(this);
        guiAdmin.getBtnCrearProceso().addActionListener(this);
        guiAdmin.getBtnModificarProceso().addActionListener(this);
        guiAdmin.getBtnEliminarProceso().addActionListener(this);
        guiAdmin.getBtnConsultarProceso().addActionListener(this);
        guiAdmin.getBtnAgregarProceso().addActionListener(this);

        // ---------- MAQUINAS ----------
        guiAdmin.getBtnCrearMaquina().addActionListener(this);
        guiAdmin.getBtnModificarMaquina().addActionListener(this);
        guiAdmin.getBtnEliminarMaquina().addActionListener(this);
        guiAdmin.getBtnConsultarMaquina().addActionListener(this);
        guiAdmin.getBtnAgregarMaquina().addActionListener(this);
        guiAdmin.getBtnAsignarRecursosMaquina().addActionListener(this);

        // ---------- ORDEN DE LLEGADA --------
        guiAdmin.getBtnODL().addActionListener(this);

        // ---------- PRIORIDAD --------
        guiAdmin.getBtnPRI().addActionListener(this);

        // ---------- TIEMPO + CORTO --------
        guiAdmin.getBtnTMC().addActionListener(this);

        // ---------- Botones de parar e iniciar --------
        guiAdmin.getBtnIniciar().addActionListener(this);
        guiAdmin.getBtnParar().addActionListener(this);

        // ---------- Round Robin --------
        guiAdmin.getBtnRR().addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == guiAdmin.getBtnAsignarRecursosProceso()) {
            if (!procesoAsignado) {
                JOptionPane.showMessageDialog(guiAdmin,
                        "Debe asignar recursos antes de crear un proceso.");
                return;
            }
            pedirCantidadRecursos();
            asignarRecursos();
        }
        if (e.getSource() == guiAdmin.getBtnCrearProceso()) {
            crearProceso();
        }
        if (e.getSource() == guiAdmin.getBtnModificarProceso()) {
            modificarProceso();
        }
        if (e.getSource() == guiAdmin.getBtnEliminarProceso()) {
            eliminarProceso();
        }
        if (e.getSource() == guiAdmin.getBtnConsultarProceso()) {
            consultarProceso();
        }
        if (e.getSource() == guiAdmin.getBtnAgregarProceso()) {
            agregarProcesoALista();
        }

        // ---------- MAQUINAS ----------
        if (e.getSource() == guiAdmin.getBtnCrearMaquina()) {
            crearMaquina();
        }
        if (e.getSource() == guiAdmin.getBtnModificarMaquina()) {
            modificarMaquina();
        }
        if (e.getSource() == guiAdmin.getBtnEliminarMaquina()) {
            eliminarMaquina();
        }
        if (e.getSource() == guiAdmin.getBtnConsultarMaquina()) {
            consultarMaquina();
        }
        if (e.getSource() == guiAdmin.getBtnAgregarMaquina()) {
            agregarMaquinaALista();
        }
        if (e.getSource() == guiAdmin.getBtnAsignarRecursosMaquina()) {
            asignarRecursosMaquina();
        }

        // ---------- ORDEN DE LLEGADA ----------
        if (e.getSource() == guiAdmin.getBtnODL()) {
            algoritmoPlActual = 0;
            cambioDePanel(0);
        }

        // ---------- PRIORIDAD ----------
        if (e.getSource() == guiAdmin.getBtnPRI()) {
            algoritmoPlActual = 2;
            //esDinamico = guiAdmin.getBoxTipoSimulacionPRI().getSelectedItem().toString().equals("Simulación Dinámica");
            cambioDePanel(2);
        }

        // ---------- TMC ----------
        if (e.getSource() == guiAdmin.getBtnTMC()) {
            algoritmoPlActual = 1;
            cambioDePanel(1);
        }

        // ---------- ROUND ROBIN ----------
        if (e.getSource() == guiAdmin.getBtnRR()) {
            algoritmoPlActual = 3;
            cambioDePanel(3);
        }

        // ---------- BOTON INICIAR ----------
        if (e.getSource() == guiAdmin.getBtnIniciar()) {
            inicializarSimulacionYAlgoritmo(algoritmoPlActual);
        }

        // ---------- BOTON PARAR ----------
        if (e.getSource() == guiAdmin.getBtnParar()) {
            detenerTimer();
        }

    }

    public void pedirCantidadRecursos() {
        String cantidad = JOptionPane.showInputDialog(
                guiAdmin,
                "¿Cuántos recursos desea ingresar?",
                "Cantidad de Recursos",
                JOptionPane.QUESTION_MESSAGE
        );
        if (cantidad == null) {
            contador = 0;
            return;
        }
        try {
            contador = Integer.parseInt(cantidad.trim());
            if (contador <= 0) {
                JOptionPane.showMessageDialog(guiAdmin, "Debe ingresar un número entero mayor que 0.");
                contador = 0;
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(guiAdmin, "Debe ingresar un número válido.");
            contador = 0;
        }
    }

    public void asignarRecursos() {
        if (contador <= 0) {
            return;
        }
        for (int i = 0; i < contador; i++) {
            new ControllerRecurso(administradorP, 1);
        }
        contador = 0;
        procesoAsignado = false;
        listarRecursosRequeridos();
    }

    //---- METODOS DE LIMPIAR ----
    public void limpiarCampos() {
        guiAdmin.setTxtNProceso("");
        guiAdmin.setTxtNombreProceso("");
        guiAdmin.setTxtPrioridadProceso("");
        guiAdmin.setTxtTipoProceso("");
        guiAdmin.setTxtUTiempoProceso("");
        guiAdmin.setTxtUMemProceso("");
        guiAdmin.setTxtUCPUProceso("");
    }

    public void limpiarCamposMaquina() {
        guiAdmin.setTxtNMaquina("");
        guiAdmin.setTxtNombreMaquina("");
        guiAdmin.setTxtTiempoInicio("");
        guiAdmin.setTxtUMemMaquina("");
        guiAdmin.setTxtUCPUMaquina("");
    }

    // --- METODOS DE BOTONES DE PROCESOS ---
    public void crearProceso() {
        int nProceso = Integer.parseInt(guiAdmin.getTxtNProceso());
        String nombre = guiAdmin.getTxtNombreProceso();
        int prioridad = Integer.parseInt(guiAdmin.getTxtPrioridadProceso());
        int tipo = Integer.parseInt(guiAdmin.getTxtTipoProceso());
        int unidadesTiempo = Integer.parseInt(guiAdmin.getTxtUTiempoProceso());
        int unidadesMem = Integer.parseInt(guiAdmin.getTxtUMemProceso());
        int unidadesCpu = Integer.parseInt(guiAdmin.getTxtUCPUProceso());

        administradorP.crearProceso(nProceso, nombre, prioridad, tipo, unidadesTiempo, unidadesMem, unidadesCpu);
        procesoAsignado = true;
        listarProceso();
    }

    public void modificarProceso() {
        administradorP.modificarProceso(guiAdmin.getTxtNProceso(), guiAdmin.getTxtNombreProceso(),
                guiAdmin.getTxtPrioridadProceso(), guiAdmin.getTxtTipoProceso(), guiAdmin.getTxtUTiempoProceso(),
                guiAdmin.getTxtUMemProceso(), guiAdmin.getTxtUCPUProceso());
        listarRecursosRequeridos(Integer.parseInt(guiAdmin.getTxtNProceso()));
        limpiarCampos();
        listarProcesos();
    }

    public void eliminarProceso() {
        int nProceso = Integer.parseInt(guiAdmin.getTxtNProceso());
        administradorP.eliminarProceso(nProceso);
        limpiarCampos();
        listarProcesos();
    }

    public void consultarProceso() {
        int nProceso = Integer.parseInt(guiAdmin.getTxtNProceso());
        guiAdmin.setTxtAreaListaProcesos(administradorP.consultarProceso(nProceso));
        listarRecursosRequeridos(nProceso);
        limpiarCampos();
    }

    public void agregarProcesoALista() {
        administradorP.agregarProceso();
        limpiarCampos();
        listarProcesos();
    }

    // --- METODOS DE TXT AREAS DE PROCESOS ---
    public void listarProcesos() {
        guiAdmin.setTxtAreaListaProcesos(administradorP.listarProcesosDetalle());
    }

    public void listarRecursosRequeridos() {
        guiAdmin.setTxtAreaListaRecursos(administradorP.listarRecursosRequeridos());
    }

    public void listarRecursosRequeridos(int nProceso) {
        guiAdmin.setTxtAreaListaRecursos(administradorP.listarRecursosRequeridos(nProceso));
    }

    public void listarProceso() {
        guiAdmin.setTxtAreaListaProcesos(administradorP.listarProcesoDetalle());
    }

    public void listarMaquinas() {
        guiAdmin.setTxtAreaListaMaquina(administradorP.listarMaquinasDetalle());
    }

    public void listarMaquina() {
        guiAdmin.setTxtAreaListaMaquina(administradorP.detalleMaquina());
    }

    public void listarRecursosMaquina() {
        guiAdmin.setTxtAreaListaRecursosMaquina(administradorP.listarRecursosDisponibles());
    }

    public void listarRecursosMaquina(int nMaquina) {
        guiAdmin.setTxtAreaListaRecursosMaquina(administradorP.listarRecursosMaquina(nMaquina));
    }

    // =============================== MAQUINAS ==================================
    public void crearMaquina() {

        int id = Integer.parseInt(guiAdmin.getTxtNMaquina());
        String nombre = guiAdmin.getTxtNombreMaquina();
        int tiempo = Integer.parseInt(guiAdmin.getTxtTiempoInicio());
        int memoria = Integer.parseInt(guiAdmin.getTxtUMemMaquina());
        int cpu = Integer.parseInt(guiAdmin.getTxtUCPUMaquina());

        administradorP.crearMaquina(id, nombre, tiempo, memoria, cpu);

        maquinaCreada = true;

        listarMaquina();
    }

    public void modificarMaquina() {
        administradorP.modificarMaquina(
                guiAdmin.getTxtNMaquina(),
                guiAdmin.getTxtNombreMaquina(), guiAdmin.getTxtTiempoInicio(), guiAdmin.getTxtUMemMaquina(),
                guiAdmin.getTxtUCPUMaquina());
        listarRecursosMaquina(Integer.parseInt(guiAdmin.getTxtNMaquina()));
        listarMaquinas();
        limpiarCamposMaquina();
    }

    public void eliminarMaquina() {
        administradorP.eliminarMaquina(Integer.parseInt(guiAdmin.getTxtNMaquina()));
        limpiarCamposMaquina();
        listarMaquinas();
    }

    public void consultarMaquina() {
        int nMaquina = Integer.parseInt(guiAdmin.getTxtNMaquina());
        guiAdmin.setTxtAreaListaMaquina(administradorP.consultarMaquina(nMaquina));
        listarRecursosMaquina(nMaquina);
        limpiarCamposMaquina();
    }

    public void agregarMaquinaALista() {
        administradorP.agregarMaquina();
        limpiarCamposMaquina();
        listarMaquinas();
    }

    public void asignarRecursosMaquina() {
        if (!maquinaCreada) {
            JOptionPane.showMessageDialog(guiAdmin,
                    "Debe crear una máquina antes de asignar recursos.");
            return;
        }
        pedirCantidadRecursos();
        for (int i = 0; i < contador; i++) {
            new ControllerRecurso(administradorP, 2); // ya tienes método para asignar a máquina
        }
        contador = 0;
        maquinaCreada = false;
        listarRecursosMaquina();
    }

    public void iniciarTimer(final int tipoAlgoritmo) {

        // Si ya está corriendo, no hagas nada
        if (ejecutando) {
            JOptionPane.showMessageDialog(guiAdmin, "La simulación ya está en curso.");
            return;
        }

        // Si había un timer anterior, lo detenemos y lo reemplazamos
        if (timer != null) {
            timer.stop();
        }

        ejecutando = true;
        tiempoSimulacion = 0;

        // 🔹 Nuevo Timer, ligado al tipo de algoritmo actual
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                boolean terminado;

                // RR usa su propio método
                if (tipoAlgoritmo == 3) {
                    terminado = administradorP.ejecutarPasoRR();
                } else {
                    terminado = administradorP.ejecutarPaso();
                }
                
                // Actualizar las áreas de texto de la GUI
                listarTipoDeAlgoritmo(tipoAlgoritmo);

                tiempoSimulacion++;

                if (terminado) {
                    timer.stop();
                    ejecutando = false;
                    JOptionPane.showMessageDialog(guiAdmin, "La simulación ha finalizado.");
                }
            }
        });

        // Ahora sí, arrancamos
        timer.start();
    }

    public void ordenarTipoAlgoritmo(int tipoAlgoritmo) {
        // 1 = TMC  2 = PRI  3 = RR
        if (tipoAlgoritmo == 1) {
            administradorP.ordenarTiempoMasCorto();

        } else if (tipoAlgoritmo == 2) {
            administradorP.ordenarPrioridad();
        } else if (tipoAlgoritmo == 3) {
            String q = JOptionPane.showInputDialog(guiAdmin,
                    "Digite el quantum:", "Quantum RR",
                    JOptionPane.QUESTION_MESSAGE);

            if (q == null || q.trim().isEmpty()) {
                return;
            }

            try {
                int quantum = Integer.parseInt(q.trim());
                administradorP.setQuantum(quantum);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(guiAdmin, "Quantum inválido");
                return;
            }
        }
    }

    public void listarTipoDeAlgoritmo(int tipoAlgoritmo) {
        // 0 = ODL  1 = TMC  2 = PRI
        if (tipoAlgoritmo == 0) {
            // Actualizar tabla en GUI
            guiAdmin.setTxtAreaListaTablaEstadosODL(administradorP.listarTablaDeEstados());

            // Actualizar recursos de máquina
            guiAdmin.setTxtAreaListarRecursosMaquinasODL(administradorP.listarRecursosTodasLasMaquinas());

            // Actualizar memoria de las maquinas
            guiAdmin.setTxtAreaMemoriaMaquinasODL(administradorP.listarMapaMemoria());

        } else if (tipoAlgoritmo == 1) {
            guiAdmin.setTxtAreaListaTablaEstadosTMC(administradorP.listarTablaDeEstados());

            guiAdmin.setTxtAreaListarRecursosMaquinasTMC(administradorP.listarRecursosTodasLasMaquinas());

            guiAdmin.setTxtAreaMemoriaMaquinasTMC(administradorP.listarMapaMemoria());

        } else if (tipoAlgoritmo == 2) {
            guiAdmin.setTxtAreaListaTablaEstadosPRI(administradorP.listarTablaDeEstados());

            guiAdmin.setTxtAreaListarRecursosMaquinasPRI(administradorP.listarRecursosTodasLasMaquinas());

            guiAdmin.setTxtAreaMemoriaMaquinasPRI(administradorP.listarMapaMemoria());

        } else if (tipoAlgoritmo == 3) {
            guiAdmin.setTxtAreaListaTablaEstadosRR(administradorP.listarTablaDeEstados());
        }

    }

    public void cambioDePanel(int tipoAlgoritmo) {
        guiAdmin.getPanel_parent().removeAll();
        // 0 = ODL  1 = TMC  2 = PRI  3 = RR
        if (tipoAlgoritmo == 0) {
            guiAdmin.getPanel_parent().add(guiAdmin.getPanel_ODL());
        } else if (tipoAlgoritmo == 1) {
            guiAdmin.getPanel_parent().add(guiAdmin.getPanel_TMC());
        } else if (tipoAlgoritmo == 2) {
            guiAdmin.getPanel_parent().add(guiAdmin.getPanel_PRI());
        } else if (tipoAlgoritmo == 3) {
            guiAdmin.getPanel_parent().add(guiAdmin.getPanel_RR());
        }
        guiAdmin.getPanel_parent().repaint();
        guiAdmin.getPanel_parent().revalidate();
    }

    public void detenerTimer() {
        if (timer != null && ejecutando) {
            timer.stop();          // Pausa la simulación
            ejecutando = false;    // Indica que YA NO está ejecutando
            JOptionPane.showMessageDialog(guiAdmin, "La simulación se ha detenido.");
        }
    }

    public void inicializarSimulacionYAlgoritmo(int tipoAlgoritmo) {

        administradorP.reiniciarTiempo();
        boolean dinamico = false;

        if (tipoAlgoritmo == 0) {
            dinamico = guiAdmin.getBoxTipoSimulacionODL()
                    .getSelectedItem().toString().equals("Simulación Dinámica");
        } else if (tipoAlgoritmo == 1) {
            dinamico = guiAdmin.getBoxTipoSimulacionTMC()
                    .getSelectedItem().toString().equals("Simulación Dinámica");
        } else if (tipoAlgoritmo == 2) {
            dinamico = guiAdmin.getBoxTipoSimulacionPRI()
                    .getSelectedItem().toString().equals("Simulación Dinámica");
        } else if (tipoAlgoritmo == 3) {
            dinamico = guiAdmin.getBoxTipoSimulacionRR()
                    .getSelectedItem().toString().equals("Simulación Dinámica");
        }

        // ============================
        // MODO ESTÁTICO O DINÁMICO
        // ============================
        if (!dinamico) {
            // MODO ESTÁTICO
            administradorP.prepararModoEstatico();
        } else {
            // MODO DINÁMICO
            administradorP.desactivarModoEstatico();
        }

        // 🔹 IMPORTANTE: ordenar UNA VEZ antes de iniciar el timer
        ordenarTipoAlgoritmo(tipoAlgoritmo);

        // Cambiar panel de la GUI
        cambioDePanel(tipoAlgoritmo);

        // Iniciar el timer para ese algoritmo
        iniciarTimer(tipoAlgoritmo);
    }

}
