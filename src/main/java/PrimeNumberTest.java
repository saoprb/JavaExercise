/**
 * Created by saoprb on 11/26/2016.
 */
public class PrimeNumberTest {

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for (int candidate = 1; candidate < 10001; candidate++) {
            if (isPrime(candidate)) {
                System.out.format("%s is a prime number%n", candidate);
            }
        }
    }
}
