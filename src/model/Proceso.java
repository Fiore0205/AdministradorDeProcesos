/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author fioli
 */
public class Proceso {

    // Atributos de un proceso
    private int nProceso;
    private String nombre;
    private int unidadesTiempo;
    private int unidadesTiempoRestante;
    private int unidadesMem;
    private int unidadesCpu;// solo una por proceso
    private ListaRecursos listaRecursosProcesos;
    private int prioridad;
    private int quantium;
    private int estado; //0- Creado, 1- Activo, 2-Espera, 3-Bloqueado, 4-Terminado
    private int tipo;
    private Maquina maquinaAsignada;

    public Proceso() {
        nProceso = 8888;
        nombre = "sNombre";
        unidadesTiempo = 1;
        unidadesMem = 1;
        prioridad = 0;
        quantium = 0;
        listaRecursosProcesos = new ListaRecursos();
        unidadesCpu = 1;

    }

    public Proceso(Proceso nuevo) {
        this.nProceso = nuevo.nProceso;
        this.nombre = nuevo.nombre;
        this.unidadesTiempo = nuevo.unidadesTiempo;
        this.unidadesMem = nuevo.unidadesMem;
        this.unidadesCpu = nuevo.unidadesCpu;
        this.prioridad = nuevo.prioridad;
        this.quantium = nuevo.quantium;
        this.listaRecursosProcesos = nuevo.listaRecursosProcesos;
        this.tipo = nuevo.tipo;
    }

    public Proceso(int nProceso, String nombre, int prioridad, int tipo, int unidadesTiempo, int unidadesMem,
            int unidadesCpu) {
        this.nProceso = nProceso;
        this.nombre = nombre;
        this.unidadesTiempo = unidadesTiempo;
        this.unidadesMem = unidadesMem;
        this.unidadesCpu = 1;
        this.prioridad = prioridad;
        this.quantium = 0;
        this.unidadesCpu = unidadesCpu;
        listaRecursosProcesos = new ListaRecursos(15);
        this.tipo = tipo;
        unidadesTiempoRestante = this.unidadesTiempo;
        estado = 0;
    }

    public void setMaquinaAsignada(Maquina m) {
        this.maquinaAsignada = m;
    }

    public Maquina getMaquinaAsignada() {
        return this.maquinaAsignada;
    }

    public void setNProceso(int nProceso) {
        this.nProceso = nProceso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUnidadesTiempo(int unidadesTiempo) {
        this.unidadesTiempo = unidadesTiempo;
    }

    public void setUnidadesMem(int unidadesMem) {
        this.unidadesMem = unidadesMem;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setQuantium(int quantium) {
        this.quantium = quantium;
    }

    public void setUnidadesCpu(int unidadesCpu) {
        this.unidadesCpu = unidadesCpu;
    }

    public int getNProceso() {
        return this.nProceso;
    }

    public int getUnidadesCpu() {

        return this.unidadesCpu;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getUnidadesTiempo() {
        return this.unidadesTiempo;
    }

    public int getUnidadesMem() {
        return this.unidadesMem;
    }

    public int getPrioridad() {
        return this.prioridad;
    }

    public int getTipo() {
        return this.tipo;
    }

    public int getQuantium() {
        return this.quantium;
    }

    public ListaRecursos getListaRecursosProcesos() {
        return listaRecursosProcesos;
    }

    public int getUnidadesTiempoRestante() {
        return unidadesTiempoRestante;
    }

    public int getnProceso() {
        return nProceso;
    }

    public void setnProceso(int nProceso) {
        this.nProceso = nProceso;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public void setUnidadesTiempoRestante(int unidadesTiempoRestante) {
        this.unidadesTiempoRestante = unidadesTiempoRestante;
    }

    public String detalleProceso() {
        String sal = "";
        sal += nombre + ": ";
        sal += nProceso + ", ";
        sal += prioridad + ", ";
        sal += tipo + ", ";
        sal += unidadesTiempo + ", ";
        sal += unidadesMem + ", ";
        sal += unidadesCpu;
        return sal;
    }

    public String toString() {
        String sal = "";
        sal += "\nNumero de Proceso:...." + nProceso;
        sal += "\nNombre:..............." + nombre;
        sal += "\nUnidades de tiempo:..." + unidadesTiempo;
        sal += "\nUnidades de Memoria:.." + unidadesMem;
        sal += "\nPriodidad:............" + prioridad;
        sal += "\nTipo:................." + tipo;
        sal += "\nEstado:..............." + estado;
        sal += "\nQuantium:............." + quantium + "\n";
        sal += listaRecursosProcesos.listarRecursosDetalle();
        return sal;
    }

    public String toStringDetalle() {
        String sal = "";
        sal += "\n#Proceso:............." + nProceso;
        sal += "\nNombre:..............." + nombre;
        sal += "\nPrioridad:............" + prioridad;
        sal += "\nTipo:................." + tipo;
        sal += "\nUnidades de Tiempo:..." + unidadesTiempo;
        sal += "\nUnidades de Memoria:.." + unidadesMem;
        sal += "\nUnidades de CPU:......" + unidadesCpu + "\n";
        return sal;
    }

    public void asignarRecurso(Recurso nuevo) {
        listaRecursosProcesos.agregarRecurso(nuevo);
    }

    // liberar recursos del proceso
    public void liberarRecursoPorNumero(int numeroRecurso) {
        listaRecursosProcesos.liberarRecursoPorNumero(numeroRecurso);
    }

    public String listarRecursosRequeridos() {
        return listaRecursosProcesos.listarRecursosDetalle();
    }

    public String getEstadoTexto() {
        switch (estado) {
            case 0:
                return "CREADO";
            case 1:
                return "ACTIVO";
            case 2:
                return "ESPERA";
            case 3:
                return "BLOQ.";
            case 4:
                return "TER.";
            default:
                return "DESCON.";
        }
    }

    public String procesoTabla() {
        return String.format(
                "%-3d %-6s %-8s %-7d %-7d",
                this.nProceso,
                this.nombre,
                getEstadoTexto(),
                this.unidadesTiempo,
                this.unidadesTiempoRestante
        );
    }

    public void disminuirTiempoRestante() {
        if (this.unidadesTiempoRestante > 0) {
            this.unidadesTiempoRestante--;
        }
    }

    public Proceso clonar() {
        Proceso copia = new Proceso(this);

        copia.unidadesTiempoRestante = this.unidadesTiempoRestante;
        copia.estado = this.estado;

        // clonar recursos según ListaRecursos(15)
        copia.listaRecursosProcesos = this.listaRecursosProcesos.clonar();

        copia.maquinaAsignada = null;

        return copia;
    }


}
