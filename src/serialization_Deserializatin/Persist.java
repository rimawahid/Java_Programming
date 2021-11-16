
package serialization_Deserializatin;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Persist {
    public static void main(String[] args) {
        try {
            Student s1 = new Student(101, "Rafi",12345);
            FileOutputStream fout = new FileOutputStream("D:\\IDB\\Module-03\\binaryIO\\Student.txt");
            ObjectOutputStream Oout= new ObjectOutputStream(fout);
            Oout.writeObject(s1);
            Oout.close();
            System.out.println("success..");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
