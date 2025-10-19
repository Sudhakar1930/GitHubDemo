package com.example.basicPrograms;

public class FindMaxNo {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8, -1, 4};
        int max = findMax(numbers);
        System.out.println("The maximum number is: " + max);
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
