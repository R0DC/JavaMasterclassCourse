import java.util.Scanner;

public class UserInputChallenge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int counter = 1;

        do {
            System.out.println("Enter a number #" + counter + ":");
            String nextNumber = scanner.nextLine();
            try {
                double number = Double.parseDouble(nextNumber);
                counter++;
                sum += number;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid number");
            }
        } while (counter <= 5);

        System.out.println("The sum of the 5 numbers = " + sum);
    }
}
