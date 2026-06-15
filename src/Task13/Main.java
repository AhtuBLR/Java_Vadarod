package Task13;

public class Main {
    public static void main(String[] args) {
//1.1. Создать несколько студентов.
        Student student1 = new Student("Ингвард", "Елкин", "14.12.2000", "Слуцк", 4.12);
        Student student2 = new Student("Антон", "Кац", "22.03.2000", "Минск", 7.35);
        Student student3 = new Student("Василий", "Булич", "19.08.2001", "Минск", 9.98);
        Student student4 = new Student("Галина", "Юриевна", "02.04.2001", "Молодечно", 6.65);

// 1.2. Создать несколько групп. По этим группам распределить студентов. (метод коллекции add)

        Group group1 = new Group("214");
        Group group2 = new Group("514");

        group1.addStudent(student1);
        group1.addStudent(student2);

        group2.addStudent(student3);
        group2.addStudent(student4);

//1.3. Создать Факультет. Распределить туда группы. (метод коллекции add)
        Faculty faculty1 = new Faculty("Социально-экономический");
        Faculty faculty2 = new Faculty("Финансы и кредит");

        faculty1.addGroup(group1);
        faculty2.addGroup(group2);

        System.out.println("***********************************");
        System.out.println("Информация о студентах до удаления:");
        System.out.println(faculty1);
        System.out.println(faculty2);


//1.4 Удаление студентов
        group1.removeStudentsByMark(5);
        group2.removeStudentsByMark(7);

        System.out.println("***********************************");
        System.out.println("Информация о студентах после удаления:");
        System.out.println(faculty1);
        System.out.println(faculty2);

// 1.5 Перевод студентов, если в группе меньше 2-х студентов
        group2.transferToGroup(group1);

        System.out.println("***********************************");
        System.out.println("После Объединения студентовв одну группу");
        System.out.println(faculty1);

// 1.6 Средний балл по группе
        System.out.println("***********************************");
        System.out.println("Средний балл группы " + group1.getGroup() + ": " + group1.groupAverageMark());

    }
}

