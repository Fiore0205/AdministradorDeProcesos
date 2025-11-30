/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author fioli
 */
public class AdministradorProcesos {

    ListaProcesos listaProcesos;
    Proceso proceso;
    private ListaMaquinas listaMaquinas;
    private Maquina maquina;
    private int tiempoActual;
    private int quantum;
    private int indiceRR;  // índice actual de la cola

    // Listas para modo estático
    private ArrayList<Proceso> listaEstaticaProcesos;
    private ArrayList<Maquina> listaEstaticaMaquinas;
    private boolean modoEstatico = false;

    public AdministradorProcesos() {
        listaProcesos = new ListaProcesos();
        listaMaquinas = new ListaMaquinas();
        listaEstaticaProcesos = new ArrayList<>();
        listaEstaticaMaquinas = new ArrayList<>();
        tiempoActual = 0;
    }

    //getters y setters
    public ListaProcesos getListaProcesos() {
        return listaProcesos;
    }

    public void setListaProcesos(ListaProcesos listaProcesos) {
        this.listaProcesos = listaProcesos;
    }

    public Proceso getProceso() {
        return proceso;
    }

    public void setProceso(Proceso proceso) {
        this.proceso = proceso;
    }

    public void setQuantum(int q) {
        this.quantum = q;
        this.indiceRR = 0;  // reset cola circular
    }

    // ============================================================
    // OBTENER LISTAS ACTIVAS SEGÚN MODO (DINÁMICO vs ESTÁTICO)
    // ============================================================
    public ArrayList<Proceso> getListaProcesosActiva() {
        return modoEstatico ? listaEstaticaProcesos : listaProcesos.getLista();
    }

    public ArrayList<Maquina> getListaMaquinasActiva() {
        return modoEstatico ? listaEstaticaMaquinas : listaMaquinas.getLista();
    }

    //------- METODOS DE PROCESOS BOTONES --------------------
    public void crearProceso(int nProceso, String nombre, int prioridad, int tipo, int unidadesTiempo, int unidadesMem,
            int unidadesCpu) {
        proceso = new Proceso(nProceso, nombre, prioridad, tipo, unidadesTiempo, unidadesMem, unidadesCpu);
    }

    public void modificarProceso(String nProceso, String nombre, String prioridad, String tipo, String unidadesTiempo, String unidadesMem,
            String unidadesCpu) {
        listaProcesos.modificarProceso(nProceso, nombre, prioridad, tipo, unidadesTiempo, unidadesMem, unidadesCpu);
    }

    public boolean eliminarProceso(int nProceso) {
        return listaProcesos.eliminarProceso(nProceso);
    }

    public String consultarProceso(int nProceso) {
        return listaProcesos.consultarProceso(nProceso);
    }

    public void agregarProceso() {
        listaProcesos.agregarProceso(proceso);
    }

    public void asignarRecursoAProceso(Recurso r) {
        proceso.asignarRecurso(r);
    }

    //------- METODOS DE PROCESOS LISTAS --------------------
    public String listarProcesosDetalle() { //para cuadro de procesos
        // OJO: esto sigue usando la lista original de ListaProcesos
        // porque es para la sección de "configuración", no para la simulación.
        return listaProcesos.listarProcesosDetalle();
    }

    public String listarRecursosRequeridos() {
        return proceso.listarRecursosRequeridos();
    }

    public String listarProcesoDetalle() {
        return proceso.toStringDetalle();
    }

    public String listarRecursosRequeridos(int nProceso) {
        return listaProcesos.listarRecursosRequeridos(nProceso);
    }

    // ============================================================
    //                    MÉTODOS DE MÁQUINAS
    // ============================================================
    public void crearMaquina(int nMaquina, String nombre,
            int tiempoInicio, int unidadesMemoria, int unidadesCPU) {

        maquina = new Maquina(nMaquina, nombre, tiempoInicio,
                unidadesMemoria, unidadesCPU);
    }

    public void agregarMaquina() {
        listaMaquinas.agregarMaquina(maquina);
    }

