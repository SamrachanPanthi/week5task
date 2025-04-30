import java.util.Scanner;

public class Qno2 {
    
        public static void convertDays(int totalDays) {
            int years = totalDays / 365;
            int remainingDays = totalDays % 365;
    
            int months = remainingDays / 30;
            int days = remainingDays % 30;
    
            System.out.println(totalDays + " days = " + years + " year(s), " + months + " month(s), and " + days + " day(s)");
        }
    
         public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of days: ");
        int totalDays = scanner.nextInt();
        
        convertDays(totalDays);
        
        scanner.close();
    }
}
        
    
    
    

