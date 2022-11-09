package com.company.lesson2;

public class Main2 {
    public static int sum2d(String[][] arr) {
        int sum = 0;
        int val;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    val = Integer.parseInt(arr[i][j]);
                }catch (NumberFormatException e){
                    val = 0;
                    System.out.printf("В массиве присутствует объект который не может быть конвертирован в число. " +
                            "Array[%d][%d]\n", i, j);
                }catch (IndexOutOfBoundsException e){
                    System.out.println(e.getMessage());
                    return sum;
                }
                sum += val;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        String[][] array = {{"1", "2", "3", "a", "5"},
                {"6", null, "7", "8", "9"},
                {"11", "12", "13", "14", "15"},
                {"16", "17", "18"},
                {"19", "20"}};
        System.out.println(sum2d(array));
    }
}
