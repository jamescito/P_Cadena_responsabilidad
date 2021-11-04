package org.james.comportamiento_Comando;

//Interfaz comando. Modela el comportamiento genérico de los comandos
public interface Comando {
    void setReunion(Reunion reunion);

    Reunion getReunion();

    void ejecutar(String param);
}