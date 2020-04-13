package week1_programming_challenges.a_sum_of_two_digits;

import java.util.Scanner;

class APlusB {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = s.nextInt();
        System.out.println("Enter the second number: ");
        int b = s.nextInt();
        System.out.println("The sum of the entered numbers is: " + sumOfTwoDigits(a, b));

    }

    static int sumOfTwoDigits(int first_digit, int second_digit) {
        return first_digit + second_digit;
    }

}