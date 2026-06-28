package Task14;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//1.4 Создать пациентов. Распределить их по палатам. В одной палате по 3 пациента максимум.
//При этом попробуйте добавит двух пациентов, с одинаковыми полями.
//Если количество пациентов в палате увеличилось, значит неправильно реализованы equals и hashСode.
//Палаты распределить по отделениям.
public class Main {
    public static void main(String[] args) {

        Patient patient1 = new Patient(1, "Кривонос", "Семен", 54, "Пневмония", Gender.MALE);
        Patient patient2 = new Patient(2, "Семижон", "Алла", 54, "ОРВИ", Gender.FEMAIL);
        Patient patient3 = new Patient(3, "Пунтус", "Ольга", 34, "Грипп", Gender.FEMAIL);
        Patient patient4 = new Patient(4, "Осипов", "Сергей", 64, "Грипп", Gender.MALE);
        Patient patient5 = new Patient(5, "Смирнова", "Татьяна", 76, "ОРВИ", Gender.FEMAIL);
        Patient patient6 = new Patient(6, "Краснова", "Элеонора", 29, "Пневмония", Gender.FEMAIL);
        Patient patient7 = new Patient(7, "Иванов", "Иван", 84, "Астма", Gender.MALE);
        Patient patient8 = new Patient(8, "Светикова", "Свелана", 44, "Грипп", Gender.FEMAIL);
        Patient patient9 = new Patient(9, "Демьянчик", "Игорь", 32, "Пневмония", Gender.MALE);
        Patient patient10 = new Patient(10, "Заяц", "Ангелина", 58, "Астма", Gender.FEMAIL);
        Patient patient11 = new Patient(11, "Курильчик", "Глеб", 47, "ОРВИ", Gender.MALE);
        Patient patient12 = new Patient(12, "Курильчик", "Глеб", 47, "Грипп", Gender.MALE);
        Patient patient13 = new Patient(13, "Шнип", "Аркадий", 38, "Пневмония", Gender.MALE);
        Patient patient14 = new Patient(14, "Гринько", "Евгений", 28, "Пневмония", Gender.MALE);


        Room room310 = new Room("310", Gender.MALE);
        Room room312 = new Room("312", Gender.MALE);
        Room room314 = new Room("314", Gender.FEMAIL);
        Room room316 = new Room("316", Gender.FEMAIL);
        Room room318 = new Room("318", Gender.FEMAIL);


        room310.addPatient(patient1);
        room310.addPatient(patient9);
        room310.addPatient(patient10);
        room310.addPatient(patient2);
        room310.addPatient(patient13);
        room310.addPatient(patient14);


        room312.addPatient(patient4);
        room312.addPatient(patient11);
        room312.addPatient(patient12);


        room314.addPatient(patient2);
        room314.addPatient(patient3);
        room314.addPatient(patient5);

        room316.addPatient(patient6);
        room316.addPatient(patient8);
        room316.addPatient(patient10);


        Department department = new Department("Пульмонология");
        department.addRoom(room310);
        department.addRoom(room312);
        department.addRoom(room314);
        department.addRoom(room316);
        department.addRoom(room318);


// Вывод информации об отделении и количестве М и Ж
        System.out.println("***********************");
        department.printDepartmentInfo();
        System.out.println("***********************");
        department.countGenders();


        System.out.println("***********************");
        Set<Patient> patientHashSet = new HashSet<>();
        Set<Patient> patientSet = new TreeSet<>();

        System.out.println("Коллекция HashSet");
        initializeCollection(patientHashSet);
        outCollection(patientHashSet);

        System.out.println("Коллекция TreeSet");
        initializeCollection(patientSet);
        outCollection(patientSet);
    }

    public static void initializeCollection (Collection<Patient> patients) {
        Patient patient1 = new Patient(1, "Кривонос", "Семен", 54, "Пневмония", Gender.MALE);
        Patient patient2 = new Patient(3, "Семижон", "Алла", 54, "ОРВИ", Gender.FEMAIL);
        Patient patient3 = new Patient(5, "Пунтус", "Ольга", 34, "Грипп", Gender.FEMAIL);
        Patient patient4 = new Patient(7, "Осипов", "Сергей", 64, "Грипп", Gender.MALE);
        Patient patient5 = new Patient(9, "Смирнова", "Татьяна", 76, "ОРВИ", Gender.FEMAIL);
        Patient patient6 = new Patient(11, "Краснова", "Элеонора", 29, "Пневмония", Gender.FEMAIL);
        Patient patient7 = new Patient(13, "Иванов", "Иван", 84, "Астма", Gender.MALE);
        Patient patient8 = new Patient(14, "Светикова", "Свелана", 44, "Грипп", Gender.FEMAIL);
        Patient patient9 = new Patient(12, "Демьянчик", "Игорь", 32, "Пневмония", Gender.MALE);
        Patient patient10 = new Patient(10, "Заяц", "Ангелина", 58, "Астма", Gender.FEMAIL);
        Patient patient11 = new Patient(8, "Курильчик", "Глеб", 47, "ОРВИ", Gender.MALE);
        Patient patient12 = new Patient(6, "Курильчик", "Глеб", 47, "Грипп", Gender.MALE);
        Patient patient13 = new Patient(4, "Шнип", "Аркадий", 38, "Пневмония", Gender.MALE);
        Patient patient14 = new Patient(2, "Гринько", "Евгений", 28, "Пневмония", Gender.MALE);

        patients.add(patient1);
        patients.add(patient3);
        patients.add(patient5);
        patients.add(patient7);
        patients.add(patient9);
        patients.add(patient11);
        patients.add(patient13);
        patients.add(patient14);
        patients.add(patient12);
        patients.add(patient10);
        patients.add(patient8);
        patients.add(patient6);
        patients.add(patient4);
        patients.add(patient2);
    }
    private static void outCollection(Collection<Patient> patients) { //метода должен быть static чтобы вызывался в static классе
        for (Patient patient : patients) {
            //System.out.println(patient.hashCode());
            System.out.println(patient);
        }
    }
}