package es.etg.dam.psp.servicio_emergencia;

import java.io.IOException;

public interface Escritor {
    
    void escribir(String direccion, String contenido) throws IOException;
}
