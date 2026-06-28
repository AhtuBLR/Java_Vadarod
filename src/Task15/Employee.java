package Task15;

//1.1.Создать класс. Сотрудник.
//1.2.Поля у сотрудника. Идентификационный номер, Имя, фамилия, возраст, зарплата.
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Employee(int id, String firstName, String lastName, int age, double salary) {
        this.id = id;
        this.salary = salary;
        this.lastName = lastName;
        this.age = age;
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{" +
                "ID : " + id +
                ", Имя : " + firstName +
                ", Фамилия : " + lastName +
                ", Возраст : " + age +
                ", Заработная плата  : " + salary + "}";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || !(object instanceof Employee employee)) {
            return false;
        }
        if (firstName.equals(employee.getFirstName())
                && lastName.equals(employee.getLastName())
                && age == (employee.getAge())) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return firstName.hashCode() + lastName.hashCode() + age;
    }
}
