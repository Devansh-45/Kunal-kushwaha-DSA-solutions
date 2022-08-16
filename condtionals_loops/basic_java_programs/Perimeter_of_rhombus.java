/*
    Author -: Devansh Desai
    Date -: 16-08-2022

    Problem -: FInd perimeter of Rhombus

*/
package condtionals_loops.basic_java_programs;

import java.util.Scanner;

public class Perimeter_of_rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of Rhombus ");
        int side = sc.nextInt();
        System.out.println("Perimeter of Rhombus "+(4*side));
    }
}
