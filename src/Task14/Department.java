package Task14;

import java.util.HashSet;
import java.util.Set;

//1.3 У отделения поля: наименование отделения, список палат (коллекция Set)
public class Department {
    private String name;
    private Set<Room> rooms;


    public Department(String name) {
        this.name = name;
        this.rooms = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Room> getRooms() {
        return rooms;
    }

    public void setRooms(Set<Room> rooms) {
        this.rooms = rooms;
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    @Override
    public String toString() {
        return "Отделение {" +
                name +
                ", палаты : " + rooms +
                "}";
    }

    //1.5 Посчитать количество мужчин и женщин в отделении. СЕЙЧАС СЧИТАЕТ НЕ ПРАВИЛЬНО
    public void countGenders() {
        int men = 0;
        int women = 0;
        for (Room room : rooms) {
            for (Patient patient : room.getPatients()) {
                if (patient.getGender().equals(Gender.MALE)) men++;
                else women++;
//                if (patient.getGender() == Gender.MALE) men++;  Возвращает тоже самое
//                else if (patient.getGender() == Gender.FEMAIL) women++;
            }
        }
        System.out.println("Количество мужчин — " + men + ", Количество женщин — " + women + ".");
    }

    public void printDepartmentInfo() {
        System.out.println("Отделение: " + name);
        for (Room room : rooms) {
            room.printPatients();
        }
    }
}
