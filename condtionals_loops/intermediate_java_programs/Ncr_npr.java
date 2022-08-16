/*
    Author -: Devansh Desai
    Date -: 16-08-2022

    Problem -: Find NCR and NPR

*/
package condtionals_loops.intermediate_java_programs;

import java.util.Scanner;

public class Ncr_npr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n and r ");
        int n = sc.nextInt(),r= sc.nextInt();
        float NPR=1,NCR=1;
        while(r>0){
            NPR *= n;
            NCR *= ((float) n/r);
            r--;
            n--;
        }
        System.out.println("The NCR and NPR of the numbers is "+NCR+" "+NPR);
    }
}
