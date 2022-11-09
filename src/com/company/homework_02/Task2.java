package com.company.homework_02;
/*
Если необходимо, исправьте данный код
 */
public class Task2 {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        try {
            int d = 2;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
