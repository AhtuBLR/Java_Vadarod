package Task18.Runnable;

import Task18.Car;
//1.4 Сделать задачу 1.1 и 1.2 через интерфейс Runnable.
//Для этого создайте в пакете с домашнем заданием, пакет с названием runnable.
// В этом пакете реализуйте (скопируйте) класс Авто с последующем изменением.

//1.1 Создать два потока (две машины которые будут ехать параллельно).
// Потоки запускайте в классе Main. Выносите методы в private static void согласно заданиям.
public class Main {
    public static void main(String[] args) {

        startTwoCars();

    }

    private static void startTwoCars() {
        Car car1 = new Car("Audi", "2354-KE7", 3000);
        Car car2 = new Car("BMW", "4829-AB7", 1000);

        Thread car1Thread = new Thread(car1);
        Thread car2Thread = new Thread(car2);

        car1Thread.start();
        car2Thread.start();
    }
}