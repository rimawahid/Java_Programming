
package exception_Handling;

import java.util.Scanner;

public class QuotientWithIf2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integers : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if(num2 != 0){
            System.out.println(num1+ "/"+ num2+ " is " + (num1/num2));
        }else{
            System.out.println("Divition cannot be zero");
        }
    }
    
}
