package startedjava;
import java.util.*;
public class prac27 {
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
        System.out.println("Largest element is: " + arr[arr.length - n + 1]);
        scanner.close();
    }
}