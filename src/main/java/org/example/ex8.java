package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class ex8 extends exercises implements Interface {
    @Override
    public void getResponse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();
        ArrayList<Float> nums = new ArrayList<>();
        System.out.println("Введите значения массива: ");
        for (int i = 0; i < size; i++) {
            nums.add(scanner.nextFloat());
        }
        for (int i = 0; i < size - 1; i++) {
            if (nums.get(i) > 0 && nums.get(i) % 1 == 0 && nums.get(i + 1) >= 0 && nums.get(i + 1) % 1 == 0) {
                System.out.println((nums.get(i + 1) / nums.get(i) % 1));
                break;
            }
        }
    }
}
