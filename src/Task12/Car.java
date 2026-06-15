package Task12;

//Создать классы Car и Motorcycle, которые наследуются от общего класса Vehicle (транспорт)
public class Car extends Vehicle {

    public Car(String name, Integer countOfEmissions) {
        super(name, countOfEmissions);
    }

    @Override
    public String toString() {
        return "Автомобиль: " + getName();
    }
}
