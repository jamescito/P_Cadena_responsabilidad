package org.james.comportamiento_Comando;

//Clase para manejar fechas con horas (DD/MM/AAAA/HO:MI)
import java.util.*;

class FechaHora {
    // atributos
    private int año;
    private int mes;
    private int dia;
    private int hora;
    private int min;

    // constructores
    public FechaHora(int dia, int mes, int año, int hora, int min) {
        //// COMPLETAR /////////
    }

    public FechaHora(String cadenaFecha) {
        //// COMPLETAR /////////
    }

    public FechaHora() {
        //// COMPLETAR /////////
    }

    // métodos
    @Override
    public String toString() {
        if (min < 10) {
            return dia + "/" + mes + "/" + año + "/" + hora + ":0" + min;
        } else {
            return dia + "/" + mes + "/" + año + "/" + hora + ":" + min;
        }
    }

    public int getAño() {
        return this.año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getDia() {
        return this.dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return this.mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getHora() {
        return this.hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMin() {
        return this.min;
    }

    public void setMin(int min) {
        this.min = min;
    }
}
