import java.io.*;
import java.io.IOException;

public class calculator {
    public static void main(String args[]) throws IOException {
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("\n\n\t --- Welcome to My Calculator App --- \n");
            System.out.print("\tEnter Fist Number --> ");
            int no1 = Integer.parseInt(Br.readLine());

            System.out.print("\tEnter Fist Number --> ");
            int no2 = Integer.parseInt(Br.readLine());

            System.out.print("\tEnter Operator Just Like (+,-,*,/) --> ");
            String Operator = Br.readLine();
            // char Operator = op.charAt(0);

            switch (Operator) {
                case "+":
                    System.out.println("\tAddition : " + no1 + " + " + no2 + " Is :-> " + (no1 + no2));
                    break;

                case "-":
                    System.out.println("\tSubtraction : " + no1 + " - " + no2 + " Is :-> " + (no1 - no2));
                    break;

                case "*":
                    System.out.println("\tMultiplication : " + no1 + " * " + no2 + " Is :-> " + (no1 * no2));
                    break;
                case "/":
                    System.out.println("\tDivision : " + no1 + " / " + no2 + " Is :-> " + (no1 / no2));
                    break;
                case "%":
                    System.out.println("\tModules : " + no1 + " % " + no2 + " Is :-> " + (no1 % no2));
                    break;
                default:
                    System.out.println("\tPlease Select Proper Operator ");
            }

        } catch (ArithmeticException exception) {
            System.out.println("Cannot Divide By Zero.");

        }

    }
}