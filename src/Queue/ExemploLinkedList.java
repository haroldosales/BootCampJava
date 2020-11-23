package Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {

    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Pamela");
        filaBanco.add("Patricia");
        filaBanco.add("Roberto");
        filaBanco.add("Fabio");
        filaBanco.add("Anderson");


        System.out.println(filaBanco);

    //   String clienteASerAtendido = filaBanco.poll();

      //  System.out.println(clienteASerAtendido);
    //  System.out.println(filaBanco);
       // filaBanco.clear();
        String primeiroCliente = filaBanco.peek();
        System.out.println(primeiroCliente);
      //  System.out.println(filaBanco);



          //  String primeiroClienteQuErro = filaBanco.element();

        //System.out.println(primeiroClienteQuErro);

        System.out.println(filaBanco);

        for(String cliente: filaBanco){
            System.out.println(cliente);
        }


        Iterator<String> iteratorFilaBanco = filaBanco.iterator();

        while (iteratorFilaBanco.hasNext()){
            System.out.println("--->" + iteratorFilaBanco.next());
        }


    }
}
