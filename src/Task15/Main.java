package Task15;

import java.util.HashMap;
import java.util.Map;

//1.3.Создать сотрудников (создайте штук восемь)
public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Григорий", "Попов", 32, 3254.69);
        Employee employee2 = new Employee(2, "Татьяна", "Синицина", 41, 2863.17);
        Employee employee3 = new Employee(3, "Ольга", "Фундук", 56, 4412.23);
        Employee employee4 = new Employee(4, "Иван", "Иванов", 47, 5632.02);
        Employee employee5 = new Employee(5, "Олег", "Попов", 29, 3145.47);
        Employee employee6 = new Employee(6, "Трофим", "Бык", 22, 2148.15);
        Employee employee7 = new Employee(7, "Иван", "Иванов", 43, 3244.22);
        Employee employee8 = new Employee(8, "Светлана", "Светикова", 33, 3517.28);

//1.4.Создать мапку и записать туда созданных сотрудников в качестве ключа., а в качестве значения им присвоить им профессию.
        Map<Employee, String> employees = new HashMap<>();
        employees.put(employee1, "Инженер");
        employees.put(employee2, "Конструктор");
        employees.put(employee3, "Машинист");
        employees.put(employee4, "Слесарь");
        employees.put(employee5, "Механик");
        employees.put(employee6, "Токарь");
        employees.put(employee7, "Строитель");
        employees.put(employee8, "Машинист");

//1.5 Реализуйте статический метод в классе Main, который повысит зарплату сотрудникам одной профессии.
// Сигнатура метода к примеру такая.
//private static void raiseSalaryForProfession(Map<Employee, String> employees, int amountOfIncrease).
//Например: Необходимо повысить зарплату плотникам на 200 рублей.

        System.out.println("Все сотрудники до повышения ЗП: ");
        for (Map.Entry<Employee, String> entry : employees.entrySet()) {
            System.out.println(entry.getValue() + " " + entry.getKey());
        }

        raiseSalaryForProfession(employees, "Машинист", 450);

        System.out.println("\nВсе сотрудники после повышения ЗП: ");
        for (Map.Entry<Employee, String> entry : employees.entrySet()) {
            System.out.println(entry.getValue() + " " + entry.getKey());
        }
    }

    private static void raiseSalaryForProfession(Map<Employee, String> employees, String profession, double amountOfIncrease) {
        for (Map.Entry<Employee, String> entry : employees.entrySet()) {
            Employee employee = entry.getKey();// Получаем сотрудника
            String employeeProfession = entry.getValue(); // Получаем профессию сотрудника

            if (employeeProfession.equals(profession)) { // Проверяем, соответствует ли профессия нужной
                // Повышение зарплаты
                double currentSalary = employee.getSalary(); // Получаем текущую зарплату
                employee.setSalary(currentSalary + amountOfIncrease); // Увеличиваем зарплату
            }
        }
    }
}