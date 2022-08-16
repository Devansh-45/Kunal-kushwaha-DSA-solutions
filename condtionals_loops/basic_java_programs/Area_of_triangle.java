/*
    Author -: Devansh Desai
    Date -: 16-08-2022

    Problem -: Find Area of Triangle

*/
package condtionals_loops.basic_java_programs;

import java.util.Scanner;

public class Area_of_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height and breadth ");
        int height = sc.nextInt();
        int breadth = sc.nextInt();
        System.out.println("Area of Triangle "+(float)(height*breadth)/2);
    }
}
