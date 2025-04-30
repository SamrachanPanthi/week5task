public class Qno18 {

    
    public static int reverseNumber(int number) {
        int reversed = 0;

        
        while (number != 0) {
            int digit = number % 10;       
            reversed = reversed * 10 + digit;  
            number = number / 10;           
        }

        return reversed;
    }

    public static void main(String[] args) {
        int num = 12345;

        int reversed = reverseNumber(num);
        System.out.println("Reversed number: " + reversed);
    }
}
