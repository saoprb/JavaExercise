/**
 * Created by saoprb on 11/26/2016.
 */
public class Fibonacci {

    public void fib(int steps) {
        for (int first = 0, second = 1, third, step = 0; step <= steps; step++) {
            third = first + second;
            first = second;
            second = third;
            System.out.format("%s ", first);
        }
    }

    public int fibRecursive(int steps) {
        return fibRecursive(steps, 0, 1);
    }

    public int fibRecursive(int steps, int first, int second) {
        System.out.format("%s ", second);
        if (steps <= 0) {
            return second;
        }
        return fibRecursive(--steps, second, first + second);
    }

    public static void main(String[] args) {
        Fibonacci app = new Fibonacci();
        app.fib(20);
        System.out.println("");
        app.fibRecursive(20);
    }
}
