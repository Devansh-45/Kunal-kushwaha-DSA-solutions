/*
    Author -: Devansh Desai
    Date -: 15-08-2022

    Problem -: Fibonacci series without Methods

*/
package first_java;

import java.util.Scanner;

public class Fibonacci_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the fibonacci series of it ");
        int fib = sc.nextInt();
        //Initializing first two numbers
        int fib1=1,fib2 = 1;
        int i=2,fib3 =0;
        if(fib == 1 || fib == 2){
                System.out.println("Fibonacci Series is "+fib1);
            } else if (fib<1) {
                System.out.println("Invalid input");
            }
            else {
                while (i < fib){

                fib3 = fib1 + fib2;
                fib1 = fib2;
                fib2 = fib3;
                i++;
                }
               System.out.println("Fibonacci Series is "+fib3);
            }

    }
}
