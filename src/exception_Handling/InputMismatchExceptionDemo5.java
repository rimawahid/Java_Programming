package exception_Handling;

import java.util.*;
import java.util.Scanner;

public class InputMismatchExceptionDemo5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;
        do {
            try {
                System.out.print("Enter an integer : ");
                int num = input.nextInt();
                
                //Display the result
                System.out.println("The number entered is " + num);
                
                continueInput = false;
            } catch (InputMismatchException e) {
                System.out.println("Try again. (" +
                        "Incorrect input : an integer is required)");
                input.nextLine();
            }

        } while (continueInput);
    }
}
