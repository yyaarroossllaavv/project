package org.example;

import java.util.Scanner;

public class ex5 extends exercises implements Interface {
    @Override
    public void getResponse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        double n = scanner.nextDouble();
        int div = 1;
        float res = 0;
        while (div != 10001) {
            res += n / div;
            n = -1 * n;
            div++;
        }
        System.out.println(res);
    }
}
