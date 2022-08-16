/*
    Author -: Devansh Desai
    Date -: 16-08-2022

    Problem -: Average of N numbers

*/
package condtionals_loops.intermediate_java_programs;

import java.util.Scanner;

public class Average_of_n_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number ");
        int num = sc.nextInt(),avg=0;
        while(num>0){
            avg += num;
            num -=1;
        }
        System.out.println("The average of N Number is "+((float)avg/2));
        }
}
