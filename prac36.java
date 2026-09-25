package startedjava;
public class prac36 {
    public static void main(String[] args) {
        int[] arr = {5,3,9,2,7,1,4,6,8};
        for(int i = 0; i< arr.length;i++){
            for(int j = i+1; j< arr.length;j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted array: ");
        for(int i = 0; i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
