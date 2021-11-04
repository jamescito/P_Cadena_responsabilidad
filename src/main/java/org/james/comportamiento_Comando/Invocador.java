package org.james.comportamiento_Comando;

public class Invocador {
    // el comando al que le pediremos que ejecute la petición
    private ComandoDeshacer comando;

    public void setComando(ComandoDeshacer comando) {
        this.comando = comando;
    }

    public void ejecutaComando(String param) {
        comando.ejecutar(param);
    }

    public void deshacerComando() {
        comando.deshacer();
    }

    public void rehacerComando() {
        comando.rehacer();
    }
}
