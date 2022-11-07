package com.company.lesson1;

import java.util.Random;

public class Main1 {
    public static int codeError(int[][] arr) {
        int sum = 0;
        if (arr.length != arr[0].length) {
            throw new RuntimeException("Исключение. Цикл не квадратный");
        } else {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j] < 0 | arr[i][j] > 1) throw new RuntimeException("Не правильные данные в массиве");
                    sum += arr[i][j];
                }
            }


            return sum;
        }
    }

    public static void main(String[] args) {
        int[][] array2d = new int[5][5];
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                array2d[i][j] = new Random().nextInt(2);
            }
        }
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                System.out.print(array2d[i][j]);
            }
            System.out.println();
        }
            System.out.println(codeError(array2d));
    }
}
