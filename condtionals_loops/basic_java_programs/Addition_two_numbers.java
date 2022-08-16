/*
    Author -: Devansh Desai
    Date -: 16-08-2022

    Problem -: Find Addition of two Numbers

*/
package condtionals_loops.basic_java_programs;

import com.sun.org.apache.xml.internal.resolver.readers.SAXCatalogParser;

import java.util.Scanner;

public class Addition_two_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Numbers ");
        int num1 = sc.nextInt(),num2 = sc.nextInt();;
        System.out.println("The sum of two number is "+(num1+num2));
    }
}
