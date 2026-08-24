package startedjava;
import java.util.*;
public class prac30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];
        boolean k = true;
        for(int i = 0; i < a; i++){
            arr[i] = sc.nextInt();
        }
        for(int j = a-1; j>0; j--){
            if(arr[j - 1] > arr[j]){
                k= false;
                break;
            }
        }
        if(k){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is not sorted");
        }
        sc.close();
    }
    
}
