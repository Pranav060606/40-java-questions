package startedjava;
import java.util.*;
public class prac16 {
    // sum of counts of digits of a number
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        int sum = 0;
        int countsum = 0;
        while(n != 0){
            sum = (int)(n % 10);
            n /= 10;
            countsum += sum;
        }
        System.out.println(countsum);
        sc.close();
    }
    
}
