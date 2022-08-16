/*
    Author -: Devansh Desai
    Date -: 16-08-2022

    Problem -: Find perimeter of circle

*/
package condtionals_loops.basic_java_programs;

import java.util.Scanner;

public class Perimeter_of_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle ");
        int radius = sc.nextInt();
        System.out.println("Perimeter of circle "+(2*3.14)*(radius));
    }
}
