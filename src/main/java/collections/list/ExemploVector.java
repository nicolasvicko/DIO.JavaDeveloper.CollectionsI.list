package collections.list;

import java.util.List;
import java.util.Vector;

public class ExemploVector {

    public static void main(String[] args) {
        List<String> esportes = new Vector<>();

        // Adiciona 4 esportes no vector
        esportes.add("Futebol");
        esportes.add("Basquetebol");
        esportes.add("Tênis de Mesa");
        esportes.add("Handebol");

        var pulaLinha = "\n";


        //Altera o  valor da posição 2 do vetor
        String teste01 = ("Alterando o conteúdo da posição 2: " + pulaLinha );
        esportes.set(2, "Ping Pong");
        System.out.println(teste01 + esportes + pulaLinha);

        //Remover o esporte da posição 2
        String teste02 = ("Removendo o valor do item 2: " + pulaLinha);
        esportes.remove(2);
        System.out.println(teste02 + esportes + pulaLinha);

        // Remove o esporte Handbol do Vector
        String teste03 = ("Removendo o primeiro conteúdo Handebol do Vetor: " + pulaLinha);
        esportes.remove("Handebol");
        System.out.println(teste03 + esportes + pulaLinha);

        // Retorna o primeiro item do Vetor
        String teste04 = ("Retornando o primeiro esporte da lista esportes: " + pulaLinha);
        var primeiroitem = esportes.get(0);
        System.out.println(teste04 + primeiroitem + pulaLinha);

        // Navegando de esporte em esporte
        String teste05 = ("Lendo cada item e printando seu conteúdo; ");
        System.out.println(teste05);
        for (String esporte: esportes){
            System.out.println(esporte);
        }
    }
}
