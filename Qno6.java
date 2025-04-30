import java.util.Scanner;
public class Qno6 {

    public static void calculateSimpleInterest(double principal, double rate, double time) {
        double interest = (principal * rate * time) / 100;
        System.out.println("The Simple Interest is: " + interest);
    }    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principal amount: ");
        double principal = sc.nextDouble();

        System.out.println("Enter the rate of interest: ");
        double rate = sc.nextDouble();

        System.out.println("Enter the time period in years: ");
        double time = sc.nextDouble();

        calculateSimpleInterest(principal, rate, time);   
     }
   
}