package collections.list;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class ExercicioFinal {

    public static void main(String[] args) {

        List<String> novalista = new ArrayList<>();

        novalista.add("Ismael");
        novalista.add("Pedro");


        List<String> listadenomes = new ArrayList<>(novalista);

        listadenomes.add("Juliana");
        listadenomes.add("Pedro");
        listadenomes.add("Carlos");
        listadenomes.add("Larissa");
        listadenomes.add("João");
        listadenomes.add("João");

        //Adicionando o pula linha
            var pulaLinha = "\n";

        //Mostrando todos os nomes da lista
            String teste01 = ("---> Esses são os nomes na nossa lista; " + pulaLinha);
            System.out.println(teste01 + listadenomes + pulaLinha);

        // Navegando na lista e exibindo cada nome no console
            String teste02 = ("---> Lendo cada item e exibindo seu conteúdo; ");
            System.out.println(teste02);
            for (String mostrandoconteudo: listadenomes) System.out.println("---> " + mostrandoconteudo);

        //Substituindo o nome Carlos por Roberto
            String teste03 = (pulaLinha + " --->Substituíndo o Carlos pelo Roberto na lista: " + pulaLinha);
            listadenomes.set(2 , "Roberto");
            System.out.println(teste03 + listadenomes + pulaLinha);

        //Retornando o Valor da posição 1
            String teste04 = ("---> Quem está na posição 1 é :" + pulaLinha);
            String primeiraposicao = listadenomes.get(1);
            System.out.println(teste04 + primeiraposicao + pulaLinha);

        //Removendo o nome da posição 4
            String quartaposicao = listadenomes.get(4);
            String teste05 = ("---> Removendo o conteúdo da posição 4:" + quartaposicao + pulaLinha);
            listadenomes.remove(4);
            System.out.println(teste05 + listadenomes + pulaLinha);

        //Removendo o nome João
            String teste06 = ("---> Removendo o nome João da lista:" + pulaLinha);
            listadenomes.remove("João");
            System.out.println(teste06 + listadenomes +  pulaLinha);

        //Retornando a quantidade de itens da lista
            String teste07 = ("---> Total de itens da lista: " + pulaLinha);
            int totalitens = listadenomes.size();
            System.out.println(teste07 + totalitens + pulaLinha);

        //Verificando se Juliano Existe na lista
            String teste08 = ("---> Tem juliano nessa lista? " + pulaLinha);
            boolean temJuliano = listadenomes.contains("Juliano");
            if (temJuliano = true); System.out.println(teste08 + "Sim, tem Juliano..." + pulaLinha);

        //Ordenando a lista por ordem alfabética
            String teste09 = ("---> Ordenando a lista em ordem alfabética" + pulaLinha);
            Collections.sort(listadenomes);
            System.out.println(teste09 + listadenomes + pulaLinha);


        // Verificando se a lista está vazia
            String teste10 = ("---> A lista 'nomes' ainda tem itens?");
            System.out.println(teste10);
            boolean listaEstaVazia = listadenomes.isEmpty();
            if(listaEstaVazia);
            System.out.println("Sim, a lista ainda tem os itens:" + pulaLinha + listadenomes + pulaLinha);


    }
}
