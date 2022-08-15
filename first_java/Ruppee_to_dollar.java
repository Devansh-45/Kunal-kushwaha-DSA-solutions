/*
    Author -: Devansh Desai
    Date -: 15-08-2022

    Problem -: Rupee to Dollar
    Currently I don't know how to use URL connection and get real time dollar value so assuming 1 Dollar = 80
*/
package first_java;

import java.util.Scanner;

public class Ruppee_to_dollar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount in Rupee ");
        int rupee = sc.nextInt();
        System.out.println("The converted amount in Dollar is "+((float)rupee/80));
    }
}
