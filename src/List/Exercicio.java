package List;

import java.util.*;

public class Exercicio {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");


        System.out.println(nomes);

        nomes.set(2,"Roberto");

        System.out.println(nomes);

        String posicaoOne = nomes.get(1);

        System.out.println(posicaoOne);

        nomes.remove(4);

        System.out.println(nomes);

        nomes.remove("João");

        //tamanho
        int a = nomes.size();

        System.out.println(a);

        // pesquisa dentro
        int  temJuliano = nomes.indexOf("Juliano");


        System.out.println(temJuliano);


        System.out.println("------------------------");

        List<String> nome = new ArrayList<>();
        nome.add("Ismael");
        nome.add("Rodrigo");

        nome.addAll(nomes);

        Collections.sort(nome);

        System.out.println(nome);


        boolean vazio = nome.isEmpty();

        System.out.println(vazio);






    }
}
