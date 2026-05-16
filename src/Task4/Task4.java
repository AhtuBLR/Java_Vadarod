package Task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
// 1. На вход даны 3 числа. Вывести в консоль только четные числа
        Scanner in = new Scanner(System.in);
//        System.out.print("Введите число a: ");
//        int a = in.nextInt();
//        System.out.print("Введите число b: ");
//        int b = in.nextInt();
//        System.out.print("Введите число c: ");
//        int c = in.nextInt();
//        if (a % 2 == 0) {
//            System.out.println("Четное число: " + a);
//        }
//        if (b % 2 == 0) {
//            System.out.println("Четное число: " + b);
//        }
//        if (c % 2 == 0) {
//            System.out.println("Четное число: " + c);
//        }

//2. На вход даны 3 числа. Вывести в консоль только те числа, которые делятся на 2 и на 5 (используйте оператор % для проверки деления без остатка)

//        if (a % 2 == 0 && a % 5 == 0) {
//            System.out.println("Число " + a + " делится на 2 и на 5");
//        }
//        if (b % 2 == 0) {
//            System.out.println("Число " + b + " делится на 2 и на 5");
//        }
//        if (c % 2 == 0) {
//            System.out.println("Число " + c + " делится на 2 и на 5");
//        }

/*   Дано 15/x=result, где x-число, которое вводится с командной строки, result-результат вычисления.
Написать программу, которая будет выводит разный текст, в зависимости от значения result.
В случае result=3, вывести: "Результат деления равен 3" В случае result=5 вывести: "Результат деления равен 5"
В других случаях вывести: "Результат деления равен дробному числу".*/
        double result;
        int x;
        System.out.print("Введите число x: ");
        x = in.nextInt();
        if (x == 0) {
            System.out.println("Ошибка деления");
            return;
        }
        result = 15.0 / x;
        switch ((int) result) {
            case 3:
                if (result == 3.0) {
                    System.out.println("Результат деления равен 3");
                } else {
                    System.out.println("Результат деления равен дробному числу: " + result);
                }
                break;
            case 5:
                if (result == 5.0) {
                    System.out.println("Результат деления равен 5");
                } else {
                    System.out.println("Результат деления равен дробному числу: " + result);
                }
                break;
            default:
                System.out.println("Результат деления равен дробному числу: " + result);
                break;
        }
    }
}