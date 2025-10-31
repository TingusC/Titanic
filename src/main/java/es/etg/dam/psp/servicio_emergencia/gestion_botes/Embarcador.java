package es.etg.dam.psp.servicio_emergencia.gestion_botes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Embarcador implements Lanzador {

    public static final int PARADA = 2000;
    
    @Override
    public String ejecutar(String[] comandos) throws IOException, InterruptedException
    {
        Process process = Runtime.getRuntime().exec(comandos);
        StringBuilder salida = new StringBuilder();

        Thread.sleep(PARADA);

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
