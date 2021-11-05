package org.james.comportamiento_Comando;

//Representa el receptor del patrón.
public class Reunion {
    private String motivo; // motivo de la reunión
    private String participantes; // gente que irá a la reunión
    private String localizacion; // sitio en que se producira la reunión
    private FechaHora fecha; // fecha de la reunión

    public Reunion(String motivo, String participantes, String localizacion, FechaHora fecha) {
        this.motivo = motivo;
        this.participantes = participantes;
        this.localizacion = localizacion;
        this.fecha = fecha;
    }

    public String getMotivo() {
        return this.motivo;
    }

    public void setMotivo(String nuevo) {
        //// COMPLETAR /////////
        this.motivo=nuevo;
    }

    public String getParticipantes() {
        return participantes;
        
    }

    public void setParticipantes(String nuevos) {
        this.participantes = nuevos;
    }

    public String getLocalizacion() {
        return this.localizacion;
    }

    public void setLocalizacion(String nueva) {
        this.localizacion = nueva;
    }

    public FechaHora getFecha() {
        return this.fecha;
    }

    public void setFecha(FechaHora nueva) {
        this.fecha = nueva;
    }

    @Override
    public String toString() {
        return "\n#### Reunión #### \n# " + motivo + " \n# " + participantes + " \n# " + localizacion + " \n# "
                + fecha.toString();
    }
}
