/*
    Author -: Devansh Desai
    Date -: 16-08-2022

    Problem -: Perfect Number

*/
package condtionals_loops.intermediate_java_programs;

import java.util.Scanner;

public class Perfect_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number ");
        int num = sc.nextInt(),PF=0;
        for (int i=1;i<num;i++){
            if(num%i==0){
                PF +=i;
            }
        }
        if(PF==num){
            System.out.println("The given number is perfect Number ");
        }else {
            System.out.println("Not a perfect number ");
        }
    }
}
