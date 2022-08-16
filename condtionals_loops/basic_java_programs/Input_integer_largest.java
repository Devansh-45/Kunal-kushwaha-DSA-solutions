/*
    Author -: Devansh Desai
    Date -: 16-08-2022

    Problem -: Take integer inputs till the user enters 0 and print the largest number from all.

*/
package condtionals_loops.basic_java_programs;

import java.util.Scanner;

public class Input_integer_largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers ");
        int num = 1,large=0,num2=1;
        //Initialize num=1 so the loop can execute minimum one time
        while (num2!= 0){
            num = sc.nextInt();
            if (num!=0){
                num2 = sc.nextInt();
            }else {
                break;
            }
            if (num2>num && large<num2){
                    large = num2;
                }else if(large<num){
                    large = num;
                }
            }
        System.out.println("The largest among all number is "+large);
        }
    }

