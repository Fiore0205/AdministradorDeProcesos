package model;

// PARTICIONES 

public class Particion {

    private String nombreProceso; // podria ser un proceso de la clase Proceso
    private int inicioP; // inicio particion
    private int finalP; // fin particion
    private int nUnidadesP; // numero de Unidades de particion
    private int uTiempo; // Unidades de tiempo particion que estara en uso
    private char estadoP; // estado de la particion
    private int aP; // apuntador ultima asignacion
    // constructor

    public Particion(int inicioP, int finalP, int nUnidadesP) {
        this.nombreProceso = "SN";
        this.inicioP = inicioP;
        this.finalP = finalP;
        this.nUnidadesP = nUnidadesP;
        this.uTiempo = 0;
        this.estadoP = 'L';
        this.aP = 0;
    }

    public void setInicioP(int inicioP) {
        this.inicioP = inicioP;
    }

    public void setFinalP(int finalP) {
        this.finalP = finalP;
    }

    public void setNUnidadesP(int nUnidadesP) {
        this.nUnidadesP = nUnidadesP;
    }

    public int getNUnidadesP() {
        return nUnidadesP;
    }

    public void setEstadoP(char estadoP) {
        this.estadoP = estadoP;
    }

    public char getEstadoP() {
        return estadoP;
    }

    public void setNombreProceso(String nombreProceso) {
        this.nombreProceso = nombreProceso;
    }

    public String getNombreProceso() {
        return nombreProceso;
    }

    public void setUTiempo(int uTiempo) {
        this.uTiempo = uTiempo;
    }

    public int getUTiempo() {
        return uTiempo;
    }

    public int getFinalP() {
        return finalP;
    }

    public int getInicioP() {
        return inicioP;
    }

    public String detalleParticion() {
        String sal = "";
        sal += "" + nombreProceso;
        sal += "\t" + inicioP;
        sal += "\t" + finalP;
        sal += "\t" + nUnidadesP;
        sal += "\t" + uTiempo;
        sal += "\t" + estadoP;
        sal += "\t" + aP;

        return sal;
    }

}
