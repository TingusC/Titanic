package es.etg.dam.psp.servicio_emergencia;

import java.io.IOException;

public interface Lanzador {
    
    String ejecutar(String[] comandos) throws IOException, InterruptedException;
}
