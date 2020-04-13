package week3_greedy_algorithms.c_car_fueling;

import java.util.*;
import java.io.*;

public class CarFueling {
    static int computeMinRefills(int dist, int tank, int[] stops) {
        int numRefills = 0;
        int currentRefill = 0;
        int lastRefill;
        while (currentRefill <= tank) {
            lastRefill = currentRefill;
            while (currentRefill <= tank && stops[currentRefill + 1] - stops[lastRefill] <= dist) {
                currentRefill++;
            }
            if (currentRefill == lastRefill) {
                return -1;
            }
            if (currentRefill <= dist) {
                numRefills++;
            }
        }
        return numRefills;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the distance: ");
        int dist = scanner.nextInt();
        System.out.println("Enter the tank: ");
        int tank = scanner.nextInt();
        System.out.println("Enter the numbers of stops: ");
        int n = scanner.nextInt();
        int stops[] = new int[n];
        for (int i = 0; i < n; i++) {
            stops[i] = scanner.nextInt();
        }

        System.out.println(computeMinRefills(dist, tank, stops));
    }
}
