package es.etg.dam.psp.servicio_emergencia.gestion_botes;

import java.io.IOException;

public interface Lanzador {
    
    String ejecutar(String[] comandos) throws IOException, InterruptedException;
}
