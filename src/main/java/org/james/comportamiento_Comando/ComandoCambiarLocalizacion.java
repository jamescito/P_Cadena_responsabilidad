package org.james.comportamiento_Comando;

//Implementa ComandoDeshacer.
//Proporciona el comportamiento necesario para cambiar el lugar de una reunión
public class ComandoCambiarLocalizacion implements ComandoDeshacer {
    private Reunion reunion; // referencia al receptor
    private String nuevaLocalizacion; // cuando el usuario la cambie
    private String antiguaLocalizacion; // guardará la antigua localización

    public Reunion getReunion() {
        return reunion;
        //// COMPLETAR /////////
    }

    public void setReunion(Reunion reunion) {
        //// COMPLETAR /////////
        this.reunion=reunion;
    }

    // Cambia el lugar de la reunión por otro introducido por el usuario y
    // almacena el valor anterior de la reunion por si luego se quiere recuperar
    public void ejecutar(String param) {
        //// COMPLETAR /////////
        antiguaLocalizacion= reunion.getLocalizacion();
        nuevaLocalizacion = new String(param);
        reunion.setLocalizacion(nuevaLocalizacion);
        
    }

    // Recupera el valor de la Reunión anterior al introducido por el usuario
    public void deshacer() {
        reunion.setLocalizacion(antiguaLocalizacion);
    }

    // Recupera el valor introducido por el usuario después de que se
    // hubiera deshecho
    public void rehacer() {
        reunion.setLocalizacion(nuevaLocalizacion);
    }
}
