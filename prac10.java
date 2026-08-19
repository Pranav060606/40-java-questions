package startedjava;
import java.util.*;
public class prac10 {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp;
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println(a);
        sc.close();
    }
}
