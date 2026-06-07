package Task11;

//1. Создать интерфейс Робот. В нём определены методы: Дефолтный метод:
//Отремонтировать робота и
//абстрактные методы: включить робота, выключить, продемонстрировать уникальные способности (uniquePossibility).
public interface Robot  {

    default void repairRobot() {
        System.out.println("Робот отремонтирован!");
    }

    void turnOn();

    void turnOff();

    void uniquePossibility();
}
