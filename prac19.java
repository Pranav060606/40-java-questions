package startedjava;
import java.util.*;
public class prac19 {
    //Frequency of characters in a string
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            
            // To prevent counting the same letter twice, we check if it appeared earlier
            if (input.indexOf(currentChar) == i) {
                
                // Count how many times this specific character appears
                int count = 0;
                for (int j = 0; j < input.length(); j++) {
                    if (input.charAt(j) == currentChar) {
                        count++;
                    }
                }
                
                // Print the result for this character
                System.out.println(currentChar + " appears " + count + " times");
            }
        }
        sc.close();
    }
}
