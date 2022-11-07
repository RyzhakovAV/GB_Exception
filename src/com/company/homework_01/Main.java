package com.company.homework_01;

import java.util.Arrays;
import java.util.Random;

/*
1.Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
2.Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?

public static int sum2d(String[][] arr) {
int sum = 0;
for (int i = 0; i < arr.length; i++) {
for (int j = 0; j < 5; j++) {
int val = Integer.parseInt(arr[i][j]);
sum += val;
}
}
return sum;
}

3.Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов не равны,
необходимо как-то оповестить пользователя.
4.* Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов не равны,
необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение,
которое пользователь может увидеть - RuntimeException, т.е. ваше.
 */
public class Main {
    public static void fillArray () {
        int[] array = new int[10];
        for (int i = 0; i <= array.length; i++) {
            array[i] = i;
        }
    }
    public static void valueArray() {
        int[] array = new int[5];
        array[1] = Integer.parseInt("175a");
    }
    public static void newArray(int a) {
        int[] array = new int[a];
    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
    public static int[] fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(10);
        }
        return arr;
    }
    public static int[] diffArray(int[] arr1, int[] arr2) {
        int[] newArray;
        if (arr1.length != arr2.length) throw new RuntimeException("Массивы разного размера");
        else {
            newArray = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                newArray[i] = arr2[i] - arr1[i];
            }
        }
        return newArray;

    }
    public static int[] multiArray(int[] arr1, int[] arr2) {
        int[] newArray;
        if (arr1.length != arr2.length) throw new RuntimeException("Массивы разного размера");
        else {
            newArray = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                newArray[i] = arr2[i] * arr1[i];
            }
        }
        return newArray;

    }
    public static void main(String[] args) {
        //fillArray(); //ArrayIndexOutOfBoundsException - выход индекса за границу массива
        //valueArray(); //NumberFormatException - неверное преобразование строки в числовой формат
        //newArray(-5); // NegativeArraySizeException - создан массив отрицательного размера

        //String[][] array = {{"1","2","3","3","3"},{"4","5","6","3","3"},{"7","8","9","3","3"}};
        //int[][] array2 = {{1,2,3,4,5},{5,6,7,8,9,0},{0,9,5,1,3}};

        //int a = sum2d(array);
        //int b = sum2d(array2);
        /*
        1. Пустой массив
        2. Не корректные типы данных в массиве
        3. выход индекса за границу массива
        4. массив отрицательного размера
        5. массив другого типа
        */
        //System.out.println(a);

        int[] array1 = new int[5];
        int[] array2 = new int[5];
        fillArray(array1);
        fillArray(array2);
        int[] newArray = diffArray(array1, array2);
        String strArray = Arrays.toString(newArray);
        System.out.println(strArray);
        newArray = multiArray(array1, array2);
        strArray = Arrays.toString(newArray);
        System.out.println(strArray);
    }
}
