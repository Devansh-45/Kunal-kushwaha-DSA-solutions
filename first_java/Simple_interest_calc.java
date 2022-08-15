/*
    Author -: Devansh Desai
    Date -: 15-08-2022

    Problem -: Calculate Simple Interest

*/
package first_java;

import java.util.Scanner;

public class Simple_interest_calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal Amount ");
        float principal = sc.nextFloat();
        System.out.println("Enter number of years ");
        float years = sc.nextFloat();
        System.out.println("Enter rate of Interest ");
        float rate = sc.nextFloat();
        //Simple Interest formula A = P(1+rt)
        System.out.println("Your simple Interest is "+ principal*(1+(rate*years)));
    }
}
