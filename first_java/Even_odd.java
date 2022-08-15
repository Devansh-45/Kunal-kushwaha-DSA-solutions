/*
    Author -: Devansh Desai
    Date -: 15-08-2022

    Problem -: To find a given number is even or odd

*/
package first_java;
import java.util.*;

public class Even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }

}
