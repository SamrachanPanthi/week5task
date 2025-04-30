import java.util.Scanner;

public class Qno3 {

    public static boolean isHarshad(int number) {
        int sum = 0;
        int temp = number;

        
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

       
        return number % sum == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isHarshad(number)) {
            System.out.println(number + " is a Harshad number.");
        } else {
            System.out.println(number + " is not a Harshad number.");
        }

        scanner.close();
    }
}

