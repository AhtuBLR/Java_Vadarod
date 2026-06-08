package Task11;

//РоботСроитель. Поля: модель, потребляемая мощность,
// страна производитель, агрегат для строительства, материал, включение робота (boolean isOn.)

public class RobotBuilder implements  RobotEngineer {
    private String model;
    private int power;
    private String country;
    private String buildingUnit;
    private String material;
    private boolean isOn;

    public RobotBuilder(String model, int power, String country, String buildingUnit, String material, boolean isOn) {
        this.model = model;
        this.power = power;
        this.country = country;
        this.buildingUnit = buildingUnit;
        this.material = material;
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
        System.out.println(model + " выполняет строительные работы.");
    }

    @Override
    public void createItem() {
        System.out.println(model + " создаёт бетон.");
    }
}
