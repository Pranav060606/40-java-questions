package startedjava;
import java.util.*;
public class prac15 {
    // Count the number of digits in a number
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = String.valueOf(n).length();
        System.out.println(count);
        sc.close();
    }
}

// another way

class prac15b {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n != 0){
            n /= 10;
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}
