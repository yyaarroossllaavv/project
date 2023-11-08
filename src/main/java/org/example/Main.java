package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ex1 ex_1 = new ex1();
        ex3 ex_2 = new ex3();
        ex4 ex_3 = new ex4();
        ex5 ex_4 = new ex5();
        ex8 ex_5 = new ex8();
        ex10_12 ex_6 = new ex10_12(); //номер задания не совпадает с номером в названии класса для удобства
        ArrayList<exercises> array = new ArrayList<>();
        array.add(ex_1);
        array.add(ex_2);
        array.add(ex_3);
        array.add(ex_4);
        array.add(ex_5);
        array.add(ex_6);
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (true) {
            System.out.println("Введите номер задания(от 1 до 6): ");
            i = scanner.nextInt();
            if (i >= 1 && i <= 6) {
                array.get(i - 1).getResponse();
            }
            else {
                System.out.println("Такого задания нет.");
                break;
            }
        }
    }
}