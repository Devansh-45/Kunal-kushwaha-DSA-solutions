/*
    Author -: Devansh Desai
    Date -: 16-08-2022

    Problem -: Vowel or consonant

*/
package condtionals_loops.intermediate_java_programs;


import java.util.Scanner;

public class Vowel_or_consonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the alphabet ");
        String alpha = sc.next();
        char ch = alpha.charAt(0);
        if (ch=='a'|| ch=='A'|| ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U'||ch=='e'||ch=='E'){
            System.out.println("Vowel");
        }else {
            System.out.println("Consonant");
        }

    }
}
