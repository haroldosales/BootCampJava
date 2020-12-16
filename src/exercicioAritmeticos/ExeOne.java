package exercicioAritmeticos;

import java.util.Scanner;

public class ExeOne {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        double num = 0;
        int contPar = 0;

        for(int i = 0; i <= 5; i++){
            num = sc.nextDouble();

            if(num > 0){
                contPar++;
            }


        }
        System.out.println( contPar + " valores positivos");

    }
}
