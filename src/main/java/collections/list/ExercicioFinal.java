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
            String testeA = ("---> Esses são os nomes na nossa lista; " + pulaLinha);
            System.out.println(testeA + listadenomes + pulaLinha);

        // Navegando na lista e exibindo cada nome no console
            String testeB = ("---> Lendo cada item e exibindo seu conteúdo; ");
            System.out.println(testeB);
            for (String mostrandoconteudo: listadenomes) System.out.println("---> " + mostrandoconteudo);

        //Substituindo o nome Carlos por Roberto
            String testeC = (pulaLinha + " --->Substituíndo o Carlos pelo Roberto na lista: " + pulaLinha);
            listadenomes.set(2 , "Roberto");
            System.out.println(testeC + listadenomes + pulaLinha);

        //Retornando o Valor da posição 1
            String testeD = ("---> Quem está na posição 1 é :" + pulaLinha);
            String primeiraposicao = listadenomes.get(1);
            System.out.println(testeD + primeiraposicao + pulaLinha);

        //Removendo o nome da posição 4
            String quartaposicao = listadenomes.get(4);
            String testeE = ("---> Removendo o conteúdo da posição 4:" + quartaposicao + pulaLinha);
            listadenomes.remove(4);
            System.out.println(testeE + listadenomes + pulaLinha);

        //Removendo o nome João
            String testeF = ("---> Removendo o nome João da lista:" + pulaLinha);
            listadenomes.remove("João");
            System.out.println(testeF + listadenomes +  pulaLinha);

        //Retornando a quantidade de itens da lista
            String testeG = ("---> Total de itens da lista: " + pulaLinha);
            int totalitens = listadenomes.size();
            System.out.println(testeG + totalitens + pulaLinha);

        //Verificando se Juliano Existe na lista
            String testeH = ("---> Tem juliano nessa lista? " + pulaLinha);
            boolean temJuliano = listadenomes.contains("Juliano");
            if (temJuliano = true); System.out.println(testeH + "Sim, tem Juliano..." + pulaLinha);

        //Ordenando a lista por ordem alfabética
            String testeI = ("---> Ordenando a lista em ordem alfabética" + pulaLinha);
            Collections.sort(listadenomes);
            System.out.println(testeI + listadenomes + pulaLinha);


        // Verificando se a lista está vazia
            String testeJ = ("---> A lista 'nomes' ainda tem itens?");
            System.out.println(testeJ);
            boolean listaEstaVazia = listadenomes.isEmpty();
            if(listaEstaVazia);
            System.out.println("Sim, a lista ainda tem os itens:" + pulaLinha + listadenomes + pulaLinha);



    }
}
