/*
    Author -: Devansh Desai
    Date -: 16-08-2022

    Problem -: Calculate Sum of N numbers

*/
package condtionals_loops.intermediate_java_programs;

import java.util.Scanner;

public class Sum_of_n_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number ");
        int num = sc.nextInt(),sum=0;
        while(num>0){
            sum += num;
            num -=1;
        }
        System.out.println("The Sum of N Number is "+sum);
    }
}
