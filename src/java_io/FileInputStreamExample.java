package java_io;

import java.io.*;

public class FileInputStreamExample {

    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("D:\\IDB\\Module-03\\binaryIO\\testout.txt");

//            read single character
            int i=fin.read();  
            System.out.print((char)i);    

            
//            read all characters
//            int i = 0;
//            while ((i = fin.read()) != -1) {
//                System.out.print((char) i);
//                
//            }
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
