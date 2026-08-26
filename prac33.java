package startedjava;
import java.util.*;
public class prac33 {
    // frequency of an array element
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int a = sc.nextInt();
        sc.nextLine();
        String arr[] = new String[a];
        for(int  i  = 0; i < a; i++){
            arr[i] = sc.nextLine();
        }
        for(int i = 0; i < a; i++){
            // since string does not have indexof in java, im gonna use the meethod i found to change the string to an list which has access to indexof 
            if(Arrays.asList(arr).indexOf(arr[i]) == i){
                int count = 0;
                for(int j = 0; j< a; j++){
                    if(arr[i].equals(arr[j])){
                        count++;
                    }
                }
                System.out.println(arr[i]+ " Appears " + count + "times");
            }
        }
        sc.close();
    }
}
