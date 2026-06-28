package Task17;

import java.io.Serial;
import java.io.Serializable;

// serialver -classpath out/production/Java_Vadarod Task17.Car
// команда в терминале для определения serialVersionUID
public class Car implements Serializable {
//2.1 Создать объект Автомобиль с полями (Марка автомобиля, максимальная скорость, страна производства).
//Переопределите метод toString(), equals(), hashcode(), гетеры и сетеры (генерируйте с помощью идеи).

    @Serial
    private static final long serialVersionUID = -9156515066186892686L;
    private String brand;
    private transient int maxSpeed;
    private String country;

    public Car(String brand, int maxSpeed, String country) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.country = country;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", country='" + country + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        Car car = (Car) o;
        if (brand.equals(car.getBrand()) && maxSpeed == (car.getMaxSpeed()) && country.equals(car.getCountry())) {
            return true;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return brand.hashCode() + maxSpeed + country.hashCode();
    }
}