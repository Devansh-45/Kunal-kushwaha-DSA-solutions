/*
    Author -: Devansh Desai
    Date -: 16-08-2022

    Problem -: Find volume of Prism

*/
package condtionals_loops.basic_java_programs;

import java.util.Scanner;

public class Volume_of_prism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Volume of prism is Bh where B is area of rectangle
        System.out.println("Enter the value of sides of Rectangle ");
        int w = sc.nextInt();
        int l = sc.nextInt();
        System.out.println("Enter the height ");
        int height = sc.nextInt();
        System.out.println("Volume of prism "+(w*l)*height);
    }
}