    public boolean eliminarMaquina(int nMaquina) {
        return listaMaquinas.eliminarMaquina(nMaquina);
    }

    public void modificarMaquina(String nMaquina, String nuevoNombre,
            String nuevoTiempoInicio, String nuevoUMemoria, String nuevoUCPU) {

        listaMaquinas.modificarMaquina(nMaquina, nuevoNombre,
                nuevoTiempoInicio, nuevoUMemoria, nuevoUCPU);
    }

    public String consultarMaquina(int nMaquina) {
        return listaMaquinas.consultarMaquina(nMaquina);
    }

    public void asignarRecursoAMaquina(Recurso r) {
        maquina.asignarRecurso(r);
    }

    // ----METODOS MAQUINAS LISTAR ----
    public String listarMaquinasDetalle() {
        // Igual que en procesos, esto es más para la parte de configuración,
        // por eso se usa la lista original.
        return listaMaquinas.listarMaquinasDetalle();
    }

    public String detalleMaquina() {
        return maquina.toString();
    }

    public String listarRecursosMaquina(int nMaquina) {
        return listaMaquinas.listarRecursosDisponibles(nMaquina);
    }

    public String listarRecursosDisponibles() {
        return maquina.listarRecursosDisponibles();
    }

    public String listarRecursosTodasLasMaquinas() {
        ArrayList<Maquina> lista = getListaMaquinasActiva();
        String salida = "Lista Recursos T" + tiempoActual + "\n";

        for (Maquina m : lista) {
            salida += m.listarRecursosTabla() + "\n";
        }
        return salida;
    }

    public String listarMapaMemoria() {
        ArrayList<Maquina> lista = getListaMaquinasActiva();
        String salida = "Mapa Memoria T" + tiempoActual + "\n";
        salida += "       " + generarEncabezadoMemoria() + "\n";

        for (Maquina m : lista) {
            salida += m.mostrarMapaMemoria() + "\n\n";
        }
        return salida;
    }

    // ============================================================
    //    Ordenar
    // ============================================================
    public void ordenarPrioridad() {
        listaProcesos.ordenarPrioridad();
    }

    public void ordenarTiempoMasCorto() {
        listaProcesos.ordenarTiempo();
    }

    // ============================================================
    //    TABLA PARA LOS ALGORITMOS DE PLANIFICACION 
    // ============================================================
    public String listarTablaDeEstados() {
        String salida = "Lista Procesos T" + tiempoActual + "\n";

        ArrayList<Proceso> lista = getListaProcesosActiva();

        for (Proceso p : lista) {
            salida += p.procesoTabla() + "\n";
        }

        return salida;
    }

    // ============================================================
    //    MÉTODO PARA BUSCAR LA PRIMERA MÁQUINA DISPONIBLE POR TIEMPO
    // ============================================================
    public Maquina buscarMaquinaValida(Proceso p) {
        ArrayList<Maquina> lista = getListaMaquinasActiva();

        for (Maquina m : lista) {
            if (m.getTiempoInicio() <= tiempoActual) {

                boolean okMem = p.getUnidadesMem() <= m.getUnidadesMemoriaDisponible();

                boolean okRec = true;

                for (Recurso rP : p.getListaRecursosProcesos().getLista()) {
                    Recurso rM = m.getListaRecursoMaquina().buscarPorNombre(rP.getNomRecurso());
                    if (rM == null || rP.getUnidades() > rM.getUdisponibles()) {
                        okRec = false;
                        break;
                    }
                }

                if (okMem && okRec) {
                    return m;   // ESTA máquina sirve
                }
            }
        }

        return null; // ninguna sirve TODAVÍA
    }

    // ============================================================
    //     VALIDAR MEMORIA SOLO CONTRA LA MÁQUINA DISPONIBLE
    // ============================================================
    public boolean validarMemoria(Proceso proceso) {
        Maquina m = buscarMaquinaValida(proceso);
        if (m == null) {
            return false;
        }

        return proceso.getUnidadesMem() <= m.getUnidadesMemoriaDisponible();
    }

