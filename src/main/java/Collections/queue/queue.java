package Collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {

        Queue<String> filadeBanco = new LinkedList<>();

        filadeBanco.add("Patrícia");
        filadeBanco.add("Roberto");
        filadeBanco.add("Flávio");
        filadeBanco.add("Pamela");
        filadeBanco.add("Anderson");

        var pulaLinha = ("\n");

        //Mostrando a lista no console
            System.out.println(filadeBanco);

        //Atendento o cliente e retirando ele da lista com o .poll
            String teste01 = ("Quem é o promeiro da fila?" + pulaLinha);
            String clienteASerAtendido = filadeBanco.poll();
            System.out.println( teste01 + clienteASerAtendido + pulaLinha);
            String restoDaFila = ("Quem falta ser atendido:?" + pulaLinha);
            System.out.println(restoDaFila + filadeBanco + pulaLinha);

    }
}
