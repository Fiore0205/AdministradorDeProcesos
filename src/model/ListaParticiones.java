package model;


public class ListaParticiones {

    private Particion listaParticiones[];
    private int nParticiones;
    private int aParticiones;
    private String nombreLP;
    private int maxParticiones;

    // constructor Particiones dinamicas
    public ListaParticiones() {
        this.nParticiones = 0;
        this.nombreLP = "general";
        this.maxParticiones = 100;
        listaParticiones = new Particion[maxParticiones];
        this.aParticiones = 0;
    }

    // contructor para particiones tama�o fijo
    public ListaParticiones(int cantidadMemoriaTotal, int tamanioParticiones) {
        this.nParticiones = cantidadMemoriaTotal / tamanioParticiones;

        this.nombreLP = "general";
        this.maxParticiones = this.nParticiones;
        listaParticiones = new Particion[nParticiones + 1];
        this.aParticiones = nParticiones;
        // crear o contruir las particiones de tama�o fijo
        this.cargarParticionesTamanioFijo(tamanioParticiones);

    }

    // contructor para particiones tama�o variable
    public ListaParticiones(int cantidadMemoriaTotal, int cantidadParticiones[]) {
        this.nParticiones = this.cantidadParticionesTamanioVariable(cantidadParticiones);
        // System.out.println("numero particiones "+nParticiones+"\n" );
        this.nombreLP = "general";
        this.maxParticiones = this.nParticiones;
        listaParticiones = new Particion[nParticiones + 1];
        this.aParticiones = nParticiones;
        this.cargarParticionesTamanioVariable(cantidadParticiones);
        // System.out.println("cargo bien\n");
    }

    // setters y getters
    public void setNombreLP(String nombreLP) {
        this.nombreLP = nombreLP;
    }

    public String getNombreLP() {
        return nombreLP;
    }

    public void setNParticiones(int nParticiones) {
        this.nParticiones = nParticiones;
    }

    public int getAParticion() {
        return aParticiones;
    }

    public Particion getParticionLista(int pos) {
        return listaParticiones[pos];
    }

    public int cantidadParticionesTamanioVariable(int cantidadParticiones[]) {
        int cantidadTParticiones = 0;
        // int tama�oParticiones[]={16,32,64,128,256,512,1024,2048,4096};
        for (int i = 0; i < cantidadParticiones.length; i++) {
            // System.out.println("en la pos i="+i+" hay la cantidad de
            // "+cantidadParticiones[i]);
            cantidadTParticiones += cantidadParticiones[i];
        }
        return cantidadTParticiones;
    }

    public void cargarParticionesTamanioFijo(int tamanioParticiones) {
        int inicioP = 0;
        int finalP = tamanioParticiones;
        for (int i = 0; i < aParticiones; i++) {
            listaParticiones[i] = new Particion(inicioP, finalP, tamanioParticiones);
            inicioP = finalP + 1;
            finalP += tamanioParticiones;
        }
    }

    public void cargarParticionesTamanioVariable(int cantidadParticiones[]) {
        int inicioP = 0;
        int tamanioParticiones[] = {16, 32, 64, 128, 256, 512};
        // int tama�oParticiones[]={16,32,64,128,256,512,1024,2048,4096};
        // int finalP= tama�oParticiones;
        int finalP = 0;
        int tamanioP = 0;
        int k = 0;
        for (int i = 0; i < cantidadParticiones.length; i++) {
            tamanioP = tamanioParticiones[i];
            // System.out.println("cant part " +cantidadParticiones[i]);
            // finalP=tama�oParticiones[i];
            for (int j = 0; j < cantidadParticiones[i]; j++) {
                // System.out.println("inicio="+inicioP+"final= "+finalP+"tanl= "+tama�oP+"\n");
                finalP += tamanioP;
                listaParticiones[k++] = new Particion(inicioP, finalP, tamanioP);
                inicioP = finalP + 1;
                // finalP+=tama�oParticiones;
            }
        }
    }

    public void agregarParticiones(Particion particion) {
        listaParticiones[aParticiones++] = particion;
    }

    public String listarParticiones() {
        String sal = "";
        for (int i = 0; i < aParticiones; i++) {
            sal += "" + i + "  ";
            sal += listaParticiones[i].detalleParticion() + "\n";
        }
        return sal;
    }

// ASIGNACIÓN DINÁMICA: Crea una partición exactamente del tamaño del proceso
    public boolean asignarParticionDinamica(Proceso p) {
        int memoriaNecesaria = p.getUnidadesMem();
        int inicio = 0;

        // Si ya existen particiones, el inicio será al final de la última
        if (aParticiones > 0) {
            Particion ultima = listaParticiones[aParticiones - 1];
            inicio = ultima.getFinalP() + 1;
        }

        int fin = inicio + memoriaNecesaria - 1;

        Particion nueva = new Particion(inicio, fin, memoriaNecesaria);
        nueva.setEstadoP('O'); // Ocupada
        nueva.setNombreProceso(p.getNombre());

        listaParticiones[aParticiones++] = nueva;

        return true;
    }

// LIBERAR PARTICIÓN ASIGNADA A UN PROCESO
    public boolean liberarParticion(String nombreProceso) {
        for (int i = 0; i < aParticiones; i++) {
            Particion p = listaParticiones[i];
            if (p.getNombreProceso().equals(nombreProceso)) {
                p.setEstadoP('L');
                p.setNombreProceso("SN");
                p.setUTiempo(0);
                return true;
            }
        }
        return false;
    }

// FUSIONA PARTICIONES LIBRES ADYACENTES
    public void fusionarLibres() {
        for (int i = 0; i < aParticiones - 1; i++) {
            Particion actual = listaParticiones[i];
            Particion siguiente = listaParticiones[i + 1];

            if (actual.getEstadoP() == 'L' && siguiente.getEstadoP() == 'L') {
                // Fusionar
                actual.setFinalP(siguiente.getFinalP());
                actual.setNUnidadesP(actual.getNUnidadesP() + siguiente.getNUnidadesP());

                // Correr las particiones hacia atrás
                for (int j = i + 1; j < aParticiones - 1; j++) {
                    listaParticiones[j] = listaParticiones[j + 1];
                }
                aParticiones--;
                i--; // revisar de nuevo esta posición
            }
        }
    }

// COMPACTACIÓN DE MEMORIA
// Reacomoda particiones ocupadas hacia el inicio
    public void compactar() {
        int inicio = 0;

        for (int i = 0; i < aParticiones; i++) {
            Particion p = listaParticiones[i];
            if (p.getEstadoP() == 'O') {
                int tamaño = p.getNUnidadesP();
                p.setInicioP(inicio);
                p.setFinalP(inicio + tamaño - 1);
                inicio = p.getFinalP() + 1;
            }
        }
    }

