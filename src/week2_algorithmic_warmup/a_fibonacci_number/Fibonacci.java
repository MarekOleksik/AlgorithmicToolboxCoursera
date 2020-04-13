package week2_algorithmic_warmup.a_fibonacci_number;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the index of Fibonacci: ");
        int n = in.nextInt();

        //System.out.println("The number of Fibonacci is: " + calc_fib(n));
        System.out.println("The number of Fibonacci (fast algorithm) is: " + calc_fib_fast(n));
    }

    private static long calc_fib(int n) {
        if (n <= 1)
            return n;

        return calc_fib(n - 1) + calc_fib(n - 2);
    }


    private static long calc_fib_fast(int n) {
        long[] array = new long[n];
        array[0] = 1;
        array[1] = 1;
        for (int i = 2; i < n; i++) {
            array[i] = array[i-1] + array[i-2];
        }
        long result = array[n-1];
        return result;
    }
}
