package es.etg.dam.psp.servicio_emergencia;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import es.etg.dam.psp.servicio_emergencia.botes.Embarcador;
import es.etg.dam.psp.servicio_emergencia.botes.Lanzador;
import es.etg.dam.psp.servicio_emergencia.documento.Escritor;
import es.etg.dam.psp.servicio_emergencia.documento.EscritorDocumentos;
import es.etg.dam.psp.servicio_emergencia.formato.Formateador;
import es.etg.dam.psp.servicio_emergencia.formato.FormateadorFactory;
import es.etg.dam.psp.servicio_emergencia.formato.Formato;

public class ServicioEmergencia {

    public static final String COMANDO = "java";
    public static final String PROCESO = "src/main/java/es/etg/dam/psp/bote/Bote.java";
    public static final String FICHERO_SALIDA = "src/main/resources/informe_titanic.md";

    public static final String MSG_INICIO = "Embarcando botes...";
    public static final String MSG_DATOS = " -Recuento recogido.";
    public static final String MSG_EXITO = "Informe creado correctamente.";

    public static final String[] BOTES = {"B00", "B01", "B02", "B03", "B04", "B05", "B06", "B07", "B08", "B09", 
                                          "B10", "B11", "B12", "B13", "B14", "B15", "B16", "B17", "B18", "B19"};
    public static void main(String[] args) throws IOException, InterruptedException {
        List<String> datos = new ArrayList<>();

        System.out.println(MSG_INICIO);

        Lanzador embarcador = new Embarcador();
        for(int i = 0; i < BOTES.length; i++)
        {
            System.out.print(BOTES[i]);

            String[] comandoFinal = {COMANDO, PROCESO, BOTES[i]};
            String salida = embarcador.ejecutar(comandoFinal);
            datos.add(salida);
            
            System.out.println(MSG_DATOS);
        }

        Formateador formateador = FormateadorFactory.obtener(Formato.MD);
        String documento = formateador.formatear(datos);

        Escritor escritor = new EscritorDocumentos();
        escritor.escribir(FICHERO_SALIDA,documento);

        System.out.println(MSG_EXITO);
    }
}