    // PRIMER AJUSTE
    public boolean asignarPrimerAjuste(Proceso p) {
        int tamaño = p.getUnidadesMem();

        for (int i = 0; i < aParticiones; i++) {
            Particion part = listaParticiones[i];

            // libre y suficiente tamaño
            if (part.getEstadoP() == 'L' && part.getNUnidadesP() >= tamaño) {

                // Si sobra espacio → dividir partición
                if (part.getNUnidadesP() > tamaño) {
                    int nuevoInicio = part.getInicioP() + tamaño;
                    int nuevoTamaño = part.getNUnidadesP() - tamaño;

                    // Crear partición sobrante
                    Particion sobrante = new Particion(nuevoInicio, nuevoInicio + nuevoTamaño - 1, nuevoTamaño);

                    // Ajustar partición existente a tamaño exacto
                    part.setFinalP(part.getInicioP() + tamaño - 1);
                    part.setNUnidadesP(tamaño);

                    // Insertar sobrante desplazando elementos
                    for (int j = aParticiones; j > i + 1; j--) {
                        listaParticiones[j] = listaParticiones[j - 1];
                    }
                    listaParticiones[i + 1] = sobrante;
                    aParticiones++;
                }

                // Asignar proceso
                part.setEstadoP('O');
                part.setNombreProceso(p.getNombre());
                return true;
            }
        }

        return false; // No hay espacio
    }

    // MEJOR AJUSTE
    public boolean asignarMejorAjuste(Proceso p) {
        int tamaño = p.getUnidadesMem();
        int mejorIndex = -1;
        int mejorEspacio = Integer.MAX_VALUE;

        // Buscar la mejor partición
        for (int i = 0; i < aParticiones; i++) {
            Particion part = listaParticiones[i];
            if (part.getEstadoP() == 'L' && part.getNUnidadesP() >= tamaño) {
                int espacioLibre = part.getNUnidadesP() - tamaño;
                if (espacioLibre < mejorEspacio) {
                    mejorEspacio = espacioLibre;
                    mejorIndex = i;
                }
            }
        }

        if (mejorIndex == -1) {
            return false; // No hay espacio
        }
        Particion part = listaParticiones[mejorIndex];

        // Si sobra espacio → dividir
        if (part.getNUnidadesP() > tamaño) {
            int nuevoInicio = part.getInicioP() + tamaño;
            int nuevoTamaño = part.getNUnidadesP() - tamaño;

            Particion sobrante = new Particion(nuevoInicio, nuevoInicio + nuevoTamaño - 1, nuevoTamaño);

            part.setFinalP(part.getInicioP() + tamaño - 1);
            part.setNUnidadesP(tamaño);

            // Insertar sobrante
            for (int j = aParticiones; j > mejorIndex + 1; j--) {
                listaParticiones[j] = listaParticiones[j - 1];
            }
            listaParticiones[mejorIndex + 1] = sobrante;
            aParticiones++;
        }

        // Asignar proceso
        part.setEstadoP('O');
        part.setNombreProceso(p.getNombre());
        return true;
    }

    // PEOR AJUSTE
    public boolean asignarPeorAjuste(Proceso p) {
        int tamaño = p.getUnidadesMem();
        int peorIndex = -1;
        int peorEspacio = -1;

        // Buscar la partición más grande
        for (int i = 0; i < aParticiones; i++) {
            Particion part = listaParticiones[i];
            if (part.getEstadoP() == 'L' && part.getNUnidadesP() >= tamaño) {
                int espacioLibre = part.getNUnidadesP() - tamaño;
                if (espacioLibre > peorEspacio) {
                    peorEspacio = espacioLibre;
                    peorIndex = i;
                }
            }
        }

        if (peorIndex == -1) {
            return false; // No hay espacio
        }
        Particion part = listaParticiones[peorIndex];

        // Dividir si sobra
        if (part.getNUnidadesP() > tamaño) {
            int nuevoInicio = part.getInicioP() + tamaño;
            int nuevoTamaño = part.getNUnidadesP() - tamaño;

            Particion sobrante = new Particion(nuevoInicio, nuevoInicio + nuevoTamaño - 1, nuevoTamaño);

            part.setFinalP(part.getInicioP() + tamaño - 1);
            part.setNUnidadesP(tamaño);

            for (int j = aParticiones; j > peorIndex + 1; j--) {
                listaParticiones[j] = listaParticiones[j - 1];
            }
            listaParticiones[peorIndex + 1] = sobrante;
            aParticiones++;
        }

        part.setEstadoP('O');
        part.setNombreProceso(p.getNombre());
        return true;
    }
}
