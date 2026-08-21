package startedjava;
import java.util.*;
public class prac21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            
            if (input.indexOf(currentChar) == i) {
                int count = 0;
                for (int j = 0; j < input.length(); j++) {
                    if (input.charAt(j) == currentChar) {
                        count++;
                    }
                }
                if (count == 1) {
                    result+= currentChar;
                }
                System.out.println("Strinng after removing duplicates : " + result);
        }
        sc.close();
    }
}
}