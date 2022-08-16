/*
    Author -: Devansh Desai
    Date -: 16-08-2022

    Problem -: Find Volume of sphere

*/
package condtionals_loops.basic_java_programs;

import java.util.Scanner;

public class Volume_of_sphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of sphere ");
        int radius = sc.nextInt();
        System.out.println("Volume of sphere "+((float)4/3*3.14159*(radius*radius*radius)));
    }
}
