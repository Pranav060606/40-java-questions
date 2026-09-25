package startedjava;
import java.lang.Math;
public class prac35 {
    public static void main(String[] args) {
    int n = 343;
    int val = n;
    int a = n;
    int count = 0;
    while(n > 0){
        count++;
        n/=10;
    }
    double armstrong = 0;
    while(val > 0){
        int temp = val % 10;
        armstrong += Math.pow(temp,count);
        val /= 10;
    }
    if(armstrong == a){
        System.out.println(a + " is an Armstrong number");
    }else{
        System.out.println(a + " is not an Armstrong number");
}
}
}