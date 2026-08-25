package startedjava;
import java.util.*;
public class prac32 {
    // finding a missing number in an array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int sum1[] = new int[n];
        int sum2[] = new int[k];
        int totalsum1 = 0;
        int totalsum2 = 0;
        for(int i = 1; i < n; i++){
            sum1[i-1] = i;
            totalsum1 += sum1[i-1];
        }
        for(int j=1; j<k; j++){
            sum2[j-1] = j;
            totalsum2 += sum2[j-1];
        }
        int result = totalsum1 - totalsum2;
        if(sum1 == sum2){
            System.out.println("No missing numbers");
        }else{
            System.out.println("Missing number is : " + result);
        }
        sc.close();
    }
}
