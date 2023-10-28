import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Check_Number_Prime_or_not {
    public static void main(String args[]) throws IOException {
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter Number :- ");
            int no = Integer.parseInt(Br.readLine());
            // Tack Input from User

            if (no % 2 == 0) { // Check Number is Prime or not
                System.out.println(no + " Is Prime Number");
            } else {
                System.out.println(no + " Is Not Prime Number");
            }

        } catch (Exception e) {
            System.out.println("Please Enter Integer ");
            // System.out.println(e);
        }

    }
}