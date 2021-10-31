package single_Dimensional_Arrays;

public class TestArray {

    public static void main(String[] args) {
        int x = 1;
        int[] y = new int[10];

        m(x, y);
        System.out.println("x is : " + x);
        System.out.println("y is : " + y[0]);
    }

    public static void m(int num, int[] numbers) {
        num = 2002;
        numbers[0] = 5555;
    }
}
