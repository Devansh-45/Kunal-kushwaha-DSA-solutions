/*
    Author -: Devansh Desai
    Date -: 16-08-2022

    Problem -: LCM of two Numbers

*/
package condtionals_loops.intermediate_java_programs;

import java.util.Scanner;

public class Lcm_og_two_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int HCF=0;
        for(int i=1;i<=num2;i++){
            if(num1%i==0 && num2%i==0){
                if(HCF<i){
                    HCF =i;
                }
            }
        }
      System.out.println("The least common multiple of two number is "+((num1*num2)/HCF));
    }
}
