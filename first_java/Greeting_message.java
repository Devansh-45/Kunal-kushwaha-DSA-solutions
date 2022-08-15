/*
    Author -: Devansh Desai
    Date -: 15-08-2022

    Problem -: Greeting Message for particular name

*/
package first_java;

import java.util.Scanner;

public class Greeting_message {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name ");
        String name = sc.next();
        System.out.println("Good Morning "+name);
    }
}
