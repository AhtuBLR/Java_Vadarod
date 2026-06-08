package Task9;

/*1.6 Используя метод по добавлению животного в зоопарк (п.1.4) добавить по три собаки и по три птицы.
(Выполнять это в методе Main, создав соответствующие объекты зоопарка, птиц, собак и т.д.)
*/
public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Bird bird1 = new Bird("Серый", 16, "грызуны,мелкие птицы, насекомые", "Сокол", 3300);
        Bird bird2 = new Bird("Черный", 18, "насекомые, черви, личинки", "Грач", 1500);
        Bird bird3 = new Bird("Серый", 18, "насекомые, черви, падаль", "Ворона", 6300);

        Dog dog1 = new Dog("бело-рыжий", 15, "мясо", "Леди", "Джек рассел терьер", 6);
        Dog dog2 = new Dog("черно-серый", 18, "мясо", "Майя", "Восточно-европеская овчарка", 40);
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

    }
}