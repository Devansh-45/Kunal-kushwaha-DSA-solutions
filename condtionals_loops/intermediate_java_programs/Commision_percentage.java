/*
    Author -: Devansh Desai
    Date -: 16-08-2022

    Problem -: Calculate Commission Percentage

*/
package condtionals_loops.intermediate_java_programs;

import java.util.Scanner;

public class Commision_percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of product and Commission rate ");
        int num = sc.nextInt();
        float rate = sc.nextFloat();
        System.out.println("The Commission amount is "+(num*rate)/100);
    }
}
