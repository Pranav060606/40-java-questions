package startedjava;
import java.util.*;
public class prac14 {
    // Lcm of 2 numbers
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int m = sc.nextInt();
        int dummy = n * m;
        int lcm = 0;
        int gcd = 1;
        while(m != 0){
            gcd = n % m;
            n = m;
            m = gcd;
        }
        lcm = dummy / n;
        System.out.println(lcm);
        sc.close();
    }
}
