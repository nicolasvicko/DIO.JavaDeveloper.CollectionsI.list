package collectionsI.list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) throws InterruptedException {

        // Instanciando o ArrayList
        List<String> nomes = new ArrayList<>();

        // Adicionando itens a lista com o método add
        // Adicionei + 1 atributo chamado Wesley
        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Wesley");

        // Agora vamos fazer alguns testes

        var pulaLinha = "\n";
        //var mostra = System.out.println();


        var println() {
            System.out.println();
        }
        println("Hello World");

        String teste1 = ("---> Printamos os atributos do objeto nomes: " + pulaLinha);
        p.print(teste1 + nomes + pulaLinha);


        String teste2 = ("---> Trocando o atributo 2 do objeto nomes pelo atributo 'Larissa': " + pulaLinha);
        nomes.set(2,"Larissa");
        System.out.println(teste2 + nomes + pulaLinha);

        String teste3 = ("---> Organizando os atributos do objeto nomes em ordem alfabética:" + pulaLinha);
        Collections.sort(nomes);
        System.out.println(teste3 + nomes + pulaLinha);

        String teste4 = ("---> Trocando o atributo 2 pelo atributo 'Wesley':" + pulaLinha);
        nomes.set(2, "Wesley");
        System.out.println(teste4 + nomes + pulaLinha);

        String teste5 = ("---> Removendo o atributo 4 do objeto nome:" + pulaLinha);
        nomes.remove(4);
        System.out.println(teste5 + nomes + pulaLinha);

        String teste6 = ("---> Removendo o primeiro atributo 'Wesley' do objeto nomes;" + pulaLinha);
        nomes.remove("Wesley"); // Percebi queremove apenas o primeiro atributo com o valor Wesley
        System.out.println(teste6 + nomes +  pulaLinha);

        //Para remover todos os atributos com o valor Wesley:
        boolean temWesley = nomes.contains("Wesley");
        if (temWesley = true);
        System.out.println("Aguarde... Agora estamos removendo todos os atributos contendo 'Wesley'..." + pulaLinha);
        Thread.sleep(2000); //adicionando uma pausa de 1s
        System.out.println("Procurando...");
        Thread.sleep(1000);
        System.out.println("Procurando...");
        Thread.sleep(1000);
        System.out.println("Procurando...");
        Thread.sleep(1000);
        System.out.println("Procurando...");
        Thread.sleep(1000);
        System.out.println("Achei... Agora estou removendo..." + pulaLinha);
        Thread.sleep(2000);
        nomes.remove("Wesley");

        if (temWesley = false);
        System.out.println("Agora sim! Todos os atributos contendo o valor 'Wesley' foram removidos" + pulaLinha);

        String teste8 = ("Solicitando apenas o atributo 3");
        String nome = nomes.get(3);








    }

}
