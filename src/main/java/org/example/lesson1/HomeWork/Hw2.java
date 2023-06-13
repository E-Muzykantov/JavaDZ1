package org.example.lesson1.HomeWork;

import java.util.Scanner;

public class Hw2 {
    public static void main(String[] args) {
//        2) Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел, после которых следует отрицательное число.
//

        Scanner sc = new Scanner(System.in);
        int lennghtNumber = sc.nextInt();
        int summa = 0;
        int num1 = sc.nextInt();
        for (int i = 1; i < lennghtNumber; i++) {
            int num2 = sc.nextInt();
            if (num2 < 0) summa += num1;
            num1 = num2;
        }
        sc.close();
        System.out.println("Сумма = " + summa);
    }
}
