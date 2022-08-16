/*
    Author -: Devansh Desai
    Date -: 16-08-2022

    Problem -: Calculate Average Marks

*/
package condtionals_loops.intermediate_java_programs;

import java.util.Scanner;

public class Average_marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of 5 subject ");
        int total=0;
        for (int i=0;i<5;i++){
            int marks = sc.nextInt();
            if (marks >100){
                System.out.println("Invalid input");
                break;
            }else {
                total+=marks;
            }
        }
        System.out.println("The average marks of Student is "+(total/5));
    }
}
