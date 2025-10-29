package es.etg.dam.psp.bote;

import java.util.List;

public class Contador {

    public static int contar(List<String> lista, String valor)
    {
        int ret = 0;
        for(String dato : lista)
        {
            if(dato.equals(valor))
            {
                ret++;
            }
        }
        return ret;
    }
}
