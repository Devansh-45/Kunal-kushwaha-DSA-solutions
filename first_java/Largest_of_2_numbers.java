/*
    Author -: Devansh Desai
    Date -: 15-08-2022

    Problem -: Find largest of 2 numbers

*/
package first_java;

import java.util.Scanner;

public class Largest_of_2_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (num1>num2){
            System.out.println(num1+" is greater than "+num2);
        }else {
            System.out.println(num2+" is greater than "+num1);
        }
    }
}
