/*
    Author -: Devansh Desai
    Date -: 16-08-2022

    Problem -: Future Investment Value
                FV = PV(1+i)^n

*/
package condtionals_loops.intermediate_java_programs;

import java.util.Scanner;

public class Future_investement_value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal Amount and interest value ");
        int pv = sc.nextInt();
        float i = sc.nextFloat();
        System.out.println("Enter number of years Z");
        float n = sc.nextFloat();
        System.out.println("The future Investment value is "+pv*(Math.pow((1+i/100),n)));
    }
}
