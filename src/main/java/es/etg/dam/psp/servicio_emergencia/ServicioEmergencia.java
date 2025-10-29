package es.etg.dam.psp.servicio_emergencia;

import java.io.IOException;

public class ServicioEmergencia {

    public static final String COMANDO = "java";
    public static final String PROCESO = "src/main/java/es/etg/dam/psp/bote/Bote.java";
    public static void main(String[] args) throws IOException {
        String[] comandoFinal = {COMANDO, PROCESO};
        String salida = Embarcador.embarcar(comandoFinal);
        System.out.println(salida);
    }
}