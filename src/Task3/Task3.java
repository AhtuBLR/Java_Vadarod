package Task3;

public class Task3 {
    public static void main(String[] args) {
//1.Дано уравнение x/6+25=98. Найти x и вывести его в консоль
        int x = (98 - 25) * 6;
        System.out.println("Значение x: " + x);

//2. x=x+5; y=y*9; z=z-6; Необходимо укоротить данные выражения, чтобы результат не изменился. x=8; y=9; z=12; (операции присваивания, нужно просто написать по-другому)
        int x1 = 8;
        int y = 9;
        int z = 12;
        x1 += 5;
        y *= 9;
        z -= 6;
        System.out.println("x = " + x1);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

//3. Даны числа a=35, b=65. Если а>b, то присвоить числу c значение 5 иначе, присвоить числу c значение 10. (тернарный оператор)
        int a = 35;
        int b = 65;
        int c = (a > b) ? 5 : 10;
        System.out.println("Значение c: " + c);

/* 4. Даны значения: x=5; y=2; c=x*y;
   составьте операции инкремента декремента так, чтобы после выполнения операции (c=x*y) с равнялось 12, x=равнялось 6, y=1 Выведите полученные значения в консоль.*/

        int x2 = 5;
        int y2 = 2;
        int c2 = (++x2) * (y2--);

        System.out.println("c = " + c2);
        System.out.println("x = " + x2);
        System.out.println("y = " + y2);
    }
}
