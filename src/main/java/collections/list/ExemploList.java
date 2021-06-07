package collections.list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {

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
            String testeA = ("---> Printamos os itens da lista nomes: " + pulaLinha);
            System.out.println(testeA + nomes + pulaLinha);


        //Trocando o conteúdo do item 2
            String testeB = ("---> Trocando o conteúdo do item 2 da lista nomes pelo conteúdo 'Larissa': " + pulaLinha);
            nomes.set(2,"Larissa");
            System.out.println(testeB + nomes + pulaLinha);


        //Organizando a lista e ordem alfabética
            String testeC = ("---> Organizando os itens da lista nomes em ordem alfabética:" + pulaLinha);
            Collections.sort(nomes);
            System.out.println(testeC + nomes + pulaLinha);


        //Trocando o conteúdo
            String testeD = ("---> Trocando o conteúdo do item 2 pelo conteúdo 'Wesley':" + pulaLinha);
            nomes.set(2, "Wesley");
            System.out.println(testeD + nomes + pulaLinha);


        //Removendo o item 4
            String testeE = ("---> Removendo o item 4 da lista nomes:" + pulaLinha);
            nomes.remove(4);
            System.out.println(testeE + nomes + pulaLinha);


       //Removendo Wesley
            String testeF = ("---> Removendo o primeiro item 'Wesley' da lista nomes:" + pulaLinha);
            nomes.remove("Wesley"); // Percebi queremove apenas o primeiro item com o conteúdo Wesley
            System.out.println(testeF + nomes +  pulaLinha);


        //Para remover todos os atributos com o valor Wesley:
            String testeG = ("---> Usando 'if' para remover todos os itens contendo 'Wesley' como conteúdo..." + pulaLinha);
            boolean temWesley = nomes.contains("Wesley");
            if (temWesley = true); nomes.remove("Wesley");
            System.out.println(testeG + nomes + pulaLinha);


        //Quem está no item 3?
            String testeH = ("---> Solicitando apenas o conteúdo do item 3:" + pulaLinha);
            String atributo3 = nomes.get(3);
            System.out.println(testeH + atributo3 + pulaLinha);


        //onde está Pedro?
            String testeI = ("---> Solicitando o index(posicao) do item 'Pedro'" + pulaLinha);
            int posicao = nomes.indexOf("Pedro");
            System.out.println(testeI + posicao + pulaLinha);


        //Quantidade de itens da lista
            String testeJ =("---> Contando os itens da lista 'nomes': " + pulaLinha);
            int tamanhoDaLista = nomes.size();
            System.out.println(testeJ + "Até esta linha, a lista 'nomes' tem um total de " + tamanhoDaLista + " itens, que são esses: " + pulaLinha + nomes + pulaLinha);



        //Agora tiramos o item 'Larissa'
            String testeK = ("---> Tamanho da lista depois de tirar o item de conteúdo 'Larissa' é: " + pulaLinha);
            nomes.remove("Larissa");
            int tamanhoDaListanova = nomes.size();
            System.out.println(testeK + tamanhoDaListanova + pulaLinha);



        //Procurando o atributo anderson e mostrando sua posição na lista
            String testeL = ("---> Checando se existe o conteúdo 'Anderson' em algum item: " + pulaLinha);
            boolean achaAnderson = nomes.contains("Anderson");
            String temAnderson = ("Sim, tem o conteúdo Anderson na lista e está no item: ");
            if (achaAnderson); int posicaoAnderson = nomes.indexOf("Anderson");
            System.out.println(testeL + temAnderson + posicao + pulaLinha);



        // Procurando o Atributo Fernando e mostrando sua posição na lista
            String testeM = ("---> Agora estamos procurando o conteúdo 'Fernando': " + pulaLinha);
            boolean achaFernando = nomes.contains("Fernando");
            String temFernando = ("Sim, tem o conteúdo Fernando na lista e está na no item: ");
            if (achaFernando); int posicaoFernando = nomes.indexOf("Fernando");
            System.out.println(testeM + temFernando + posicao + pulaLinha);



        // Verificando se a lista está vazia
            String testeN = ("---> A lista 'nomes' ainda tem itens?");
            System.out.println(testeN);
            boolean listaEstaVazia = nomes.isEmpty();
            if(listaEstaVazia);
            System.out.println("Sim, a lista ainda tem os itens:" + pulaLinha + nomes + pulaLinha);



        //Passando em cada atributo e printando na tela seu conteúdo
            System.out.println("Passando em cada item da lista e mostrando seu conteúdo: ");
            for (String nomeDoItem: nomes) { System.out.println("---> " + nomeDoItem);
            }



        //Retorna um booleano True sempre que existir mais um elemento na lista
            String testeO = (pulaLinha + "Retornado um booleano True sempre que tiver mais um item na lista e mostrando seu conteúdo" + pulaLinha);
            Iterator<String> Iterator = nomes.iterator();
            while (Iterator.hasNext()) {System.out.println(testeO + "--->" + Iterator.next());
            }


        //Limpando todos os atributos do objeto e verificando se está limpo
            String testeP = ("Limpando todos os itens do objeto e verificando se está vazio:" + pulaLinha);
            nomes.clear();
            boolean listaLimpa = nomes.isEmpty();
            if (listaLimpa);
            System.out.println(testeP + "Sim, agora a lista está sem nenhum item..." + pulaLinha);



    }




}
