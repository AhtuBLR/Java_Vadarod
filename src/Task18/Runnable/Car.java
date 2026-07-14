package Task18.Runnable;

//1.4 Сделать задачу 1.1 и 1.2 через интерфейс Runnable.
//Для этого создайте в пакете с домашнем заданием, пакет с названием runnable.
// В этом пакете реализуйте (скопируйте) класс Авто с последующем изменением.

public class Car implements Runnable {
    private String name;
    private String number;
    private int stopTime;

    public Car(String name, String number, int stopTime) {
        this.stopTime = stopTime;
        this.number = number;
        this.name = name;
    }


    private void drive() throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            Thread.sleep(stopTime);
            System.out.println("Авто " + name + " " + number + " движется!");
            System.out.println("Авто " + name + " " + number + " завершила движение!");
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "Марка:" + name + '\'' +
                ", Гос. номер: " + number +
                ", Время остановки: " + stopTime + '\'' +
                '}';
    }

    @Override
    public void run() {
        try {
            drive();
        } catch (InterruptedException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}