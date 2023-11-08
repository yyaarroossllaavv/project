package org.example;

import java.util.Scanner;

public class ex10_12 extends exercises implements Interface {
    @Override
    public void getResponse() {
        Scanner scanner = new Scanner(System.in);
        long number;
        int new_number_system;
        int number_system;
        System.out.println("В какой системе счисления число?");
        number_system = Integer.parseInt(scanner.nextLine());
        System.out.println("Введите число: ");
        number = Long.parseLong(scanner.nextLine(), number_system);
        System.out.println("Введите систему счисления: ");
        new_number_system = scanner.nextInt();
        System.out.println("Полученое число " + Long.toString(number, new_number_system));
    }
}
