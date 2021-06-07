package collections.set;

import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args) {
        TreeSet<String> treeCapitais = new TreeSet<>();

        //Montando a arvore com capitais
            treeCapitais.add("Porto Alegre");
            treeCapitais.add("Florianópolis");
            treeCapitais.add("Curitiba");
            treeCapitais.add("São Paulo");
            treeCapitais.add("Rio de Janeiro");
            treeCapitais.add("Belo Horizonte");

            var pula= ("\n");
        //Mostrando as capitais
            System.out.println("---> As Capitais são: " + treeCapitais + pula);

        //Retorna a primeira capital no topo da árvore
            String primeiraCapital = treeCapitais.first();
            System.out.println("---> A Primeira capital é: " + primeiraCapital + pula);

        //Retorna a última capital no final da árvore
            String ultimaCapital = treeCapitais.last();
            System.out.println("---> A última capital é: " + ultimaCapital + pula);

        //Retorna a primeira capital abaixo na árvore da capital parametrizada
            System.out.println("---> Capital abaixo de Florianópolis é: " + treeCapitais.lower("Florianópolis") + pula);

        //Retorna a primeira capital acima na árvore da capital parametrizada
            System.out.println("---> Capital acima de Florianópolis é: " + treeCapitais.higher("Florianópolis") + pula);

        //Exibindo todas as capitais no console
            System.out.println("---> As capitais na árvore são: " + treeCapitais + pula);

        // Retorna a primeira capital no topo da árvore, removendo da listagem
            System.out.println("---> Primeira cidade no topo da árvore, e removida após sua consulta: "+ pula + treeCapitais.pollFirst() + pula);

        //Retorna a primeira capital no final da árvore, removendo da listagem
        System.out.println("---> Primeira capital no final da árvore é: " + pula + treeCapitais.pollLast() + pula);

        //Agora mostrando a árvore no status atual
        System.out.println("Agora a árvore tem as cidades: " +pula + treeCapitais);
    }
}
