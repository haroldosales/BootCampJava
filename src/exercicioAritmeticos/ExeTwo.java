package exercicioAritmeticos;

import java.util.Scanner;

public class ExeTwo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int num = 0;
        num = sc.nextInt();


        for(int i = 1; i <= num; i++) {

            if(i%2 == 0) {

                System.out.println(i);


            }



        }


    }

}
