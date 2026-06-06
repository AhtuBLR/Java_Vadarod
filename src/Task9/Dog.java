package Task9;

/*В классе собака определить имя, порода, средний вес.
 В классе Собака реализовать методы: лаять, кусать, бегать, играть, прыгать.
  При этом, в консоли должны выводится имя собаки вместе с описанием действия (пример. Рекс прыгает).
  Использовать наследование, где суперкласс-Животное.
Переопределить методы, которые есть в родительском классе животное (издание звуков, животное играет)  в классах Собака и Птица.*/
public class Dog extends Animal {
    private String name;
    private String breed;
    private int averageWeight;

    public Dog(String color, int maxLifePeriod, String mealType, String name, String breed, int averageWeight) {
        super(color, maxLifePeriod, mealType);
        this.name = name;
        this.breed = breed;
        this.averageWeight = averageWeight;
    }

    //Метод лаять
    public void bark() {
        System.out.println(name + " лает.");
    }

    //Метод кусать
    public void bite() {
        System.out.println(name + " кусает.");
    }

    //Метод бегать
    public void run() {
        System.out.println(name + " бежит.");
    }


    //Метод прыгать
    public void jump() {
        System.out.println(name + " прыгает.");
    }

    @Override
    public void sound() {
        System.out.println(name + " гавкает.");
    }

    @Override
    public void play() {
        System.out.println(name + " играет.");
    }

    //1.2 Реализовать метод, который будет выводить информацию о собаке, птице, животном (toString)
    @Override
    public String toString() {
        return super.toString() + " Собака по кличке: " + name + ", " + "Порода: " + breed + ", " + "Средний вес: " + averageWeight + ".";
    }
}