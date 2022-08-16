/*
    Author -: Devansh Desai
    Date -: 16-08-2022

    Problem -: Power Program in Java

*/
package condtionals_loops.intermediate_java_programs;

import java.util.Scanner;

public class Power_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number and power of it ");
        int num = sc.nextInt(),pow = sc.nextInt(),ans=1;
        for(int i =0;i<pow;i++){
            ans *=num;
        }
        System.out.println("The power of number is "+ans);
    }
}
