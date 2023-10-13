package Lesson2.hw.Task1;

//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
//Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.


import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("Введите дробное число: ");
                Scanner scanner = new Scanner(System.in);
                Float a = scanner.nextFloat();
                System.out.println("Вы ввели число а = " + a);
            } catch (InputMismatchException ex) {
                System.out.println("Попробуйте ввести дробное число еще раз");
            }
        }
        
    }
}
