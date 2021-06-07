package Collections.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        //Adicionando números no set
            sequenciaNumerica.add(1);
            sequenciaNumerica.add(2);
            sequenciaNumerica.add(4);
            sequenciaNumerica.add(8);
            sequenciaNumerica.add(16);


            var pulaLinha = ("\n");

        //Mostrando a sequencia no console
            String mostraSequencia = ("---> Mostrando sequencia numérica:" + pulaLinha);
            System.out.println(mostraSequencia + sequenciaNumerica + pulaLinha);

        //Removendo número do set
            String delnumber = ("---> Removendo número 4 da sequencia:" + pulaLinha);
            sequenciaNumerica.remove(4);
            System.out.println(delnumber + sequenciaNumerica + pulaLinha);

        //Quantidade de itens do set
            String quantosNumeros = ("---> Quantos números tem na sequencia?" + pulaLinha);
            int totalNumeros = sequenciaNumerica.size();
            System.out.println(quantosNumeros + totalNumeros + pulaLinha);

        //Navegando em todos os itens com while e for
            String navegandoComWhile = ("---> Navegando com While encontramos esses itens: ");
            String navegandoComFor = ("---> Navegando com for encontramos esses itens: ");
            Iterator<Integer> iterator = sequenciaNumerica.iterator();
            while (iterator.hasNext()){
                System.out.println(navegandoComWhile + iterator.next());
            }

            for (Integer numero: sequenciaNumerica){
                System.out.println(navegandoComFor + numero);
            }


        //Apagando os itens da lista
            /*  sequenciaNumerica.clear();

           */

        //Retorna se o set está vazio
            String estaVazio = (pulaLinha + "---> Tem números na lista?" + pulaLinha);
            boolean temNumero = sequenciaNumerica.isEmpty();
            if (!temNumero){
                System.out.println(estaVazio + "Ainda tem " +totalNumeros + " números na lista");
            } else {
                System.out.println("Acabou os números...");
            }

    }
}
