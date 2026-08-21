package startedjava;
import java.util.*;
public class prac17 {
    // reversing words of a string
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String cleaninput = str.trim();
        String[] word = cleaninput.split(" ");
        String reverse = "";

        for(int i = word.length - 1; i >=0; i--){
            reverse = reverse + word[i];

            if(i > 0){
                reverse = reverse + " ";
            }
        }
        System.out.println(reverse);

        sc.close();}
}
