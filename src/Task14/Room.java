package Task14;

import java.util.*;

//1.2 У палаты поля: номер, тип палаты (энам мужская или женская), список пациентов
public class Room {
    private String number;
    private Gender roomType;
    Set<Patient> patients;

    public Room(String number, Gender roomType) {
        this.number = number;
        this.roomType = roomType;
        //this.patients = new TreeSet<>();
        this.patients = new HashSet<>();
    }

    public Gender getRoomType() {
        return roomType;
    }

    public void setRoomType(Gender roomType) {
        this.roomType = roomType;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Set<Patient> getPatients() {
        return patients;
    }

    public void setPatients(Set<Patient> patients) {
        this.patients = patients;
    }

    @Override
    public String toString() {
        return "Палата {" +
                "номер : " + number +
                ", Тип палаты : " + roomType.getRoomType() +
                ", Пациенты : " + patients + "}";
    }

//1.6 Реализовать метод добавления пациента в палату на основе диагноза.
// Т.е, в палате должны лежать пациенты с одинаковыми диагнозами. Метод реализовать в классе Палата.

    public boolean addPatient(Patient patient) {
        if (patients.size() >= 3) {
            System.out.println("В палате № " + number + " нет свободных мест!");
            return false;
        }
        if ((roomType == Gender.MALE && patient.getGender() != Gender.MALE)
                || (roomType == Gender.FEMAIL && patient.getGender() != Gender.FEMAIL)) {
            System.out.println(patient + " не подходит в палату №" + number);
            return false;
        }
        if (!patients.isEmpty()) {
            String existingDiagnosis = patients.iterator().next().getDiagnosis();
            if (!existingDiagnosis.equalsIgnoreCase(patient.getDiagnosis())) {
                System.out.println(patient + " имеет другой диагноз (" + patient.getDiagnosis() + ")");
                return false;
            }
        }
        return patients.add(patient);
    }

    // 1.7 В классе Палата создать метод, которые выводить информацию по всем пациентам в палате.
    public void printPatients() {
        System.out.println("Палата №: " + number + " (" + "Тип палаты: " + roomType.getRoomType() + "), Диагноз: " +
                (patients.isEmpty() ? "нет пациентов" : patients.iterator().next().getDiagnosis()) +
                " (Количество пациентов - " + patients.size() + ").");
        for (Patient p : patients) {
            System.out.println("   - " + p);
        }
    }
}