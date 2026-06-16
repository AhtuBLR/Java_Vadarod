package Task12;

//Создать классы Car и Motorcycle, которые наследуются от общего класса Vehicle (транспорт)
public class Motorcycle extends Vehicle {

    public Motorcycle(String name, Integer countOfEmissions) {
        super(name, countOfEmissions);

    }

    @Override
    public String toString() {
        return "Мотоцикл: " + getName();
    }
}
