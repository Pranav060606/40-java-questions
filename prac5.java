package startedjava;
import java.util.*;
public class prac5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int str = scanner.nextInt();
        int num = str;
        int reverse = 0;
        while(num > 0){
            int bleh = num % 10;
            reverse = reverse * 10 + bleh;
            num = num / 10;
        }
        System.out.println("Reversed: " + reverse);
        scanner.close();
    }
}
