package dev.michal;

import java.util.Scanner;

public class MinFinder {

    // Method to read an integer from the user
    public static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int count = scanner.nextInt();
        return count;
    }

    // Method to read 'count' number of elements from the user
    public static int[] readElements(int count) {
        Scanner scanner = new Scanner(System.in);
        int[] elements = new int[count];
        System.out.println("Enter " + count + " elements:");
        for (int i = 0; i < count; i++) {
            elements[i] = scanner.nextInt();
        }
        return elements;
    }

    // Method to find the minimum element in the array
    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int el : array) {
            if (el < min) {
                min = el;
            }
        }
        return min;
    }

    // Main method to tie everything together
    public static void main(String[] args) {
        int count = readInteger();               // Step 1
        int[] elements = readElements(count);    // Step 2
        int min = findMin(elements);             // Step 3
        System.out.println("Minimum number is " + min);  // Step 4
    }
}
