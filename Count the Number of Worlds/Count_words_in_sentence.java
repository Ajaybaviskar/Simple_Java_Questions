import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Count_words_in_sentence {
    public static void main(String args[]) throws IOException {
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        int c = 0;
        System.out.print("\n\tEnter the String :--> "); // Tack input from user
        String sentence = Br.readLine();

        // Display the number of worlds in sentence and paragraph
        int count = sentence.length();
        System.out.println("\n\tNumber of Worlds and Special characters are : " + count);

        for (int i = 0; i < sentence.length(); i++) {
            if (!Character.isDigit(sentence.charAt(i)) && !Character.isLetter(sentence.charAt(i))
                    && !Character.isWhitespace(sentence.charAt(i)))
            // check condition for digit,letter, and white spaces
            {
                // counter Increment by 1
                c++;

            }

        }
        if (c == 0) {
            System.out.println("\n\tNO Special characters Founds ");
        } else {
            System.out.println("\n\tSpeical Characters " + c);
        }

    }
}