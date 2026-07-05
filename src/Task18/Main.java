package Task18;


//1.1 Создать два потока (две машины которые будут ехать параллельно).
// Потоки запускайте в классе Main. Выносите методы в private static void согласно заданиям.
public class Main {
    public static void main(String[] args) {

        startTwoCars();
        startThreeCars();
    }

    private static void startTwoCars() {
        Car car1 = new Car("Audi", "2354-KE7", 3000);
        Car car2 = new Car("BMW", "4829-AB7", 1000);

        car1.start();
        car2.start();
    }

//1.3 Запустить три потока с машинами.
//При этом 2 машины начнут двигаться только после того, как 1 машина прекратит езду (прекратит выполнение потока) (метод join)

    private static void startThreeCars() {

        try {
            Car car1 = new Car("Ford", "1254-AE7", 3000);
            Car car2 = new Car("Opel", "5555-KE7", 3000);
            Car car3 = new Car("Nissan", "4829-AB7", 1000);
            car1.start();
            car1.join(); // пока car1 не завершит свою работу car2 и car3 не поедут
            System.out.println(car1 + "выехала!");
            System.out.println(car1 + "завершила движение!");
            car2.start();
            System.out.println(car2 + "выехала!");
            System.out.println(car2 + "завершила движение!");
            car3.start();
            System.out.println(car3 + "выехала!");
            System.out.println(car3 + "завершила движение!");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        }
    }
}