/*
    Author -: Devansh Desai
    Date -: 16-08-2022

    Problem -: Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of
     positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user
     enters a zero.

*/
package condtionals_loops.intermediate_java_programs;

import java.util.Scanner;

public class Sum_of_negative_and_positive_even_positive_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers ");
        int num = 1,odd_sum=0,neg_sum=0,even_sum=0;
        //Initialize num=1 so the loop can execute minimum one time
        while (num != 0){
            num = sc.nextInt();
            if (num<0){
                neg_sum += num;
            }else if (num%2==0){
                even_sum += num;
            }else {
                odd_sum += num;
            }
        }
        System.out.println("The sum of Negative number is "+neg_sum);
        System.out.println("The sum of Positive even number is "+even_sum);
        System.out.println("The sum of Positive odd number is "+odd_sum);
    }
}
