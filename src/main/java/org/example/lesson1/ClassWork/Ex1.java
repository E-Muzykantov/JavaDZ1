package org.example.lesson1.ClassWork;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        zadanie1(n);
        System.out.printf("res = %d", zadanie1(n));
    }

    private static int zadanie1(int n) { //todo переименовать метод
        int multi = 1, sum = 0;
        while (n != 0) {
            multi *= n % 10;
            sum += n % 10;
            n /= 10;
        }

        return multi - sum;
    }
}

