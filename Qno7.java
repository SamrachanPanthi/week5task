import java.util.Scanner;

public class Qno7 {


    public static boolean isPalindrome(int number) {
        int original = number;
        int reversed = 0;

        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return original == reversed;
    }

    
    public static boolean isPrime(int number) {
        if (number <= 1) return false;

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isPalindrome(num) && isPrime(num)) {
            System.out.println(num + " is a Palindrome Prime.");
        } else {
            System.out.println(num + " is NOT a Palindrome Prime.");
        }

        scanner.close();
    }
}
