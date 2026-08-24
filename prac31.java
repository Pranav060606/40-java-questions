package startedjava;
import java.util.*;

public class prac31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char currentchar = input.charAt(i);
            // If the character's first occurrence is at the current index,
            // it means we are seeing this character for the first time
            // if we are seeing the char for the second time it does not add it to result
            if (input.indexOf(currentchar) == i) {
                result += currentchar;
            }
        }
        // Convert to a char array
        char[] resultArray = result.toCharArray();
        System.out.println("Array after removing duplicates: " + Arrays.toString(resultArray));
        sc.close();
    }
}