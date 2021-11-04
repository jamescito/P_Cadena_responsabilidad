package org.james.comportamiento_Comando;

//Implementa ComandoDeshacer.
//Proporciona el comportamiento necesario para cambiar la fecha de una reunión
public class ComandoCambiarFecha implements ComandoDeshacer {
    private Reunion reunion; // referencia al receptor
    private FechaHora nuevaFecha; // cuando el usuario la cambie
    private FechaHora antiguaFecha; // guardará la antigua fecha

    public Reunion getReunion() {
        return this.reunion;
    }

    //// COMPLETAR /////////
    // Cambia la fecha de la reunión por otra introducida por el usuario y
    // almacena el valor anterior de la reunión por si luego se quiere recuperar
    public void ejecutar(String param) {
        antiguaFecha = reunion.getFecha();
        nuevaFecha = new FechaHora(param);
        reunion.setFecha(nuevaFecha);
    }

    // recupera el valor de la Reunion anterior al introducido por el usuario
    public void deshacer() {
        reunion.setFecha(antiguaFecha);
    }

    // recupera el valor introducido por el usuario después de que se
    // hubiera deshecho
    public void rehacer() {
        reunion.setFecha(nuevaFecha);
    }
}