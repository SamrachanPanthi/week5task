import java.util.Scanner;

public class Qno10 {

    public static int findSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int n = scanner.nextInt();

        if (n > 0) {
            int sum = findSum(n);
            System.out.println("Sum of first " + n + " natural numbers is: " + sum);
        } else {
            System.out.println("Please enter a positive number.");
        }

        scanner.close();
    }
}
