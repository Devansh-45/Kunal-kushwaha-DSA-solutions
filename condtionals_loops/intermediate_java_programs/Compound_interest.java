/*
    Author -: Devansh Desai
    Date -: 16-08-2022

    Problem -: Compound Interest Java Program

*/
package condtionals_loops.intermediate_java_programs;

import java.util.Scanner;

public class Compound_interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal Amount ");
        int principal = sc.nextInt();
        System.out.println("Enter rate of interest and time period");
        float rate = sc.nextFloat();
        float time = sc.nextFloat();
        System.out.println("The Final amount is "+ ((float)principal*((float) Math.pow(1+rate/100,time))));
    }
}
