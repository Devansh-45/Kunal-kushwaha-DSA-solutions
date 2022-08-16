/*
    Author -: Devansh Desai
    Date -: 16-08-2022

    Problem -: Calculate CGPA

*/
package condtionals_loops.intermediate_java_programs;

import java.util.Scanner;

public class Cgpa_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of 5 subject ");
        int total_marks=0;
        float percentage,CGPA;
        for (int i=0;i<5;i++){
            int mark = sc.nextInt();
            if (mark>100){
                System.out.println("Marks should be less than 100");
                break;
            }else {
                total_marks += mark;
            }
        }
        percentage = ((float)total_marks/500)*100;
        CGPA = (float) (percentage/9.5);
        System.out.println("The CGPA is "+CGPA);
    }
}
