package java_io;

import java.io.*;

public class BufferedOutputStreamExample {

    public static void main(String[] args) throws Exception {
        FileOutputStream fout = new FileOutputStream("D:\\IDB\\Module-03\\binaryIO\\testout1.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        String s = "Welcome to java point.";
        byte b[] = s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        System.out.println("success");
    }
}
