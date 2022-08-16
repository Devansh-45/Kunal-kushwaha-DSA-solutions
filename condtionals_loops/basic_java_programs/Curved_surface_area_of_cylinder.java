/*
    Author -: Devansh Desai
    Date -: 16-08-2022

    Problem -: Curved surface area fo Cylinder

*/
package condtionals_loops.basic_java_programs;

import java.util.Scanner;

public class Curved_surface_area_of_cylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of radius and height of Cylinder ");
        int radius = sc.nextInt();
        int height = sc.nextInt();
        System.out.println("Curved surface area of Cylinder "+2*3.14159*(radius*height));
    }
}
