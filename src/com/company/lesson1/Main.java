package com.company.lesson1;

import java.util.Arrays;

public class Main {
    public static final int min = 5;

    public static int codeError(int[] arr, int count, int index) {
        int sum = 0;
        for (int digit : arr) {
            sum += digit;
        }
        if (arr == null) return -3;
        else if (arr.length < min) return -1;
        else if (sum < 100 && arr[index] == 5) return -4;
        else {
            Arrays.sort(arr);
            if (Arrays.binarySearch(arr, count) < 0) return -2;
        }
        return 0;
    }

    public static void main(String[] args) throws Exception{
        int[] array = {0, -4, 5, 3, 2, 1, 9, 56, 5, 3, 7};
        System.out.println(codeError(array, 56, 2));
    }
}
