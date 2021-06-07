package Collections.queue;

import java.util.LinkedList;

public class ExercicioFinal {
    public static void main(String[] args) {

        java.util.Queue<String> novafila = new LinkedList<>();

        novafila.add("Juliana");
        novafila.add("Pedro");
        novafila.add("Carlos");
        novafila.add("Larissa");
        novafila.add("João");

        var pulaLinha = ("\n");

        //CLientes na fila
            String testeA = ("---> Como está a fila?"+ pulaLinha );
            System.out.println(testeA+novafila+pulaLinha);

        //Navegando na fila e exibindo os nomes dos clientes
            String testeB = ("---> Consultando o nome dos clientes:");
        System.out.println(testeB);
            for (String nomeDoCliente:novafila) {
                System.out.println("Cliente:" + nomeDoCliente);
            }



        //Mostrando o primeiro cliente sem removê-lo com .peek
            String testeC = (pulaLinha +"---> Quem é o primeiro cliente?" + pulaLinha);
            String primeiroCliente = novafila.peek();
            System.out.println(testeC + primeiroCliente + pulaLinha);



        //Mostrando o primeiro cliente da fila e removendo-o com .poll
            String atendentoCliente = novafila.poll();
            String testeD = ("---> Atendendo a primeira cliente " + atendentoCliente +" e diminuindo a fila:" + pulaLinha);
            System.out.println(testeD + novafila + pulaLinha  );



        //Adicionando novo cliente na fila e verificando sua posição
            String testeE = ("---> Novo cliente Daniel adicionado na fila:" + pulaLinha);
            novafila.add("Daniel");
            System.out.println(testeE + novafila + pulaLinha);



        //Quantidades de clientes da fila
            String testeF = ("---> Quantos clientes tem na fila?" + pulaLinha);
            int quantosClientes = novafila.size();
            System.out.println(testeF + quantosClientes + pulaLinha);



        //Verificando se a lista está vazia
             String testeG = ("--->Ainda tem clientes da fila?" + pulaLinha);
             boolean temCliente = novafila.isEmpty();
             if (!temCliente);System.out.println(testeG + "Sim, ainda tem " +quantosClientes +" clientes na fila, que são: "+pulaLinha +novafila);




        //Verificando se carlos está na lista
            String testeH = (pulaLinha +"---> O Cliente Anderson está na fila?" + pulaLinha);
            boolean cadeCarlos = novafila.contains("Anderson");
            if (cadeCarlos){
                System.out.println(testeH + "Sim, Anderson está na fila:" + pulaLinha + novafila);
            } else {
                System.out.println(testeH + "O cliente Anderson não está na fila, estão apenas os clientes:" + pulaLinha + novafila + pulaLinha);
            }



    }
}