    //ASIGNA MEMORIA A LA MAQUINA
    public void asignarMemoriaAProceso(Proceso proceso) {
        Maquina m = proceso.getMaquinaAsignada();

        if (m != null) {
            m.asignarMemoria(proceso.getUnidadesMem());
            m.ocuparMemoriaMapa(proceso);
        }
    }

    // ============================================================
    //    VALIDAR RECURSOS (NOMBRE + UNIDADES) EN LA MÁQUINA DISPONIBLE
    // ============================================================
    public boolean validarRecursos(Proceso proceso) {

        Maquina m = buscarMaquinaValida(proceso);
        if (m == null) {
            return false;
        }

        ArrayList<Recurso> recursosProceso = proceso.getListaRecursosProcesos().getLista();
        ArrayList<Recurso> recursosMaquina = m.getListaRecursoMaquina().getLista();

        for (Recurso rP : recursosProceso) {

            boolean encontrado = false;

            for (Recurso rM : recursosMaquina) {
                if (rP.getNomRecurso().equalsIgnoreCase(rM.getNomRecurso())) {
                    encontrado = true;

                    if (rP.getUnidades() > rM.getUdisponibles()) {
                        return false;
                    }
                    break;
                }
            }

            if (!encontrado) {
                return false;
            }
        }

        return true;
    }

    // --- ASIGNA RECURSOS ---
    public void asignarRecursosAProceso(Proceso proceso) {

        Maquina m = proceso.getMaquinaAsignada();
        if (m == null) {
            return;
        }

        ArrayList<Recurso> recursosProceso = proceso.getListaRecursosProcesos().getLista();
        ArrayList<Recurso> recursosMaquina = m.getListaRecursoMaquina().getLista();

        for (Recurso rP : recursosProceso) {

            for (Recurso rM : recursosMaquina) {

                if (rP.getNomRecurso().equalsIgnoreCase(rM.getNomRecurso())) {

                    rM.asignarRecurso(rP.getUnidades());
                }
            }
        }
    }

    // ============================================================
    // CAMBIAR ESTADO DEL PROCESO
    // ============================================================
    public void cambiarEstadoProceso(Proceso proceso, int estado) {
        if (proceso != null) {
            proceso.setEstado(estado);
        }
    }

    // ============================================================
    //  DECREMENTAR TIEMPO RESTANTE DEL PROCESO ACTIVO
    // ============================================================
    public void tiempoProcesoRestante(Proceso proceso) {
        if (proceso == null) {
            return;
        }

        // Solo decrementa si está ACTIVO
        if (proceso.getEstado() == 1 && proceso.getUnidadesTiempoRestante() > 0) {
            proceso.disminuirTiempoRestante();
        }
    }

    // ============================================================
    //      MODO ESTÁTICO: CLONAR LISTAS AL INICIAR LA SIMULACIÓN
    // ============================================================
    public void prepararModoEstatico() {
        modoEstatico = true;

        // Clonar procesos
        listaEstaticaProcesos = new ArrayList<>();
        for (Proceso p : listaProcesos.getLista()) {
            listaEstaticaProcesos.add(p.clonar());
        }

        // Clonar máquinas
        listaEstaticaMaquinas = new ArrayList<>();
        for (Maquina m : listaMaquinas.getLista()) {
            listaEstaticaMaquinas.add(m.clonar());
        }
    }

    // ============================================================
    //   DESACTIVAR MODO ESTÁTICO AL DETENER LA SIMULACIÓN
    // ============================================================
    public void desactivarModoEstatico() {
        modoEstatico = false;
        listaEstaticaProcesos = null;
        listaEstaticaMaquinas = null;
    }

