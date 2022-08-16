/*
    Author -: Devansh Desai
    Date -: 16-08-2022

    Problem -: Find Perimeter of Square

*/
package condtionals_loops.basic_java_programs;

import java.util.Scanner;

public class Perimeter_of_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of square ");
        int side = sc.nextInt();
        System.out.println("Perimeter of square "+(4*side));
    }
}
