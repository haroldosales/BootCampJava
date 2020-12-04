package Comparator;

import java.util.ArrayList;
import java.util.List;

public class ComparT {

    public static void main(String[] args) {

        List<Estudante> estudante = new ArrayList<>();

        estudante.add(new Estudante("Pedro", 19));
        estudante.add(new Estudante("Carlos", 23));
        estudante.add(new Estudante("Mariana",21));
        estudante.add(new Estudante("João",18));
        estudante.add(new Estudante("Thiago", 20));
        estudante.add(new Estudante("George",22));
        estudante.add(new Estudante("Larissa",21));

        System.out.println("-----Ordem da Inserção");
        System.out.println(estudante);

        estudante.sort((first,second) -> first.getIdade() -  second.getIdade());
        System.out.println("--- Ordenado com sort");
        System.out.println(estudante);





    }

}
