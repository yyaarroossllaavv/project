package org.example;

import java.util.Scanner;

public class ex4 extends exercises implements Interface{
    @Override
    public void getResponse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число n > 2: ");
        float n = scanner.nextFloat();
        int count = 0;
        for (int a = 1; a <= 100; a++) {
            for (int b = 1; b <= 100; b++) {
                for (int c = 1; c <= 100; c++) {
                    if (Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n)) {
                        count++;
                    }
                }
            }
        }
        System.out.println("Найдено решений: " + count);
        n = 2;
        System.out.print("При n = 2 найдено решений: ");
        for (int a = 1; a <= 100; a++) {
            for (int b = 1; b <= 100; b++) {
                for (int c = 1; c <= 100; c++) {
                    if (Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n)) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
