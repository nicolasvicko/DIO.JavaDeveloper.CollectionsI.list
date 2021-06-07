package collections.set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExercicioFinalTreeSet {
    public static void main(String[] args) {
        TreeSet<Double> exercicioFinal = new TreeSet<>();

        //Adicionando os números no set
            exercicioFinal.add(3.0);
            exercicioFinal.add(88.0);
            exercicioFinal.add(20.0);
            exercicioFinal.add(44.0);
            exercicioFinal.add(4.0);

        var pula = ("\n");

        //Navegando no set mostrando cada número no console
            System.out.println("---> Mostrando as notas usando for:");
            for (Double numero: exercicioFinal) {
                System.out.println(numero);
            }
            System.out.println(pula + "---> Mostrando as notas com Iterator:");
            Iterator<Double> iterator = exercicioFinal.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }


        //Removendo o primeiro item do set
            System.out.println(pula + "---> Removendo o primeiro item do set: " + exercicioFinal.pollFirst() + pula);


        //Adicionando novo número no set
            exercicioFinal.add(23.0);
            System.out.println("---> Adicionando o número 23 ao set: " + exercicioFinal +  pula);

        //Verificando o tamanho do set
            int tamanhoDoSet = exercicioFinal.size();
            System.out.println("---> Tamanho do Set é: " +tamanhoDoSet + pula );

        //Retorna se o set está vazio
        String estaVazio = (pula + "---> Tem números na lista?" + pula);
        boolean temNumero = exercicioFinal.isEmpty();
        if (!temNumero){
            System.out.println(estaVazio + "Ainda tem " +tamanhoDoSet + " números na lista"+ pula);
        } else {
            System.out.println("Acabou os números..." + pula);
        }


        System.out.println("The End...");

    }
}
