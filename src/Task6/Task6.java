package Task6;

public class Task6 {
    public static void main(String[] args) {
//1. Создать массив из 10 элементов. Заполните массив числами и вывести их в консоль (выводите через цикл for each).
// Замените каждый элемент с нечётным индексом на ноль.
// Выведите полученный массив в консоль через цикл for each
//        int[] array = new int[10];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = i + 1;
//        }
//        System.out.println("Первоначальный массив: ");
//        for (int j : array) {
//            System.out.print(j + " ");
//        }
//        System.out.println();
//        for (int i = 1; i < array.length; i += 2) {
//            array[i] = 0;
//        }
//        System.out.println("Измененный массив:");
//        for (int j : array) {
//            System.out.print(j + " ");
//        }
//    }
//}

//2. Создать массив из 5 чисел и заполните этот массив вручную.
// Создайте второй массив с размерностью больше на 1 чем первый массив.
// Необходимо скопировать первый массив со всеми значениями во второй массив.
// Последний элемент во втором массиве пусть будет 0.
// Выведите второй массив в консоль с помощью цикла for each.
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = new int[array1.length + 1];
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
            array2[array2.length - 1] = 0;
            System.out.println("Второй массив:");
            for (int x : array2)
                System.out.print(x + " ");
        }
    }
}