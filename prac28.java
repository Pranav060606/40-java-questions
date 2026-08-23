package startedjava;
import java.util.*;
public class prac28 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Size of the array : ");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        System.out.print("Enter the elements : ");
        for (int i = 0; i < n ; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        System.out.println("Sum Of The Elements In The Array : " +sum);
        scanner.close();
    }
}