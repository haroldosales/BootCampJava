package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Exercicio {

    public static void main(String[] args) {

        Queue<String> nomes = new LinkedList<>();

        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        System.out.println(nomes);

        String primeiro = nomes.peek();

        System.out.println(primeiro);
        System.out.println(nomes);

        System.out.println("----------");

        String remove = nomes.poll();

        System.out.println(remove);

        System.out.println(nomes);

        nomes.add("Daniel");
        System.out.println(nomes);


        int tamanho = nomes.size();

        System.out.println(tamanho);

        boolean vazio = nomes.isEmpty();


        System.out.println(vazio);

        boolean verificar = nomes.contains("Carlos");

        System.out.println(verificar);



    }
}
