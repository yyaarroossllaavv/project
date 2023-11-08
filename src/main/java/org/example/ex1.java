package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class ex1 extends exercises implements Interface {
    public static boolean isSimple(int var) {
        for (int i = 2; i <= var / 2; i++) {
            if (var % i == 0 || var <= 0) {
                return false;
            }
        }
        return true;
    }
    @Override
    public void getResponse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();
        ArrayList<Integer> array = new ArrayList<>();
        System.out.println("Введите значения массива: ");
        for (int i = 0; i < size; i++) {
            array.add(scanner.nextInt());
        }
        for (var j:array) {
            if (isSimple(j)) {
                System.out.println(j);
            }
        }
    }
}


