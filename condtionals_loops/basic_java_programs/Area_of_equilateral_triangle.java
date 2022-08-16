/*
    Author -: Devansh Desai
    Date -: 16-08-2022

    Problem -: Find Area Of Equilateral Triangle

*/
package condtionals_loops.basic_java_programs;

import java.util.Scanner;

public class Area_of_equilateral_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of triangle ");
        int side = sc.nextInt();
        System.out.println("Area of Equilateral Triangle "+(1.732/4)*(side*side));
    }
}
