package es.etg.dam.psp.servicio_emergencia.gestion_formato;

public class FormateadorFactory {
    
    public static Formateador obtener(Formato formato)
    {
        if(formato.equals(Formato.MD))
        {
            return new FormateadorMD();
        }
        else
        {
            return new FormateadorHTML();
        }
    }
}
