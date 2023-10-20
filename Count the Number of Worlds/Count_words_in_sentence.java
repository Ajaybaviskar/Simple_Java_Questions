import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Count_words_in_sentence {
    public static void main(String args[]) throws IOException {
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the String :--> "); // Tack input from user
        String sentence = Br.readLine();

        // Display the number of worlds in sentence and paragraph
        int count = sentence.length();
        System.out.println("Number of Worlds : " + count);

    }
}