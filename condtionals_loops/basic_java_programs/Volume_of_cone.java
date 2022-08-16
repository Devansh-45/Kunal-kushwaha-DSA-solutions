/*
    Author -: Devansh Desai
    Date -: 16-08-2022

    Problem -: Find Volume of cone

*/
package condtionals_loops.basic_java_programs;

import java.util.Scanner;

public class Volume_of_cone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of radius and height of cone ");
        int radius = sc.nextInt();
        int height = sc.nextInt();
        System.out.println("Volume of cone "+(3.14159*(radius*radius)*((float)height/3)));
    }
}
