package week2_algorithmic_warmup.c_greatest_common_divisor;

import java.util.*;

public class GCD {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("The greatest common divisor is: " + gcd_naive(a, b));
        System.out.println("The greatest common divisor is: " + euclidGCD(a, b));
    }

    private static int gcd_naive(int a, int b) {
        int current_gcd = 1;
        for (int d = 2; d <= a && d <= b; ++d) {
            if (a % d == 0 && b % d == 0) {
                if (d > current_gcd) {
                    current_gcd = d;
                }
            }
        }

        return current_gcd;
    }

    private static int euclidGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        int reaminder = a % b;
        return euclidGCD(b, reaminder);
    }
}
