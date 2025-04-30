import java.util.Scanner;

public class Qno15 {

    
    public static int sumOfSquares(int number) {
        int sum = 0;

        
        while (number > 0) {
            int digit = number % 10;  
            sum += digit * digit;     
            number /= 10;             
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int result = sumOfSquares(num);

        System.out.println("Sum of squares of digits of " + num + " is: " + result);

        scanner.close();
    }
}
