package Task9;

/*1.6 Используя метод по добавлению животного в зоопарк (п.1.4) добавить по три собаки и по три птицы.
(Выполнять это в методе Main, создав соответствующие объекты зоопарка, птиц, собак и т.д.)
*/
public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Bird bird1 = new Bird("Серый", 16, "грызуны,мелкие птицы, насекомые", "Сокол", 3300);
        Bird bird2 = new Bird("Серый", 16, "грызуны,мелкие птицы, насекомые", "Сокол", 3300);
        Bird bird3 = new Bird("Серый", 18, "насекомые, черви, падаль", "Ворона", 6300);

        Dog dog1 = new Dog("бело-рыжий", 15, "мясо", "Леди", "Джек рассел терьер", 6);
        Dog dog2 = new Dog("бело-рыжий", 15, "мясо", "Леди", "Джек рассел терьер", 6);
        Dog dog3 = new Dog("коричневый", 14, "сухой корм", "Чарли", "Пудель", 8);

        Lion lion1 = new Lion("желто-серый", 20, "зебра");
        Lion lion2 = new Lion("рыжий", 22, "падаль");
        Lion lion3 = new Lion("белый", 18, "антилопа Гну");

        zoo.addAnimal(bird1);
        zoo.addAnimal(bird2);
        zoo.addAnimal(bird3);

        zoo.addAnimal(dog1);
        zoo.addAnimal(dog2);
        zoo.addAnimal(dog3);

        zoo.addAnimal(lion1);
        zoo.addAnimal(lion2);
        zoo.addAnimal(lion3);

 /*1.7 Получить всех животных из зоопарка. Пройтись по всем животным в зоопарке и вызвать методы (издание звуков, животное играет).
 У вас должны вывестись соответствующие реализации для 3 собак и для трёх птиц(Выполнять это в методе Main)*/
        for (Animal animal : zoo.getAnimals()) {
            animal.sound();
            animal.play();
        }
        System.out.println("Информация о всех животных зоопарка");
        zoo.showAllAnimalInfo();

        //Вызо методо equals
        System.out.println(bird1.equals(bird2));
        System.out.println(bird2.equals(bird3));
        System.out.println("--------------------");

        System.out.println(dog1.equals(dog2));
        System.out.println(dog2.equals(dog3));
        System.out.println("--------------------");

        //Вызов метода hashCode
        System.out.println(bird1.hashCode());
        System.out.println(bird2.hashCode());
        System.out.println("--------------------");

        System.out.println(bird1.hashCode());
        System.out.println(bird3.hashCode());
        System.out.println("--------------------");

        System.out.println(dog1.hashCode());
        System.out.println(dog2.hashCode());
        System.out.println("--------------------");

        System.out.println(dog1.hashCode());
        System.out.println(dog3.hashCode());
        System.out.println("--------------------");
    }
}