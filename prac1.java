package startedjava;
import java.util.*;
public class prac1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for(int i = 0; i < q; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int sum = a;
            int mult = 1;
            for (int j = 0; j < n; j++) {
                sum = sum + mult * b;
                // 0 + 1 * 2 = 2 -> first loop
                // 2 + 2 * 2 = 2 + 4 = 6 -> second loop
                // 6 + 4 * 2 = 6 + 8 = 14 -> third loop
                System.out.print(sum + " ");
                mult = mult * 2;
            }
            System.out.println();
        }
        sc.close();
    }
}