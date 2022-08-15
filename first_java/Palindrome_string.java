/*
    Author -: Devansh Desai
    Date -: 16-08-2022

    Problem -: Check weather a String is Palindrome or not

*/
package first_java;

import java.util.Scanner;


public class Palindrome_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String str = sc.next();
        CheckPali(str);
        if(CheckPali(str) == true){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not a Palindrome");
        }
    }

    static boolean CheckPali(String str) {
        int i=0, len = str.length();
        for (i=0;i<len/2;i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
