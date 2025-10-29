package es.etg.dam.psp.servicio_emergencia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Embarcador {
    
    public static String embarcar(String[] comandos) throws IOException
    {
        Process process = Runtime.getRuntime().exec(comandos);
        StringBuilder salida = new StringBuilder();

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))){
            String linea;
            while((linea = reader.readLine()) != null)
            {
                salida.append(linea);
            }
        }
        return salida.toString();
    }
}
