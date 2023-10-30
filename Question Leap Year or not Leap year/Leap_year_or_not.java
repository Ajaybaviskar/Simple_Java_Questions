import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leap_year_or_not {
    public static void main(String args[]) throws IOException {
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter Year for Checking This is Leap Year or not Leap Year :--> ");
            int year = Integer.parseInt(Br.readLine());

            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                System.out.println(year + " Is Leap Year");
            } else {
                System.out.println(year + " Is Not Leap Year");
            }

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Please Enter Integer Number Only ");
        }

    }
}