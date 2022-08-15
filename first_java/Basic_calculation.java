/*
    Author -: Devansh Desai
    Date -: 15-08-2022

    Problem -: Basic calculation(+,-,*,/) using if condition

*/
package first_java;

import java.util.Scanner;

public class Basic_calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Numbers ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Enter the operation to be performed on numbers (+,-,*,/) ");
        //Use char instead of String as string don't have comparison(==) operator
        char operator = sc.next().charAt(0);
        if (operator == '+'){
            System.out.println("Addtion is "+(num1+num2));
        } else if (operator == '-') {
            if (num1>num2) {
                System.out.println("Subtraction is " + (num1 - num2));
            }else {
                System.out.println("Subtraction is "+(num2-num1));
            }
        } else if (operator == '*') {
            System.out.println("Multiplication is "+(num1*num2));
        } else if (operator == '/') {
            if (num2 == 0){
                System.out.println("Invalid operation");
            }
            else {
                System.out.println("Division is "+((float)num1/num2));
            }
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}
