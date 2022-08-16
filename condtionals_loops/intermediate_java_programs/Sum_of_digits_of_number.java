/*
    Author -: Devansh Desai
    Date -: 16-08-2022

    Problem -: Calculate Sum of Digits of number

*/
package condtionals_loops.intermediate_java_programs;

import java.util.Scanner;

public class Sum_of_digits_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt(),sum=0;
        while(num>0){
            sum += num%10;
            num=num/10;
        }
        System.out.println("The sum of digits of Number is "+sum);
    }
}
