package org.example.lesson1.HomeWork;

import java.util.Scanner;

public class Hw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String text = sc.nextLine();
        System.out.println(getString(text));

    }

    /**
     * @apiNote Развернуть входящую строку и убрать все лишние пробелы, оставив пробелы только между словами.
     * @param text входящая строка
     * @return развернутая строка без лишних пробелов
     */
    private static String getString(String text) {
        String result = "";
        String[] textArray = text.trim().split("\\s+");
        for (int i = textArray.length -1; i > 0; --i) {
            result += textArray[i] + " ";
        }
        result += textArray[0];
        return result;
    }
}

