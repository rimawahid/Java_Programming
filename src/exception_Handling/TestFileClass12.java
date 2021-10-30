
package exception_Handling;

import java.io.File;

public class TestFileClass12 {
    public static void main(String[] args) {
        File file = new File("image");
        //file.mkdir();
        System.out.println("Does it exist? " + file.exists());
        System.out.println("The file has "+ file.length());
        System.out.println("Can it be read "+ file.canRead());
        System.out.println("Can it be write "+ file.canWrite());
        System.out.println("Is it be a directory ? "+ file.isDirectory());
        System.out.println("Is it a file "+ file.isFile());
        System.out.println("Is it a absolute? "+ file.isAbsolute());
        System.out.println("Is it hidden? "+ file.isHidden());
        System.out.println("Last modified on "+ file.lastModified());
        System.out.println("Absolute path is "+file.getAbsolutePath());
        if(file.delete()){
            System.out.println("delete suc..");
        }
    }
}
