package Task9;

/*1.Создать классы: Животное, Собака, Птица.
Поля в классе животное: окрас, максимальная продолжительность жизни, тип еды которой питаются (мясо, насекомые, растения).
Определить методы в классе животное: (издание звуков, животное играет)*/
public class Animal {
    private String color;
    private int maxLifePeriod;
    private String mealType; //мясо, насекомые, растения
    private int id;
    private static int count;

    public Animal(String color, int maxLifePeriod, String mealType) {
        this.color = color;
        this.maxLifePeriod = maxLifePeriod;
        this.mealType = mealType;
        this.id=++count;
    }

    // Метод издания звуков
    public void sound() {
        System.out.println("Животное издает звук.");
    }

    // Метод играть
    public void play() {
        System.out.println("Животное играет.");
    }

    //1.2 Реализовать метод, который будет выводить информацию о собаке, птице, животном (toString)
    public String toString(){
        return "Id: " + id + ", " + "Окрас: " + color + ", " + "Максимальная продолжительность жизни: " + maxLifePeriod + ", " +
                "Тип еды: " + mealType;
    }
}