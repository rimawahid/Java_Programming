
package exception_Handling;

import java.io.File;
import java.util.Scanner;

public class ReadData15 {
    public static void main(String[] args)throws Exception {
        File file = new File("scores.txt");
        try (Scanner input = new Scanner (file)) {
            while(input.hasNext()){
                String firstName = input.next();
                String mi = input.next();
                String lastName = input.next();
                int score = input.nextInt();
                System.out.println(firstName + " " + mi + " "+ lastName + " "+ score);
            }   }
    }
}
