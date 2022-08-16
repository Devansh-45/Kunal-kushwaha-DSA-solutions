/*
    Author -: Devansh Desai
    Date -: 16-08-2022

    Problem -: Find Area of Rhombus

*/
package condtionals_loops.basic_java_programs;

import java.util.Scanner;

public class Area_of_rombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of two Diagonal  ");
        int Diag1 = sc.nextInt();
        int Diag2 = sc.nextInt();
        System.out.println("Area of Rhombus "+(float)(Diag1*Diag2)/2);
    }
}
