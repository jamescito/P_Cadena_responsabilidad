package org.james.comportamiento_Comando;

// Crea la reunión, el comando y el invocador
public class Cliente {
    public static void main(String args[]) {
        try {
            // fecha de la reunión
            FechaHora fh = new FechaHora(1, 6, 2010, 10, 30);
            // la reunión
            Reunion r = new Reunion("Proyecto", "Roberto, María, Javier", "Sala reunión 1", fh);
            System.out.println("\n- Antes de ejecutar los comandos:" + r.toString());
            // comando localización
            ComandoDeshacer comando = new ComandoCambiarLocalizacion();
            comando.setReunion(r);
            // invocador
            Invocador inv = new Invocador();
            // establece y ejecuta el comando
            inv.setComando(comando);
            inv.ejecutaComando("Sala reunión 2");
            System.out.println("\n- Después de ejecutar el comando localización:" + r.toString());
            inv.deshacerComando();
            System.out.println("\n- Deshacer:" + r.toString());
            inv.rehacerComando();
            System.out.println("\n- Rehacer:" + r.toString());
            // comando fecha
            comando = new ComandoCambiarFecha();
            comando.setReunion(r);
            // establece y ejecuta el comando
            inv.setComando(comando);
            inv.ejecutaComando("5/6/2010/12:30");
            System.out.println("\n- Después de ejecutar el comando fecha:" + r.toString());
            inv.deshacerComando();
            System.out.println("\n- Deshacer:" + r.toString());
            inv.rehacerComando();
            System.out.println("\n- Rehacer:" + r.toString());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}