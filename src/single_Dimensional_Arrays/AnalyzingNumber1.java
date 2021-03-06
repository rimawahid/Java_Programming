package single_Dimensional_Arrays;

import java.util.Scanner;

public class AnalyzingNumber1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of items : ");
        int n = input.nextInt();
        double[] number = new double[n];
        double sum = 0;

        System.out.print("Enter the numbers : ");
        for (int i = 0; i < n; i++) {
            number[i] = input.nextDouble();
            sum += number[i];
        }

        double average = sum / n;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (number[i]> average) {
                count++;
            }
        }
        
        System.out.println("Average is : "+ average);
        System.out.println("Number of elements above the average is : "+ count);

    }
}
