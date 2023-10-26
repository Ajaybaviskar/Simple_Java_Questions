import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.io.IOException;

public class Fibonacci_series {
    public static void main(String[] args) throws IOException {
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter Number :- ");
            // int no = Ingeter.parseInt(Br.readLine());
            int number = Integer.parseInt(Br.readLine());
            // Tack Input from user

            int i = 0, j = 1, nextTerm;
            System.out.println("Fibonacci Series is ");
            // Print Fibonacci series
            for (int c = 0; c < number; c++) {
                if (c <= 1) {
                    nextTerm = c;
                } else {
                    nextTerm = i + j;
                    i = j;
                    j = nextTerm;
                }
                System.out.println(nextTerm);
            }
        } catch (Exception e) {
            System.out.println("Oops! Something Went Wrong ");

        }

    }
}
