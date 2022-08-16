/*
    Author -: Devansh Desai
    Date -: 16-08-2022

    Problem -: Calculate Depreciation of Value

*/
package condtionals_loops.intermediate_java_programs;

import com.sun.xml.internal.stream.StaxXMLInputSource;

import java.util.Scanner;

public class Depreciation_of_value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of the Product");
        int amo = sc.nextInt();
        System.out.println("Enter the salvage value and years ");
        int salvage = sc.nextInt();
        float years = sc.nextFloat();
        System.out.println("The Depreciation value is "+(float)(amo -salvage)/years );
    }
}
