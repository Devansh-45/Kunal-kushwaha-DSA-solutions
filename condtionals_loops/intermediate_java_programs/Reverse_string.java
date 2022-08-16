/*
    Author -: Devansh Desai
    Date -: 16-08-2022

    Problem -: Reverse a String

*/
package condtionals_loops.intermediate_java_programs;

import java.util.Scanner;

public class Reverse_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String str = sc.next();
        char ch;
        String revstr="";
        for (int i=0;i<str.length();i++){
            ch = str.charAt(i);
            System.out.println(ch);
            revstr = ch + revstr;
        }
        System.out.println("Reversed String is "+revstr);
    }
}
