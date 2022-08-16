/*
    Author -: Devansh Desai
    Date -: 16-08-2022

    Problem -: Leap year or not

*/
package condtionals_loops.intermediate_java_programs;

import java.util.Scanner;

public class Leap_year_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year ");
        int year = sc.nextInt();
        if (year%400==0 || (year%100!=0 && year%4==0) ){
            System.out.println("Leap year");
        }else {
            System.out.println("not a leap Year");
        }
    }
}
