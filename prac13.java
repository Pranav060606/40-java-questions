package startedjava;
import java.util.*;
public class prac13 {
    // Gcd of a 2 numbers
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int m = sc.nextInt();
        int gcd = 1;
       while(m != 0){
           gcd= n % m;
           n = m;
           m = gcd;
        }
        System.out.println(n);
        sc.close();
    }
    
}
