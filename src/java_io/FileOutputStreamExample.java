package java_io;
import java.io.*;
public class FileOutputStreamExample {

    public static void main(String[] args) {
        try {
            try (FileOutputStream fout = new FileOutputStream("D:\\IDB\\Module-03\\binaryIO\\testout.txt")) {
                String s = "Welcome to java point.";
                byte b [] = s.getBytes();
                fout.write(b);
                fout.write(65);
            }
            System.out.println("success..");
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
