public class ForLoopChallenge {
    public static void main(String[] args) {

        int primeCounter = 0;

        for (int c = 50; primeCounter < 3 && c <= 1000; c++) {

            if (isPrime(c)) {
                System.out.println(c + " is a prime number");
                primeCounter++;
            }
        }
    }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
