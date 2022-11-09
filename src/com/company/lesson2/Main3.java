package com.company.lesson2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main3 {
    public static final String path = "src/com/company/lesson2/output.txt";

    public static void write(String path, String str, boolean append) throws IOException {
        FileWriter writer = new FileWriter(path, append);
        writer.write(str);
        writer.close();
    }

    public static void main(String[] args) throws Exception {
        try (FileReader reader = new FileReader("src/com/company/lesson2/data.txt")) {
            Scanner scan = new Scanner(reader);
            int i = 1;
            int position = 0;
            write(path, "", false);
            while (scan.hasNextLine()) {
                String str = scan.nextLine();
                position = str.indexOf("=");
                i++;
                if (str.indexOf("?", position+1) != -1) {
                    String line = str.substring(0, position+1);
                    line = line + position;
                    System.out.println(line);
                    write(path, line + "\n", true);
                }else{
                    write(path, str + "\n", true);
                    System.out.println(str);
                }
            }
            reader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
