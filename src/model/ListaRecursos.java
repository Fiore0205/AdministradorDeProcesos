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
public class ListaRecursos {

    private int nRecursos;
    private ArrayList<Recurso> listaRecursos;
    private boolean bandera_recursos;
    private int nRecursoAUsar;


    // constructores
    public ListaRecursos() {
        nRecursos = 3;
        listaRecursos = new ArrayList<>();
        // Crear los 3 recursos iniciales
        Recurso r1 = new Recurso();
        r1.setNomRecurso("Imp");
        r1.setNrecurso(0);
        r1.setUnidades(0);

        Recurso r2 = new Recurso();
        r2.setNomRecurso("Dis");
        r2.setNrecurso(1);
        r2.setUnidades(0);

        Recurso r3 = new Recurso();
        r3.setNomRecurso("DVD");
        r3.setNrecurso(2);
        r3.setUnidades(0);

        // Agregarlos a la lista
        listaRecursos.add(r1);
        listaRecursos.add(r2);
        listaRecursos.add(r3);
    }

    public ListaRecursos(int nRecursos) {
        this.nRecursos = nRecursos;
        listaRecursos = new ArrayList<>();
    }

    public void agregarRecurso(Recurso recurso) {
        listaRecursos.add(recurso);
    }

    public void setCantidadRecurso(int posRecurso, int unidadesRecurso) {
        listaRecursos.get(nRecursos).setUnidades(unidadesRecurso);
    }

    public void setBanderaRecursos(boolean estado) {
        bandera_recursos = estado;
    }

    public void setnRecursoAUsar(int nRecursoAUsar) {
        this.nRecursoAUsar = nRecursoAUsar;
    }

    public void setNRecursos(int nRecursos) {
        this.nRecursos = nRecursos;
    }

    public int getNRecursos() {
        return nRecursos;
    }

    public int getnRecursoAUsar() {
        return nRecursoAUsar;
    }

    public boolean getBanderaRecursos() {
        return bandera_recursos;
    }

    public ArrayList<Recurso> getLista() {
        return listaRecursos;
    }

    public String listarRecursos() {
        String sal = "";
        for (int i = 0; i < listaRecursos.size(); i++) {
            sal += listaRecursos.get(i).toString();
        }
        return sal;
    }

    public String listarRecursosDetalle() {
        String sal = "Nombre   Rec  Unidades Ocupadas Disp\n";
        for (int i = 0; i < listaRecursos.size(); i++) {
            sal += listaRecursos.get(i).toStringDetalle();
        }
        return sal;
    }

    public String listarRecursosDisponibles() {
        String sal = "Nombre      Recurso    Disponibles\n";
        for (int i = 0; i < listaRecursos.size(); i++) {
            if (listaRecursos.get(i).getUdisponibles() > 0) {
                sal += listaRecursos.get(i).toStringRecursosDisponibles();
            }

        }
        return sal;
    }

    public String toString() {
        String sal = "";
        sal += listarRecursos();
        return sal;
    }

    public void asignarRecursoL(int posRecurso, int cantidadRecurso) {
        listaRecursos.get(posRecurso).asignarRecurso(cantidadRecurso);
    }

    public void liberarRecursoL(int posRecurso, int cantidadRecurso) {
        listaRecursos.get(posRecurso).liberarRecurso(cantidadRecurso);
    }

    public int getCantidadRecursos() {
        return nRecursos;
    }

    // para liberar por completo los recursos
    public void liberarRecursoL(int posRecurso) {
        // captura las unidades originales del inicio
        listaRecursos.get(posRecurso).setUdisponibles(listaRecursos.get(posRecurso).getUnidades());
        // pone las unidades nuevamente en 0.
        listaRecursos.get(posRecurso).setUutilizadas(0);
    }

    public void liberarRecursoPorNumero(int numeroRecurso) {
        for (int i = 0; i < listaRecursos.size(); i++) {
            if (listaRecursos.get(i) != null && listaRecursos.get(i).getNrecurso() == numeroRecurso) {
                listaRecursos.get(i).setUdisponibles(listaRecursos.get(i).getUnidades());
                listaRecursos.get(i).setUutilizadas(0);
                return;
            }
        }
        System.out.println("Recurso con número " + numeroRecurso + " no encontrado.");
    }

    public void setUnidadesRecursos(int cantidad, int pos) {
        listaRecursos.get(pos).setUnidades(cantidad);
    }

    public void noHayRecursosSuficientes(int cantidad) {
        for (int i = 0; i < listaRecursos.size(); i++) {
            if (listaRecursos.get(i).noHayRecursosSuficientes(cantidad)) {
                setBanderaRecursos(true);
                setnRecursoAUsar(listaRecursos.get(i).getNrecurso());
                break;
            }
        }
    }

    public Recurso getRecursoPorNumero(int n) {
        for (int i = 0; i < listaRecursos.size(); i++) {
            if (listaRecursos.get(i).getNrecurso() == n) {
                return listaRecursos.get(i);
            }
        }
        return null;
    }

    public Recurso getRecurso(int index) {
        if (index >= 0 && index < listaRecursos.size()) {
            return listaRecursos.get(index);
        }
        return null;
    }

    public Recurso buscarPorNombre(String nombre) {

        for (Recurso r : listaRecursos) {
            if (r.getNomRecurso().equalsIgnoreCase(nombre)) {
                return r;
            }
        }

        return null; // No encontrado
    }

    public ListaRecursos clonar() {
        ListaRecursos copia = new ListaRecursos(this.nRecursos);
        for (Recurso r : this.listaRecursos) {
            copia.agregarRecurso(r.clonar());
        }
        return copia;
    }

}
