package startedjava;
import java.util.*;
public class prac4 {
    // checking if a string is palindrome or not
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        boolean isPalindrome = true;
        int len = str.length() - 1;
        for(int i = 0; i < str.length() - 1; i++) {
            if(str.charAt(i) != str.charAt(len - i)) {
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        scanner.close();
    }
}
