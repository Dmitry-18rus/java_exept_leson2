package Lesson2.hw.Task4;
//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
//        Пользователю должно показаться сообщение, что пустые строки вводить нельзя

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        try {
            System.out.println(" Введите данные: ");
            Scanner scanner = new Scanner(System.in);
            String d = scanner.nextLine();
            if (d.isEmpty() == false) {
                System.out.println("Вы ввели = " + d);
            } else {
                throw new Exception("Пустые строки вводить нельзя!");
            }
        }
        catch(Exception e){
                System.out.println(e.getMessage());;
            }
        }
    }


