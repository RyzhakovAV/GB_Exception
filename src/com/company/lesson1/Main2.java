package com.company.lesson1;

public class Main2 {
    public static void zero(int a, int b) {
        int c = a / b;
    }
    public static void massIndex() {
        int[] array = new int[10];
        array[100] = 1;
    }

    public static void strMethod() {
        String str = null;
        System.out.println(str.length());
    }

    public static void strPower() {
        String number = "12ewe";
        int a = Integer.parseInt(number);
    }

    public static void cast() {
        Object obj = "5";
        Integer digit = (Integer) obj;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        zero(a, b);
        massIndex();
        strMethod();
        strPower();
        cast();
    }
}
