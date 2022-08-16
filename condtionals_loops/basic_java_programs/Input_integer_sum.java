/*
    Author -: Devansh Desai
    Date -: 16-08-2022

    Problem -: Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

*/
package condtionals_loops.basic_java_programs;

import java.util.Scanner;

public class Input_integer_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers ");
        int num = 1,add=0;
        //Initialize num=1 so the loop can execute minimum one time
        while (num != 0){
             num = sc.nextInt();
             add +=num;
        }
        System.out.println("The sum of all Number is "+add);
    }
}
