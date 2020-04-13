package week2_algorithmic_warmup.b_last_digit_of_fibonacci_number;

import java.util.*;

public class FibonacciLastDigit {
    private static int getFibonacciLastDigitNaive(int n) {
        if (n <= 1)
            return n;

        int previous = 0;
        int current = 1;

        for (int i = 0; i < n - 1; ++i) {
            int tmp_previous = previous;
            previous = current;
            current = tmp_previous + current;
        }

        return current % 10;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the index of Fibonacci: ");
        int n = scanner.nextInt();
        int c = getFibonacciLastDigitNaive(n);
        System.out.println("Last digit of the number of Fibonacci is: " + c);
    }
}


