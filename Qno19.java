import java.util.Scanner;

public class Qno19 {

    
    public static void generateFibonacci(int n) {
        int first = 0, second = 1;
        
       
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        generateFibonacci(n);

        scanner.close();
    }
}
