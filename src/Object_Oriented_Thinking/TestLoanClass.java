
package Object_Oriented_Thinking;

import java.util.Scanner;

public class TestLoanClass {
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);
        
        //Enter annual interest rate
        System.out.print("Enter annual interest rat : ");
        double annualInterestRate = input.nextDouble();
        
        //Enter number of years
        System.out.print("Enter number of years : ");
        int numberOfYears = input.nextInt();
        
        //Enter loan amount
        System.out.print("Enter loan amount : ");
        double loanAmount = input.nextDouble();
        
        //create a loan object
        Loan loan  = new Loan(annualInterestRate, numberOfYears, loanAmount);
        System.out.println("The loan was created on "+ loan.getLoanDate());
        System.out.println("The monthly payment is "+ loan.getMonthlyPayment());
        System.out.println("The total payment is "+ loan.gettotalPayment());
        
    }
}
