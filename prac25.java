package startedjava;
import java.util.*;
public class prac25 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Size of the array : ");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements : ");
        for (int i = 0; i < n ; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Array before Sorting: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.println("Smallest element is: " + arr[arr.length - n]);
        scanner.close();
    }
}