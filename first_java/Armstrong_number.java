/*
    Author -: Devansh Desai
    Date -: 16-08-2022

    Problem -: Check weather a number is Armstrong or not

*/
package first_java;

import java.util.*;

public class Armstrong_number {
    static int order(int x){
        // This method is used to find decimal digits of number
        int incr=0;
        while(x>0){
            x=x/10;
            incr++;
        }
        return incr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int armS = sc.nextInt();
        int temp = armS;
        int decimal = order(armS);
        int ans = 0;
        while(temp>0){
            int rem = temp%10;
            //Armstrong Logic
            ans += Math.pow(rem,decimal);
            temp = temp/10;
        }
        if(ans == armS){
            System.out.println("Armstrong Number");
        }else {
            System.out.println("Not an Armstrong Number");
        }
    }
}
