package startedjava;
import java.util.*;
public class prac6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num % 2 == 0) {
            System.out.println("Not Prime");
        }
        else if (num % 3 == 0) {
            System.out.println("Not Prime");
        }
        else if (num % 5 == 0) {
            System.out.println("Not Prime");
        }
        else {
            System.out.println("Prime");
        }
        scanner.close();
}
}
