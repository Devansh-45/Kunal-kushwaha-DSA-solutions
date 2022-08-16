/*
    Author -: Devansh Desai
    Date -: 16-08-2022

    Problem -: Find total surface area of cube

*/
package condtionals_loops.basic_java_programs;

import java.util.Scanner;

public class Total_surface_area_of_cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of cubes ");
        int side = sc.nextInt();
        System.out.println("Total surface area of Cube "+(6*(side*side)));
    }
}
