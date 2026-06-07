package Task11;
//1.1 Создать классы роботов.
//РоботПовар поля: модель, потребляемая мощность, страна производитель,
//агрегат для приготовления, включение робота (boolean isOn).

public class RobotCooker implements Robot{
    private String model;
    private int power;
    private String country;
    private String cookingUnit;
    private boolean isOn;

    public RobotCooker(String model, int power, String country, String cookingUnit, boolean isOn) {
        this.model = model;
        this.power = power;
        this.country = country;
        this.cookingUnit = cookingUnit;
        this.isOn = isOn;
    }

 //Все три класса должны имплементировать интерфейс Робот. Реализовать все методы, к классах, которые требует интерфейс.

    @Override
    public void turnOn() {
        isOn=true;
        System.out.println(model + " включен.");
    }

    @Override
    public void turnOff() {
        isOn=false;
        System.out.println(model + " выключен.");
    }

    @Override
    public void uniquePossibility() {
        System.out.println(model + " готовит еду.");
    }
}
