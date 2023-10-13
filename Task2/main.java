package Lesson2.hw.Task2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        try {
            System.out.println(" Введите делитель: ");
            Scanner scanner = new Scanner(System.in);
            int d = scanner.nextInt();
            int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
            double catchedRes1;
            for (int i = 0; i < intArray.length; i++) {
                catchedRes1 = intArray[i] / d;
                System.out.println("catchedRes1 = " + catchedRes1);
            }

        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (InputMismatchException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
