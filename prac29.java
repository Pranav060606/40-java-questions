package startedjava;
import java.util.*;
public class prac29 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int num[] = new int[a];
        int store[] = new int[a];
        System.out.print("Enter the elements : ");
        for (int i = 0; i < a; i++){
            num[i] = scanner.nextInt();
        }
        System.out.println();
        int k = 0;
        for (int j = a-1; j >= 0; j--){
            store[k] = num[j];
            k++;
        }
        System.out.println("Before Reverse : "+Arrays.toString(num));
        System.out.println("After Reverse : "+Arrays.toString(store));
        scanner.close();
    }
}