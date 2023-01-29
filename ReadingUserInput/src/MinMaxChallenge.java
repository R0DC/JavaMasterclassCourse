import java.util.Scanner;

public class MinMaxChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double min = 0.0;
        double max = 0.0;

        while (true) {
             System.out.println("Input a number (input a character to quit): ");
             String nextNumber = scanner.nextLine();
             try {
                 double number = Double.parseDouble(nextNumber);
                 if (number < min) {
                     min = number;
                 } else if (number > max) {
                         max = number;
                     }
                 } catch (NumberFormatException nfe) {
                 break;
             }
         }

        System.out.println("Max number = " + max);
        System.out.println("Min number = " + min);
    }
}
