package Task11;

//РоботСапёр. Поля: модель, потребляемая мощность, средство для разминирования (шасси номер),
// материал, включение робота (boolean isOn)
public class RobotSapper implements RobotEngineer {
    private String model;
    private int power;
    private String mineClearanceEquipment; // шасси номер
    private String material;
    private boolean isOn;

    public RobotSapper(String model, int power, String mineClearanceEquipment, String material, boolean isOn) {
        this.model = model;
        this.power = power;
        this.mineClearanceEquipment = mineClearanceEquipment;
        this.material = material;
        this.isOn = isOn;
    }


    //Все три класса должны имплементировать интерфейс Робот. Реализовать все методы, к классах, которые требует интерфейс.


    @Override
    public void turnOn() {
        isOn = true;
        System.out.println(model + " включен.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println(model + " выключен.");
    }

    @Override
    public void uniquePossibility() {
        System.out.println(model + " проводит техническую разведку.");

    }

    @Override
    public void repairRobot() {
        System.out.println(model + " требуется ремонт!");

    }

    @Override
    public void createItem() {
        System.out.println(model + " создаёт приспособление для разминирования.");
    }
}
