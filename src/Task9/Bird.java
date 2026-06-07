package Task9;

import java.util.Objects;

/*Определить поля в классе Птица: семейство, максимальная высота полёта. В классе птица методы-петь, клевать, высиживать птенцов.
При этом, в консоли должны выводиться поля семейства птиц с соответствующим поведением (пример: Воробей поёт).
Использовать наследование, где суперкласс-Животное.
Переопределить методы, которые есть в родительском классе животное (издание звуков, животное играет)  в классах Собака и Птица.*/
public class Bird extends Animal {
    private String family;
    private int maxFlightAltitude;

    public Bird(String color, int maxLifePeriod, String mealType, String family, int maxFlightAltitude) {
        super(color, maxLifePeriod, mealType);
        this.family = family;
        this.maxFlightAltitude = maxFlightAltitude;
    }

    //Метод петь
    public void sing() {
        System.out.println(family + " поет.");
    }

    // Метода клевать
    public void peck() {
        System.out.println(family + " клюет.");
    }

    // Метод выиживать
    public void incubate() {
        System.out.println(family + " высиживает птенцов.");
    }

    @Override
    public void sound() {
        System.out.println(family + " поет.");
    }

    @Override
    public void play() {
        System.out.println(family + " играет.");
    }

    //1.2 Реализовать метод, который будет выводить информацию о собаке, птице, животном (toString)
    @Override
    public String toString() {
        return super.toString() + " Вид птицы: " + family + ", " + "Максимальная высота полета: " + maxFlightAltitude + ".";
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public int getMaxFlightAltitude() {
        return maxFlightAltitude;
    }

    public void setMaxFlightAltitude(int maxFlightAltitude) {
        this.maxFlightAltitude = maxFlightAltitude;
    }

//Переопределить метод equals и hashcode в классах Птица и Собака из предыдущего задания.
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Bird)) {
            return false;
        }
        Bird bird = (Bird) obj;
        if (family.equals(bird.getFamily()) && maxFlightAltitude==bird.getMaxFlightAltitude()) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = family.hashCode() + maxFlightAltitude;
        return result;
    }
}