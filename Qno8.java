public class Qno8 {

    public static void swap(int a, int b) {
        System.out.println("Before swap: a = " + a + ", b = " + b);

        // Using a temporary variable
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swap: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;

        swap(num1, num2);
    }
}
