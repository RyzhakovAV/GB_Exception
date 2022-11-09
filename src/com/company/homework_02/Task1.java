package com.company.homework_02;

import java.util.Scanner;

/*
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого,
необходимо повторно запросить у пользователя ввод данных.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите дробное число. Для выхода из программы введите exit");
        String str = console.nextLine();
        while (!str.equals("exit")) {
            try{
                System.out.println(Float.parseFloat(str));
            }catch (NumberFormatException e) {
                System.out.println("Ошибка ввода");
            }finally {
                str = console.nextLine();
            }
        }
    }
}
