package collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {
    public static void main(String[] args) {
        Set<Double> notasAlunos = new HashSet<>();

        //Adiciona notas no set
            notasAlunos.add(5.8);
            notasAlunos.add(9.3);
            notasAlunos.add(6.5);
            notasAlunos.add(10.0);
            notasAlunos.add(5.4);
            notasAlunos.add(7.3);
            notasAlunos.add(3.8);
            notasAlunos.add(4.0);

        var pulaLinha = ("\n");


        //Mostrando as notas cadastradas
            String notasCadastradas = ("---> Quais as notas cadastradas?" + pulaLinha);
            System.out.println(notasCadastradas + notasAlunos + pulaLinha);

        //Remove nota do set
            String removeNota = ("---> Removendo nota 3.8 cadastrada:" + pulaLinha);
            var delnota = notasAlunos.remove(3.8);
            System.out.println(removeNota + notasAlunos + pulaLinha);

        //Retorna a quantidade de itens no set
            String quantidadeDeItens = ("---> Quantas notas tem no cadastro?" + pulaLinha);
            int quantasNotas = notasAlunos.size();
            System.out.println(quantidadeDeItens + quantasNotas);

        //Navega em todos os itens do Iterator
            System.out.println("---> Mostrando as notas com Iterator:");
            Iterator<Double> iterator = notasAlunos.iterator();
            while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //Navegando em todos os itens com for
            System.out.println("---> Mostrando as notas usando for:");
            for (Double nota: notasAlunos){
            System.out.println(nota);

        //Apagando as notas
               /* notasAlunos.clear();

                */

        //Verificando se está vazio
            String delNotas = ("---> Verificando se tem nodas cadastradas:" + pulaLinha);
            boolean temNota = notasAlunos.isEmpty();
            if (!temNota) {
                System.out.println(delNotas + ("Tem ") + quantasNotas + (" notas cadastradas"));
            } else  {
                System.out.println("Não tem notas cadastradas" + pulaLinha);
            }
        }
    }
}
