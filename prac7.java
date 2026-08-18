package startedjava;
public class prac7 {
    // prime number range
    public static void main(String[] args) {
        int start = 1;
        int end = 100;
        for(int num = start; num <= end; num++){
            if(num<=1){
                continue;
            }
            boolean isPrime = true;
            for(int i = 2; i < num; i++){
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(num + " ");
            }

        }
}
}