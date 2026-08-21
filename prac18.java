package startedjava;
import java.util.*;
public class prac18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int vowelcount = 0;
        int consonantcount = 0;
        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowelcount++;
            }
            else if((ch >= 'a' && ch <= 'z')){
                consonantcount++;
            }
        }
        System.out.println("Vowels: " + vowelcount);
        System.out.println("Consonants: " + consonantcount);

        sc.close();}
}
