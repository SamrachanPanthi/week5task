import java.util.Scanner;

public class Qno13 {

    
    public static boolean isDuckNumber(int number) {
        
        if (number == 0 || String.valueOf(number).charAt(0) == '0') {
            return false;
        }

        
        String numStr = String.valueOf(number);
        return numStr.contains("0");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isDuckNumber(num)) {
            System.out.println(num + " is a Duck number.");
        } else {
            System.out.println(num + " is not a Duck number.");
        }

        scanner.close();
    }
}
