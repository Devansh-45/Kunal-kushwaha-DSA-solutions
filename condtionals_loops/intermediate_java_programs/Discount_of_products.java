/*
    Author -: Devansh Desai
    Date -: 16-08-2022

    Problem -: Find Discounts of Product

*/
package condtionals_loops.intermediate_java_programs;

import java.util.Scanner;

public class Discount_of_products {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of product ");
        int num = sc.nextInt();
        float rate = sc.nextFloat();
        System.out.println("The amount after discount is "+(num -(num*rate)/100));
    }
}
