package startedjava;
import java.util.*;
public class prac23{
    //Frequency of characters in a string
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int nonrepeat = 0;
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
                
                if(count == 1)
                    System.out.println("First Two Non-Repeating Characters : " + currentChar + " = " + count);
                    nonrepeat++;
                if(nonrepeat == 2)
                    break;
                if(nonrepeat == 0)
                    System.out.println("No Non-Repeating Characters");
            }
        }
        sc.close();
    }
}

