// Anagram Number is or not
import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {
        String a = "listen";
        String b = "silent";

        char[] c1 = a.toCharArray();                  // Convert the strings to char arrays
        char[] c2 = b.toCharArray();

        if (c1.length != c2.length) {                      // Check if the lengths are equal
            System.out.println("Not Anagram");
            return;                                           // Exit the program if lengths differ
        }

        Arrays.sort(c1);                                      // Sort the arrays
        Arrays.sort(c2);

        for (int i = 0; i < c1.length; i++) {
            if (c1[i] != c2[i]) {                                // Compare each character
                System.out.println("Not Anagram");
                return;                                           // Exit the program if characters do not match
            }
        }

        System.out.println("Anagram");
    }
}

    


