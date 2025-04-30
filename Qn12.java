import java.util.Scanner;

public class Qn12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int cube = num * num * num;

        System.out.println("Cube of " + num + " is: " + cube);

        scanner.close();
    }
}
