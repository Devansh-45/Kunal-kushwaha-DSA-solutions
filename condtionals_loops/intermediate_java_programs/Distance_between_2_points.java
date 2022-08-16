/*
    Author -: Devansh Desai
    Date -: 16-08-2022

    Problem -:  Calculate Distance Between Two Points

*/
package condtionals_loops.intermediate_java_programs;

import java.util.Scanner;

public class Distance_between_2_points {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two points to find distance between them ");
        int d1 = sc.nextInt(),d2 = sc.nextInt();
        System.out.println("Distance between two points is "+(d1-d2));
    }
}
