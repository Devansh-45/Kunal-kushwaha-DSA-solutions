/*
    Author -: Devansh Desai
    Date -: 16-08-2022

    Problem -: Check Palindrome Number

*/
package condtionals_loops.intermediate_java_programs;

import java.util.Scanner;

public class Palindrome_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        int revnum=0,temp=num;
        while (num>0){
            revnum = (revnum*10)+(num%10);
            num =num/10;
        }
        if(revnum==temp){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not a Palindrome");
        }
    }
}