    // ============================================================
    //       MÉTODO PRINCIPAL DE EJECUCIÓN DE PROCESOS (FIFO)
    // ============================================================
    public boolean ejecutarPaso() {

        boolean todosTerminados = true;

        ArrayList<Proceso> lista = getListaProcesosActiva();

        // ===== PASO 1: revisar procesos en tiempo actual =====
        for (Proceso p : lista) {

            // Si está TERMINADO → ignorar
            if (p.getEstado() == 4) {
                continue;
            }

            // Si está BLOQUEADO → volver a revisar si YA puede ejecutarse
            if (p.getEstado() == 3) {

                Maquina nueva = buscarMaquinaValida(p);

                if (nueva != null) {
                    // ✔ DESBLOQUEAR — ahora sí puede ejecutarse
                    p.setEstado(2); // ESPERA
                } else {
                    // ❌ Sigue bloqueado, no continúa
                    continue;
                }
            }

            todosTerminados = false;

            // Si ya no tiene tiempo → TERMINADO
            if (p.getUnidadesTiempoRestante() == 0) {
                cambiarEstadoProceso(p, 4);
                liberarRecursosYMemoria(p);
                continue;
            }

            // Si ya tiene máquina asignada → EJECUTAR
            if (p.getMaquinaAsignada() != null) {
                cambiarEstadoProceso(p, 1);
                tiempoProcesoRestante(p);
                continue;
            }

            // Buscar máquina válida
            Maquina m = buscarMaquinaValida(p);

            if (m == null) {
                cambiarEstadoProceso(p, 2); // ESPERA
                continue;
            }

            // Asignar máquina y ejecutar
            p.setMaquinaAsignada(m);
            asignarMemoriaAProceso(p);
            asignarRecursosAProceso(p);

            cambiarEstadoProceso(p, 1);
            tiempoProcesoRestante(p);
        }

        // Si todos terminaron
        if (todosTerminados) {
            return true;
        }

        // Avanzar tiempo
        tiempoActual++;

        // ===== PASO 2: verificar bloqueados reales =====
        if (todasMaquinasDisponibles()) {

            // AHORA también se usa la lista ACTIVA aquí
            ArrayList<Proceso> todos = getListaProcesosActiva();

            for (Proceso p : todos) {

                if (p.getEstado() == 4 || p.getEstado() == 1) {
                    continue;
                }

                // Si sigue sin poder ejecutarse → BLOQUEADO REAL
                if (cambiarAEstadoBloqueado(p)) {
                    p.setEstado(3); // BLOQUEADO
                }
            }
        }

        return false; // Aún no termina
    }

    private boolean todasMaquinasDisponibles() {
        // 🔹 AHORA usa la lista activa de máquinas
        ArrayList<Maquina> lista = getListaMaquinasActiva();
        if (lista == null || lista.isEmpty()) {
            return false;
        }

        for (Maquina m : lista) {
            // Si alguna máquina todavía tiene tiempoInicio mayor al tiempoActual,
            // significa que aún no todas están disponibles
            if (m.getTiempoInicio() > tiempoActual) {
                return false;
            }
        }
        return true;
    }

    // ============================================================
    //  DETERMINAR SI DEBE PASAR A BLOQUEADO
    // ============================================================
    private boolean cambiarAEstadoBloqueado(Proceso p) {

        // 🔹 AHORA también usa la lista activa de máquinas
        ArrayList<Maquina> lista = getListaMaquinasActiva();

        if (lista == null || lista.isEmpty()) {
            return true;
        }

        // Aquí asumimos que ya todas las máquinas están disponibles
        // (lo controla todasMaquinasDisponibles())
        for (Maquina m : lista) {

            boolean okMem = p.getUnidadesMem() <= m.getUnidadesMemoriaDisponible();
            boolean okRec = true;

            for (Recurso rP : p.getListaRecursosProcesos().getLista()) {
                Recurso rM = m.getListaRecursoMaquina().buscarPorNombre(rP.getNomRecurso());
                if (rM == null || rP.getUnidades() > rM.getUdisponibles()) {
                    okRec = false;
                    break;
                }
            }

            // Si hay AL MENOS una máquina que pueda atenderlo (memoria y recursos),
            // no debe ser bloqueado
            if (okMem && okRec) {
                return false;
            }
        }

        // Ninguna máquina puede correr este proceso → BLOQUEADO
        return true;
    }

