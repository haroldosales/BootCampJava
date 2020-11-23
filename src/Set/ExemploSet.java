package Set;

import java.util.HashSet;
import java.util.Set;

public class ExemploSet {



//  exercicos

    public static void main(String[] args) {
//        hastsat

        Set<Integer> titulo = new HashSet<>();
        titulo.add(3);
        titulo.add(88);
        titulo.add(20);
        titulo.add(44);
        titulo.add(3);

        System.out.println(titulo);

//        removendo
        titulo.remove(3);

        System.out.println(titulo);

        titulo.add(23);
       int x = titulo.size();

        System.out.println(x);
        System.out.println(titulo);
if (!titulo.isEmpty()){
    System.out.println("Cheio");
}else{
    System.out.println("Vazio");
}

    }

}
