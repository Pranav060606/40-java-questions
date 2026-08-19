package startedjava;
import java.util.*;
public class prac12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        int perfectnum = 0;
        for(int i = 1; i <= n / 2; i++){
            if(n%i == 0){
                perfectnum += i;
                System.out.print(perfectnum + " ");
            }
        }
        if(perfectnum == num)
            System.out.println(num + " is a perfect number");
        else
            System.out.println(num + " is not a perfect number");
        sc.close();
    }
}