    //--- METODO LIBERAR RECURSOS Y MEMORIA ---
    public void liberarRecursosYMemoria(Proceso p) {

        Maquina m = p.getMaquinaAsignada();

        if (m == null) {
            return; // El proceso nunca se ejecutó
        }
        // LIBERAR MEMORIA
        m.liberarMemoria(p.getUnidadesMem());
        m.liberarMemoriaMapa(p);

        // LIBERAR RECURSOS
        for (Recurso rP : p.getListaRecursosProcesos().getLista()) {
            m.getListaRecursoMaquina().liberarRecursoPorNumero(rP.getNrecurso());
        }

        // Remover referencia
        p.setMaquinaAsignada(null);
    }

    public boolean ejecutarPasoRR() {

        // 🔹 AHORA RR también se basa en la lista ACTIVA
        ArrayList<Proceso> lista = getListaProcesosActiva();

        if (lista == null || lista.isEmpty()) {
            return true;
        }

        // 1. Verificar si todos están terminados
        boolean todosTerminados = true;
        for (Proceso p : lista) {
            if (p.getEstado() != 4) {
                todosTerminados = false;
                break;
            }
        }
        if (todosTerminados) {
            return true; // finalizó RR
        }

        // 2. Asegurar cola circular
        if (indiceRR >= lista.size()) {
            indiceRR = 0;
        }

        Proceso p = lista.get(indiceRR);

        // 3. Si está terminado → saltar al siguiente
        if (p.getEstado() == 4) {
            indiceRR++;
            return false;
        }

        // 4. RR puro: ejecutar el proceso SÍ O SÍ (no máquinas)
        p.setEstado(1); // ACTIVO

        int tiempo = p.getUnidadesTiempoRestante();
        int resta = Math.min(quantum, tiempo);

        // Descontar quantum al proceso
        p.setUnidadesTiempoRestante(tiempo - resta);

        // 5. Verificar si terminó
        if (p.getUnidadesTiempoRestante() == 0) {
            p.setEstado(4); // TERMINADO
        } else {
            p.setEstado(2); // ESPERA
        }

        // 6. Avanzar al siguiente proceso
        indiceRR++;

        // 7. Avanzar tiempo global
        tiempoActual++;

        return false; // todavía no termina
    }

    public void insertarProcesoRR(int id) {
        // 🔹 Ahora insertamos sobre la lista ACTIVA de procesos
        ArrayList<Proceso> lista = getListaProcesosActiva();
        Proceso p = listaProcesos.buscarProceso(id);
        if (p != null && lista != null) {
            lista.add(p);
        }
    }

    public void reiniciarTiempo() {
        tiempoActual = 0;
    }

    private String generarEncabezadoMemoria() {
        ArrayList<Maquina> lista = getListaMaquinasActiva();

        int max = 0;
        for (Maquina m : lista) {
            if (m.getUnidadesMemoriaMaquina() > max) {
                max = m.getUnidadesMemoriaMaquina();
            }
        }

        StringBuilder sb = new StringBuilder();

        // Generar números 1..max
        for (int i = 1; i <= max; i++) {
            sb.append(i).append(" ");
        }

        return sb.toString().trim();
    }

    public boolean asignarMemoriaAProceso(Proceso p, Maquina m, int tipoAlgoritmo) {
        ListaParticiones lp = m.getListaParticiones();

        boolean ok = false;

        switch (tipoAlgoritmo) {
            case 0: // DINÁMICO
                ok = lp.asignarParticionDinamica(p);
                break;
            case 1: // PRIMER AJUSTE
                ok = lp.asignarPrimerAjuste(p);
                break;
            case 2: // MEJOR AJUSTE
                ok = lp.asignarMejorAjuste(p);
                break;
            case 3: // PEOR AJUSTE
                ok = lp.asignarPeorAjuste(p);
                break;
        }

        return ok;
    }

    public void liberarMemoriaProceso(Proceso p) {
        Maquina m = p.getMaquinaAsignada();
        if (m == null) {
            return;
        }

        ListaParticiones lp = m.getListaParticiones();

        lp.liberarParticion(p.getNombre());
        lp.fusionarLibres();
        // lp.compactar(); // opcional
    }

}
