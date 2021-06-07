package Collections.queue;

import java.util.Iterator;
import java.util.LinkedList;

public class Queue {
    public static void main(String[] args) {

        java.util.Queue<String> filadeBanco = new LinkedList<>();
        //Queue<String> filadeBanco = new LinkedList<>();

        filadeBanco.add("Patrícia");
        filadeBanco.add("Roberto");
        filadeBanco.add("Flávio");
        filadeBanco.add("Pamela");
        filadeBanco.add("Anderson");

        var pulaLinha = ("\n");

        //Mostrando a lista no console
            System.out.println(filadeBanco);


        //Atendento o cliente e retirando ele da lista com o .poll
            String testeA = ("---> Quem é o promeiro a ser atendido?" + pulaLinha);
            String clienteASerAtendido = filadeBanco.poll();
            System.out.println( testeA + clienteASerAtendido + pulaLinha);
            String restoDaFila = ("---> Quem falta ser atendido:?" + pulaLinha);
            System.out.println(restoDaFila + filadeBanco + pulaLinha);



        //Apenas consultando o primeiro da Fila sem remover com .peek - caso vazia retorna null
            String testeB = ("---> Quem é o primeiro da fila?" + pulaLinha);
         /*Apagando a lista o .peek retorna um null
            filadeBanco.clear(); //function desativada.        */
            String primeiroCliente = filadeBanco.peek();
            System.out.println(testeB + primeiroCliente + pulaLinha + "Ordem da fila:" + pulaLinha + filadeBanco + pulaLinha);



        //Usando element consultando o primeiro da fila ou retornando um erro caso não tenha ninguém na fila
            String testeC = ("---> Consultando primeiro da fila com element:" + pulaLinha);
        /*Apagando a lista o element retorna um erro
            filadeBanco.clear(); //function desativada.        */
            String primeiroClienteOuErro = filadeBanco.element();
            System.out.println(testeC + primeiroClienteOuErro);
            System.out.println("---> Quem está na fila?" + pulaLinha + filadeBanco + pulaLinha);

        //Mostrando os clientes na fila de banco
            String testeD = ("---> Quais clientes do banco estão na fila? ");
            System.out.println( testeD);
            for (String cliente: filadeBanco){
                System.out.println("Cliente: " + cliente);
            }

        //Mostrando os clintes na fila com Iterator
            String testeE = (pulaLinha + "---> Me mostre os clientes com iterator:");
            System.out.println(testeE);
            Iterator<String> iteratorFilaBanco = filadeBanco.iterator();
            while (iteratorFilaBanco.hasNext()){
                System.out.println("Cliente: " + iteratorFilaBanco.next());
            }

        //Descobrindo a quantidade de clientes na fila
            String testeF = (pulaLinha + "Quantos clientes estão na fila?" + pulaLinha);
            int quantosNaFila = filadeBanco.size();
            System.out.println(testeF + quantosNaFila + pulaLinha);


        //A fila está vazia?
            String testeG = ("A fila está vazia?"+pulaLinha);
            boolean filaVazia =  filadeBanco.isEmpty();
            if (!filaVazia); System.out.println(testeG + "Não, ainda tem os clientes:" + filadeBanco);

    }
}
