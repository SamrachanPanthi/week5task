import java.util.Scanner;

public class Qno17 {

    
    public static boolean isKaprekar(int number) {
        
        int square = number * number;

        
        String squareStr = String.valueOf(square);
        int length = squareStr.length();

        
        String rightPart = squareStr.substring(length / 2);
        String leftPart = squareStr.substring(0, length / 2);

        
        int left = leftPart.isEmpty() ? 0 : Integer.parseInt(leftPart);
        int right = Integer.parseInt(rightPart);

       
        return (left + right == number);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isKaprekar(num)) {
            System.out.println(num + " is a Kaprekar number.");
        } else {
            System.out.println(num + " is not a Kaprekar number.");
        }

        scanner.close();
    }
}
