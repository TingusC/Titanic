package es.etg.dam.psp.servicio_emergencia.documento;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscritorDocumentos implements Escritor {

    @Override
    public void escribir(String direccion, String contenido) throws IOException {
        
        File fichero = new File(direccion);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fichero))) {
            writer.write(contenido);
        }           
    }   
}