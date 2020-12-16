package exercicioAritmeticos;

import java.util.Scanner;

public class ExecThree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positivo = 0;
        int par = 0;
        int negativo =0;
        int impar = 0;

        for(int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            if(num%2 == 0) {
                par++;
            }
            if(num%3 != 0) {
                impar++;
            }
            if(num > 1)  {
                positivo++;
            }
            if(num < 0) {

                negativo++;
            }

        }

        System.out.println(par+"   valor(es) par(es)");
        System.out.println(impar+"   valor(es) impar(es)");
        System.out.println(positivo+"  valor(es) positivo(s)");
        System.out.println(negativo+"  valor(es) negativo(s)");

    }

}
