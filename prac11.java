package startedjava;
import java.util.*;
public class prac11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int digits = String.valueOf(n).length();
        double sum = 0;
        int c;
        while(n > 0){
            c = n % 10;
            n = n / 10;
            sum = sum + Math.pow(c, digits);
        }
        if(temp == sum){
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
        sc.close();
    }
}