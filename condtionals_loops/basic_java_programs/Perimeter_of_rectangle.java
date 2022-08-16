/*
    Author -: Devansh Desai
    Date -: 16-08-2022

    Problem -: Find Perimeter of rectangle

*/
package condtionals_loops.basic_java_programs;

import java.util.Scanner;

public class Perimeter_of_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of sides of rectangle ");
        int l = sc.nextInt();
        int w = sc.nextInt();
        System.out.println("Perimeter of rectangle "+(2*(l+w)));
    }
}
