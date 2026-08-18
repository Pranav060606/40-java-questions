package startedjava;
import java.util.*;
public class prac6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean isPrime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
                }
            }
            if (isPrime) {
                System.out.print("Prime");
            } else {
                System.out.print("Not Prime");
            }
            scanner.close();
        }
}
