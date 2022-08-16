/*
    Author -: Devansh Desai
    Date -: 16-08-2022

    Problem -: Factorial Program

*/
package condtionals_loops.intermediate_java_programs;

import java.util.Scanner;

public class Factorial_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt(),fact=1;
        while (num>0){
            fact *=num;
            num -=1;
        }
        System.out.println("The factorial of number is "+fact);
    }
}
