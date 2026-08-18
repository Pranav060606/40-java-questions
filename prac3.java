package startedjava;
import java.util.*;
public class prac3 {
    // checking if a number is palindrome or not
        public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
    
        int original = num;
        int reverse = 0;
        while(num > 0){
            int diddy = num % 10;
            reverse = reverse * 10 + diddy;
            num = num / 10;
        }
        if( original == reverse){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
        scanner.close();
    }
}
