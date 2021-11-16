
package serialization_Deserializatin;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Depersist {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("D:\\IDB\\Module-03\\binaryIO\\Student.txt");
            ObjectInputStream oin= new ObjectInputStream(fin);
            Student s = (Student)oin.readObject();
            System.out.println("ID : "+s.id+"\n"+"Name : " +s.name+"\n"+"Roll : "+s.roll);
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
