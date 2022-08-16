/*
    Author -: Devansh Desai
    Date -: 16-08-2022

    Problem -: Find Area of circle

*/
package condtionals_loops.basic_java_programs;

import java.util.Scanner;

public class Area_of_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius ");
        int rad = sc.nextInt();
        System.out.println("Are of circle is "+(3.14*(rad*rad)));
    }
}
