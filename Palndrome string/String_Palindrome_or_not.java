import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_Palindrome_or_not {
    public static void main(String args[]) throws IOException {
        String original, reverse = "";
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("\tEnter a string :--> ");
        // take input for user to checking String Palindrome or not

        original = Br.readLine();
        int length = original.length();

        for (int i = length - 1; i >= 0; i--) {

            reverse = reverse + original.charAt(i);
        }

        if (original.equals(reverse)) {
            // Compare the original and reversed strings to check if they are the same
            System.out.print("\tYour string is a palindrome.");
        } else {
            System.out.print("\tYour string Not palindrome.");
        }
    }

}
