package Task12;

public class Vehicle {
    //1.1 Создать поле name и количество выбросов(Integer) в классе Vehicle и проинициализировать его через конструктора.
    private String name;
    private Integer countOfEmissions;


    public Vehicle (String name, Integer countOfEmissions) {
        this.name = name;
        this.countOfEmissions = countOfEmissions;
    }
//1.2 Реализовать методы геттеры и сеттеры для соответствующих полей класса Vehicle
    public Integer getCountOfEmissions() {
        return countOfEmissions;
    }

    public void setCountOfEmissions(Integer countOfEmissions) {
        this.countOfEmissions = countOfEmissions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
