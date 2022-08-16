/*
    Author -: Devansh Desai
    Date -: 16-08-2022

    Problem -: Input a number and print all the factors of that number

*/
package condtionals_loops.basic_java_programs;

import com.sun.xml.internal.stream.StaxXMLInputSource;

import java.util.Scanner;

public class Factors_of_all_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number ");
        int num = sc.nextInt();
        System.out.print("The factors of "+num+" is ");
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
