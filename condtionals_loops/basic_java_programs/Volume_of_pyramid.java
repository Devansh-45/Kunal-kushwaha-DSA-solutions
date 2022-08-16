/*
    Author -: Devansh Desai
    Date -: 16-08-2022

    Problem -: Find Volume of Pyramid

*/
package condtionals_loops.basic_java_programs;

import java.util.Scanner;

public class Volume_of_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of length,width and height of pyramid ");
        int lenght = sc.nextInt(),width = sc.nextInt();
        int height = sc.nextInt();
        System.out.println("Volume of Pyramid "+(float)(lenght*width*height)/3);
    }
}
