package org.james.comportamiento_Comando;

//Implementa ComandoDeshacer.
//Proporciona el comportamiento necesario para cambiar la fecha de una reunión
public class ComandoCambiarFecha implements ComandoDeshacer {
    private Reunion reunion; // referencia al receptor
    private FechaHora nuevaFecha; // cuando el usuario la cambie
    private FechaHora antiguaFecha; // guardará la antigua fecha

    public Reunion getReunion() {
        return reunion;
    }

    public void setReunion(Reunion reunion) {
        //// COMPLETAR /////////
        this.reunion=reunion;
    }

    //// COMPLETAR /////////
    // Cambia la fecha de la reunión por otra introducida por el usuario y
    // almacena el valor anterior de la reunión por si luego se quiere recuperar

    public void ejecutar(String param) {
        
        int año=0;
        int mes=0;
        int dia=0;
        int hora=0;
        int min=0;

        dia = Integer.parseInt(param.substring(0, 2));
        mes = Integer.parseInt(param.substring(3, 5));
        año = Integer.parseInt(param.substring(6, 10));
        hora = Integer.parseInt(param.substring(11, 13));
        min = Integer.parseInt(param.substring(14, 16));
    

        System.out.println(año);
        
        antiguaFecha = reunion.getFecha();

        nuevaFecha = new FechaHora(dia,mes,año, hora, min);
        reunion.setFecha(nuevaFecha);
    }

    // recupera el valor de la Reunion anterior al introducido por el usuario
    public void deshacer() {
        //antiguaFecha = reunion.getFecha();
        reunion.setFecha(antiguaFecha);
    }

    // recupera el valor introducido por el usuario después de que se
    // hubiera deshecho
    public void rehacer() {
        //nuevaFecha = reunion.getFecha();
        reunion.setFecha(nuevaFecha);
    }
}