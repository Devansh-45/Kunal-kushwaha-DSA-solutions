/*
    Author -: Devansh Desai
    Date -: 16-08-2022

    Problem -: Calculate Batting Average

*/
package condtionals_loops.intermediate_java_programs;

import java.util.Scanner;

public class Batting_average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the runs of last 10 innings ");
        int num=10,avg=0;
        while(num>0){
            int run = sc.nextInt();
            avg +=run;
            num--;
        }
        System.out.println("Batting Average is "+(avg/10));
    }
}
