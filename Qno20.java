import java.util.Scanner;

public class Qno20 {

    
    public static int getASCIIValue(char character) {
        return (int) character;  
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0); 

        int asciiValue = getASCIIValue(ch);

        System.out.println("The ASCII value of '" + ch + "' is: " + asciiValue);

        scanner.close();
    }
}
