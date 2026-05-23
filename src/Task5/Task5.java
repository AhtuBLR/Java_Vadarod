package Task5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
// //1. Вывести все числа кратные 7 или 3 в диапазоне от 1 до 100. (можно использовать цикл for)
//       for (int i=1; i<=100; i++) {
//           if (i % 3 == 0 || i % 7 ==0) {
//                System.out.println(i);
//            }
//        }

// 2. Ввести 2 положительных числа с консоли с помощью сканера.
// Вывести сумму всех чисел от одного числа до другого. (Используйте цикл while).
// Подсказка. До цикла объявите переменную int sum=0. В самом цикле перезаписывайте в эту переменную сумму чисел.
        Scanner in = new Scanner(System.in);
//        System.out.print("Введите первое положительное число: ");
//        int number1 = in.nextInt();
//        System.out.print("Введите второе положительное число: ");
//        int number2 = in.nextInt();
//        int sum = 0;
//        while (number1 != number2) {
//            sum += number1;
//            number1 += (number2 > number1) ? 1 : -1;
//        }
//        sum += number2;
//        System.out.println("Сумма чисел от " + number1 + " до " + number2 + " равна: " + sum);
//    }
//}

// 3. Ввести число с консоли, которое не заканчивается на 0.
// Вывести число в обратном порядке. Использовать оператор %.
//        System.out.print("Введите число, которое не заканчивается на 0: ");
//        int x = in.nextInt();
//        if (x % 10 == 0) {
//            System.out.println("Число заканчивается на 0, попробуйте ещё раз!");
//            return;
//        }
//        System.out.print("Число в обратном порядке: ");
//        while (x > 0) {
//            int y = x % 10;
//            System.out.print(y);
//            x /= 10;
//        }
//        System.out.println();
//    }
//    }
// 4. Ввести число с консоли, которое не заканчивается на 0.Вывести чётные и нечётные числа через while and if.
// Использовать оператор %.
        System.out.print("Введите число, которое не заканчивается на 0: ");
        int a = in.nextInt();
        if (a % 10 == 0) {
            System.out.println("Число заканчивается на 0, попробуйте еще раз!");
            return;
        }
        int b = 1;
        while (b <= a) {
            if (b % 2 == 0) {
                System.out.println(b + " чётное число");
            } else {
                System.out.println(b + " нечётное число");
            }
            b++;
        }
    }
}







