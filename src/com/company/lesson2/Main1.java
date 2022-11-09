package com.company.lesson2;

import java.io.IOException;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Укажите индекс элемента массива, в который хотите записать значение 1");
        int index;
        boolean check = true;
        while (check) {
            try {
                index = new Scanner(System.in).nextInt();
                arr[index] = 1;
                check = false;
            } catch (Exception e) {
                System.out.println("Указан индекс за пределами массива");
            }
        }
    }
}
