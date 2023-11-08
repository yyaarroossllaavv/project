package org.example;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class ex3 extends exercises implements Interface{
    @Override
    public void getResponse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цифру от 0 до 9: ");
        int num = scanner.nextInt();
        ArrayList<String> words = new ArrayList<>(Arrays.asList("ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"));
        if (num >= 0 && num <= 9) {
            System.out.println(words.get(num));
        }
        else {
            System.out.println("Число не входит в диапазон");
        }
    }
}
