public class Main {
    public static void main(String[] args) {
//        for (int counter = 1; counter <= 5; counter ++) {
//            System.out.println(counter);
//        }

        for (double interest = 7.5; interest <= 10; interest += 0.25){
            System.out.println("100 at " +  interest + " % = " + calculateInterest(100.0, interest));
        }

    }

    public static double calculateInterest (double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
