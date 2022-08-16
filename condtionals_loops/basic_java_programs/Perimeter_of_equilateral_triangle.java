/*
 Author -: Devansh Desai
 Date -: 16-08-2022

 Problem -: Find perimeter of equilateral triangle

*/
package condtionals_loops.basic_java_programs;

import java.util.Scanner;

public class Perimeter_of_equilateral_triangle {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the side of triangle ");
            int side = sc.nextInt();
            System.out.println("Perimeter of Equilateral triangle "+(3*side));
        }
    }
