package collectionsI.list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {

        // Instanciando o ArrayList
        List<String> nomes = new ArrayList<>();

        // Adicionamos a lista com o método add
        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");


        String teste1 = ("---> Printamos o conteúdo de cada item da lista \n");
        System.out.println(teste1 + nomes + "\n");


        nomes.set(2,"Larissa");
        String teste2 = ("Atualizamos o nome da posição pelo nome Larissa");
        System.out.println(teste2 + nomes);


        Collections.sort(nomes);
        System.out.println(nomes);


        nomes.set(2, "Wesley");
        System.out.println(nomes);

        nomes.remove(4);
        System.out.println(nomes);

        nomes.remove("Wesley");
        System.out.println(nomes);

        String nome = nomes.get(3);
        System.out.println(nomes);

        int posicao = nomes.indexOf("Wesley");
        System.out.println(posicao);

        int tamanho = nomes.size();
        System.out.println(tamanho);

        nomes.remove("Larissa");
        tamanho = nomes.size();
        System.out.println(tamanho);



    }
}
