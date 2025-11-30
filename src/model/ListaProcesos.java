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
public class ListaProcesos {

    private ArrayList<Proceso> listaProcesos;
    private String nombre;

    public ListaProcesos() {
        this.nombre = "Lista";
        this.listaProcesos = new ArrayList<>();
    }

    public ListaProcesos(String nombre) {
        this.nombre = "Sin nombre";
        this.listaProcesos = new ArrayList<>();
    }

    //setters y getters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Proceso> getListaProcesos() {
        return listaProcesos;
    }

    public void setListaProcesos(ArrayList<Proceso> listaProcesos) {
        this.listaProcesos = listaProcesos;
    }

    public ArrayList<Proceso> getLista() {
        return listaProcesos;
    }

    public void agregarProceso(Proceso nuevo) {
        listaProcesos.add(nuevo);
    }

    public void modificarProceso(String nProceso, String nuevoNombre, String nuevoPrioridad, String nuevoTipo, String nuevoUTiempo, String nuevoUMemoria,
            String nuevoUCPU) {
        Proceso proceso = buscarProceso(Integer.parseInt(nProceso));
        if (proceso != null) {
            if (!nuevoNombre.isEmpty()) {
                proceso.setNombre(nuevoNombre);
            }
            if (!nuevoPrioridad.isEmpty()) {
                proceso.setPrioridad(Integer.parseInt(nuevoPrioridad));
            }
            if (!nuevoTipo.isEmpty()) {
                proceso.setTipo(Integer.parseInt(nuevoTipo));
            }
            if (!nuevoUTiempo.isEmpty()) {
                proceso.setUnidadesTiempo(Integer.parseInt(nuevoUTiempo));
            }
            if (!nuevoUMemoria.isEmpty()) {
                proceso.setUnidadesMem(Integer.parseInt(nuevoUMemoria));
            }
            if (!nuevoUCPU.isEmpty()) {
                proceso.setUnidadesCpu(Integer.parseInt(nuevoUCPU));
            }
        }
    }

    public Proceso buscarProceso(int nProceso) {
        for (int i = 0; i < listaProcesos.size(); i++) {
            if (listaProcesos.get(i).getNProceso() == nProceso) {
                return listaProcesos.get(i);
            }
        }
        return null;
    }

    public String consultarProceso(int nProceso) {
        Proceso proceso = buscarProceso(nProceso);
        if (proceso != null) {
            return proceso.toStringDetalle();
        }
        return null;
    }

    public boolean eliminarProceso(int nProceso) {
        for (int i = 0; i < listaProcesos.size(); i++) {
            if (listaProcesos.get(i).getNProceso() == nProceso) {
                listaProcesos.remove(i);
                return true; //se elimina
            }
        }
        return false;
    }

    public int contarUnidadesMem() {
        int contador = 0;
        for (int i = 0; i < listaProcesos.size(); i++) {
            contador += listaProcesos.get(i).getUnidadesMem();
        }
        return contador;
    }

    public int contarUnidadesTiempo() {
        int contador = 0;
        for (int i = 0; i < listaProcesos.size(); i++) {
            contador += listaProcesos.get(i).getUnidadesTiempo();
        }
        return contador;
    }

    public int contarUnidadesCpu() {
        int contador = 0;
        for (int i = 0; i < listaProcesos.size(); i++) {
            contador += listaProcesos.get(i).getUnidadesCpu();
        }
        return contador;
    }

    public String listarProcesosDetalle() {
        String salida = "";
        for (int i = 0; i < listaProcesos.size(); i++) {
            salida += listaProcesos.get(i).detalleProceso() + "\n";
        }
        //salida += totalizarProcesosDetalle();
        return salida;
    }
    
    public String listarProcesosTabla() {
        String salida = "# NOMBRE   ESTADO T.ORI   T.RES\n";
        for (int i = 0; i < listaProcesos.size(); i++) {
            salida += listaProcesos.get(i).procesoTabla() + "\n";
        }
        return salida;
    }

    public String listarRecursosRequeridos(int nProceso) {
        Proceso p = buscarProceso(nProceso);
        if (p != null) {
            return p.listarRecursosRequeridos();
        }
        return "Proceso no encontrada";
    }

    public void intercambio(int i, int j) {
        Proceso aux = listaProcesos.get(i);
        listaProcesos.set(i, listaProcesos.get(j));
        listaProcesos.set(j, aux);
    }

    public String totalizarProcesos() {
        String sal = "\n Totales:";

        sal += "\n CPU: ......." + this.contarUnidadesCpu();
        sal += "\n Memoria: ..." + this.contarUnidadesMem();
        sal += "\n Tiempo: ...." + this.contarUnidadesTiempo();
        // sal += "\n Unidades Recurso1: ...." +this.contarUnidadesRec(0);
        // sal += "\n Unidades Recurso2: ...." +this.contarUnidadesRec(1);
        // sal += "\n Unidades Recurso3: ...." +this.contarUnidadesRec(2);
        sal += "\n\n ";
        return sal;
    }

    public String totalizarProcesosDetalle() {
        String sal = "\n";

        sal += "\t\t" + "__";
        sal += "\t" + "__";
        sal += "\t\t\t\t\t" + "__";
        sal += "\t" + "__";
        sal += "\t" + "__\n";

        sal += "\t\t" + this.contarUnidadesMem();
        sal += "\t" + this.contarUnidadesTiempo();
        // sal += "\t\t\t\t\t" +this.contarUnidadesRec(0);
        // sal += "\t" +this.contarUnidadesRec(1);
        // sal += "\t" +this.contarUnidadesRec(2);
        sal += "\n\n ";
        return sal;
    }

    public String toString() {
        String salida = "";
        salida += "Nombre Lista.................." + nombre;
        for (int i = 0; i < listaProcesos.size(); i++) {
            salida += "\nElemento.. " + i;
            salida += listaProcesos.get(i).toString();
        }
        return salida;
    }

    public void ordenarPrioridad() {
        for (int i = 0; i < listaProcesos.size() - 1; i++) {
            for (int j = i + 1; j < listaProcesos.size(); j++) {
                if (listaProcesos.get(i).getPrioridad() > listaProcesos.get(j).getPrioridad()) {
                    intercambio(i, j);
                }
            }
        }
    }

    public void ordenarTipo() {
        for (int i = 0; i < listaProcesos.size() - 1; i++) {
            for (int j = i + 1; j < listaProcesos.size(); j++) {
                if (listaProcesos.get(i).getTipo() > listaProcesos.get(j).getTipo()) {
                    intercambio(i, j);
                }
            }
        }
    }

    public void ordenarTiempo() {
        for (int i = 0; i < listaProcesos.size() - 1; i++) {

            for (int j = i + 1; j < listaProcesos.size(); j++) {

                if (listaProcesos.get(i).getUnidadesTiempo() > listaProcesos.get(j).getUnidadesTiempo()) {
                    intercambio(i, j);
                }
            }
        }
    }

    public void ordenarQuantium() {
        for (int i = 0; i < listaProcesos.size() - 1; i++) {
            for (int j = i + 1; j < listaProcesos.size(); j++) {
                if (listaProcesos.get(i).getQuantium() > listaProcesos.get(j).getQuantium()) {
                    intercambio(i, j);
                }
            }
        }
    }

    public void limpiarLista() {
        listaProcesos.clear();
    }

    // asignar recursos a el proceso
    public void asignarRecursoLP(int posProceso, Recurso nuevoRecurso) {
        listaProcesos.get(posProceso).asignarRecurso(nuevoRecurso);
    }

    // liberar recursos de el proceso
    public void liberarRecursoLP(int posProceso, int numeroRecurso) {
        listaProcesos.get(posProceso).liberarRecursoPorNumero(numeroRecurso);
    }
}
