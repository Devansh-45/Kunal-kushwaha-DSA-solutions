/*
    Author -: Devansh Desai
    Date -: 16-08-2022

    Problem -: Subtract the Product and Sum of Digits of an Integer

*/
package condtionals_loops.basic_java_programs;

import java.util.Scanner;

public class Subtract_product_and_sum_of_digits_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt(),temp =num,sum=0,temp2=num,mul=1;
        while(temp>0){
            int rem = temp%10;
            sum += rem;
            temp = temp/10;
        }
        while (temp2>0){
            int rem = temp2%10;
            mul *=rem;
            temp2 = temp2/10;
        }
        System.out.println("The subtraction of Product and sum of Digits is "+(mul-sum));
    }
}
