package Task12;

//1.5 Класс Main. Создать 2 объекта класса Garage.
// Вывести на экран имя хранимого транспортного средства и проверить разрешён ли въезд транспортного средства в гараж.
public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Peugeot", 99);
        Car car2 = new Car("BMW", 112);

        Motorcycle motorcycle1 = new Motorcycle("SUZUKI", 108);
        Motorcycle motorcycle2 = new Motorcycle("YAMAHA", 95);


        Garage<Car> carGarage1 = new Garage<>(car1);
        Garage<Car> carGarage2 = new Garage<>(car2);

        Garage<Motorcycle> motorcycleGarage1 = new Garage<>(motorcycle1);
        Garage<Motorcycle> motorcycleGarage2 = new Garage<>(motorcycle2);

        System.out.println("*********************");
        System.out.println(carGarage1.getVehicle());
        System.out.println(carGarage1.isEntryPermitted());

        System.out.println("*********************");
        System.out.println(carGarage2.getVehicle());
        System.out.println(carGarage2.isEntryPermitted());

        System.out.println("*********************");
        System.out.println(motorcycleGarage1.getVehicle());
        System.out.println(motorcycleGarage1.isEntryPermitted());

        System.out.println("*********************");
        System.out.println(motorcycleGarage2.getVehicle());
        System.out.println(motorcycleGarage2.isEntryPermitted());

    }
}
