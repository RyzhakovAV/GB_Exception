package com.company.homework_02;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/*
Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите строку. Для выхода из программы введите exit");
        String str = console.nextLine();
        while (!str.equals("exit")) {
            if (str.isEmpty()){
                throw new IllegalArgumentException("Строка пустая");
            }
            System.out.println(str);
            str = console.nextLine();
        }
    }
}
