/*
    Author -: Devansh Desai
    Date -: 16-08-2022

    Problem -: Find Perimeter of Parallelogram

*/
package condtionals_loops.basic_java_programs;

import java.util.Scanner;

public class Perimeter_of_parallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of sides of parallelogram ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Perimeter of Parallelogram "+(2*(a+b)));
    }
}
