package collectionsI.list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
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
        String mensagemteste1 = ("---> Printamos os atributos do objeto nomes: " + pulaLinha);
        System.out.println(mensagemteste1 + nomes + pulaLinha);


        String mensagemteste2 = ("---> Trocando o atributo 2 do objeto nomes pelo atributo 'Larissa': " + pulaLinha);
        nomes.set(2,"Larissa");
        System.out.println(mensagemteste2 + nomes + pulaLinha);

        String mensagemteste3 = ("---> Organizando os atributos do objeto nomes em ordem alfabética:" + pulaLinha);
        Collections.sort(nomes);
        System.out.println(mensagemteste3 + nomes + pulaLinha);

        String mensagemteste4 = ("---> Trocando o atributo 2 pelo atributo 'Wesley':" + pulaLinha);
        nomes.set(2, "Wesley");
        System.out.println(mensagemteste4 + nomes + pulaLinha);

        String mensagemteste5 = ("---> Removendo o atributo 4 do objeto nome:" + pulaLinha);
        nomes.remove(4);
        System.out.println(mensagemteste5 + nomes + pulaLinha);

        String mensagemteste6 = ("---> Removendo o primeiro atributo 'Wesley' do objeto nomes:" + pulaLinha);
        nomes.remove("Wesley"); // Percebi queremove apenas o primeiro atributo com o valor Wesley
        System.out.println(mensagemteste6 + nomes +  pulaLinha);

        //Para remover todos os atributos com o valor Wesley:
        String mensagemteste7 = ("---> Usando 'if' para remover todos os atributos contendo 'Wesley'..." + pulaLinha);
        boolean temWesley = nomes.contains("Wesley");
        if (temWesley = true); nomes.remove("Wesley");
        System.out.println(mensagemteste7 + nomes + pulaLinha);


        String teste8 = ("---> Solicitando apenas o conteúdo atributo 3:" + pulaLinha);
        String atributo3 = nomes.get(3);
        System.out.println(teste8 + atributo3 + pulaLinha);

        String teste9 = ("---> Solicitando o index(posicao) do atributo 'Pedro'" + pulaLinha);
        int posicao = nomes.indexOf("Pedro");
        System.out.println(teste9 + posicao + pulaLinha);

        String teste10 =("---> Contando os atributos do objeto 'nomes':" + pulaLinha);
        int tamanhoDaLista = nomes.size();
        System.out.println(teste10 + "Até esta linha, o objeto 'nomes' tem um total de " + tamanhoDaLista + " atributos, que são esses: " + pulaLinha + nomes + pulaLinha);

        //Agora tiramos o atributo 'Larissa'
        String teste11 = ("---> Tamanho da lista depois de tirar 'Larissa' é: " + pulaLinha);
        nomes.remove("Larissa");
        int tamanhoDaListanova = nomes.size();
        System.out.println(teste11 + tamanhoDaListanova + pulaLinha);

        //Procurando o atributo anderson e mostrando sua posição no objeto
        String teste12 = ("---> Checando se existe o atributo 'Anderson': " + pulaLinha);
        boolean achaAnderson = nomes.contains("Anderson");
        String temAnderson = ("Sim, tem o atributo Anderson na lista e está na posição: ");
        if (achaAnderson); int posicaoAnderson = nomes.indexOf("Anderson");
        System.out.println(teste12 + temAnderson + posicao + pulaLinha);

        // Procurando o Atributo Fernando e mostrando sua posição no objeto
        String teste13 = ("---> Agora estamos procurando o atributo 'Fernando': " + pulaLinha);
        boolean achaFernando = nomes.contains("Fernando");
        String temFernando = ("Sim, tem o atributo Fernando na lista e está na posição: ");
        if (achaFernando); int posicaoFernando = nomes.indexOf("Fernando");
        System.out.println(teste13 + temFernando + posicao + pulaLinha);

        // Verificando se a lista está vazia
        String teste14 = ("---> O objeto 'nomes' ainda tem atributos?");
        System.out.println(teste14);
        boolean listaEstaVazia = nomes.isEmpty();
        if(listaEstaVazia);
        System.out.println("Sim, o objeto ainda tem os atributos:" + pulaLinha + nomes + pulaLinha);

        //Passando em cada atributo e printando na tela seu conteúdo
        String teste15 = ("Passando em cada atributo do objeto e mostrando seu conteúdo: " + pulaLinha);
        for (String nomeDoItem: nomes) {
            System.out.println(teste15 + "---> " + nomeDoItem + pulaLinha);
        }

        //Retorna um booleano True sempre que existir mais um elemento na lista
        String teste16 = ("Retorando um booleano True sempre que tiver mais um atributo na lista e mostrando seu conteúdo" + pulaLinha);
        Iterator<String> Iterator = nomes.iterator();
        while (Iterator.hasNext()) {
            System.out.println(teste16 + "--->" + Iterator.next());
        }

        //Limpando todos os atributos do objeto e verificando se está limpo
        String teste17 = ("Limpando todos os atributos do objeto e verificando se está limpo:" + pulaLinha);
        nomes.clear();
        boolean listaLimpa = nomes.isEmpty();
        if (listaLimpa);
        System.out.println(teste17 + "Sim, agora a lista está vazia..." + pulaLinha);

    }


}
