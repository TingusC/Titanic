package es.etg.dam.psp.bote;

import java.util.ArrayList;
import java.util.List;

public class Bote {
    public static final int MAX_PASAJEROS = 100;
    public static final int MAX_OPCIONES = 5;
    public static final int MITAD_OPCION = 2;

    public static final String HOMBRE = "h";
    public static final String MUJER = "m";
    public static final String NINIO = "n";
    public static final String SEPARADOR = ".";

    public static void main(String[] args) { 
        StringBuilder builder = new StringBuilder();
        List<String> pasajeros = new ArrayList<>();

        int numPasajeros = (int)(Math.random() * MAX_PASAJEROS);

        for(int i = 0; i < numPasajeros; i++)
        {
            int opcion = (int)(Math.random() * MAX_OPCIONES);
            pasajeros.add(obtenerTipo(opcion));
        }

        int numHomb = Contador.contar(pasajeros, HOMBRE);
        int numMuj = Contador.contar(pasajeros, MUJER);
        int numNinio = Contador.contar(pasajeros, NINIO);

        int[] cantidades = {numPasajeros, numHomb, numMuj, numNinio};

        for(int i = 0; i < cantidades.length; i++)
        {
            builder.append(cantidades[i]).append(SEPARADOR);
        }
        
        String salida = builder.toString();
        System.out.println(salida);
    }


    public static String obtenerTipo(int opcion)
    {
        if(opcion > MITAD_OPCION)
        {
            return HOMBRE;
        }
        else if (opcion < MITAD_OPCION) 
        {
            return MUJER;
        }
        else
        {
            return NINIO;
        }     
    }  
}
