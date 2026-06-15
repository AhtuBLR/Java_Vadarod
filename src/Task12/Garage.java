package Task12;


//1.3 Создать generic класс Garage<T extends Vehicle >,
// который может хранить только объекты типа наследуемого от Vehicle.
public class Garage<T extends Vehicle> {
    private T vehicle;

    public Garage(T vehicle) {
        this.vehicle = vehicle;
    }

    public T getVehicle() {
        return vehicle;
    }

    public void setVehicle(T vehicle) {
        this.vehicle = vehicle;
    }

//1.4 Реализовать метод в классе Garage, который будет разрешать или запрещать въезд в гараж
// в зависимости от количество выбросов транспортного средства.
//(Boolean isEntryPermitted());
//Реализовать этот метод: если количество выбросов больше 100, тогда въезд запрещён, если меньше 100 – въезд разрешён.


//    public boolean isEntryPermitted() {
//        int emissions = vehicle.getCountOfEmissions();
//        if (emissions < 100) {
//            System.out.println("Выбросов меньше 100! Въезд разрешен!");
//        } else if (emissions > 100) {
//            System.out.println("Выбросов больше 100! Въезд запрещен!");
//
//        } else {
//            System.out.println("Выбросов 100, нужно проехать на  дополнительный осмотр!");
//        }
//        return false;
//    }

    public boolean isEntryPermitted() {
        if (vehicle.getCountOfEmissions() > 100) {
            System.out.println("Выбросов больше 100! Въезд запрещен!");
            return false;
        } else {
            System.out.println("Выбросов меньше 100! Въезд разрешен!");
            return true;
        }
    }
}