package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class   ExampleList {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        nomes.add("Joao");
        nomes.add("Maria");
        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("José");
        nomes.add("Aa");


        System.out.println(nomes);
        nomes.set(2,"J");

        Collections.sort(nomes);

        System.out.println(nomes);
        nomes.set(2,"Larissa");

        nomes.remove(4);
        nomes.remove("J");
        System.out.println(nomes);

       String x =  nomes.get(2);
       int a = nomes.size();
        System.out.println(x + a);

        nomes.clear();

        boolean listaVazia = nomes.isEmpty();

        System.out.println(listaVazia);







    }

}
