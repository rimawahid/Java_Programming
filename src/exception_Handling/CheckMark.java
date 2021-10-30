package exception_Handling;

public class CheckMark {

    public static void main(String[] args) {
//        System.out.println(2.50 / 0);
//        long value = Long.MAX_VALUE + 1;
//        System.out.println(value);
//        for (int i = 0; i < 2; i++) {
//      System.out.print(i + " ");
//      try {
//        System.out.println(1 / 0);
//      }
//      catch (Exception ex) {
//      }
//    }
//        
//        try {
//      for (int i = 0; i < 2; i++) {
//        System.out.print(i + " ");
//        System.out.println(1 / 0);
//      }
//    }
//    catch (Exception ex) {
//    }

//try {
//      int[] list = new int[10];
//      System.out.println("list[10] is " + list[10]);      
//    }   
//    catch (ArithmeticException ex) {
//      System.out.println("ArithmeticException");   
//    }   
//    catch (RuntimeException ex) {
//      System.out.println("RuntimeException");   
//    }   
//    catch (Exception ex) {   
//      System.out.println("Exception");   
//    }   

try {
      method();
      System.out.println("After the method call");   
    }   
    catch (RuntimeException ex) {
      System.out.println("RuntimeException in main");   
    }   
    catch (Exception ex) {
      System.out.println("Exception in main");   
    }   
  }

  static void method() throws Exception {
    try {
      String s ="abc";
      System.out.println(s.charAt(3));
    }
    catch (RuntimeException ex) {
      System.out.println("RuntimeException in method()");   
    }   
    catch (Exception ex) {
      System.out.println("Exception in method()");   
    }
  

    }
}
