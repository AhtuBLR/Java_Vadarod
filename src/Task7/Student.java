package Task7;

/*1.  Создать класс Student c полями id (тип int), name (тип String), surname (тип String), faculty (факультет, тип String ),
    course(тип int) , Группа(тип String), средняя оценка (тип int).
    Инициализацию студента в классе main выполнять через конструктор с параметрами. Также определите конструктор без параметров.*/
public class Student {
    int id;
    String name;
    String surname;
    String faculty;
    int course;
    String group;
    int averageMark;

    //Конструктор c параметрами
    public Student(int id, String name, String surname, String faculty, int course, String group, int averageMark) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
        this.averageMark = averageMark;

    }

    //Конструктор без параметров
    public Student() {
    }

    //2. Создать метод, который будет выводить информацию по полям которые есть в классе и назвать его info
    public void info() {
        System.out.println("ID: " + id);
        System.out.println("Имя:  " + name);
        System.out.println("Фамилия:  " + surname);
        System.out.println("Факультет:  " + faculty);
        System.out.println("Курс:  " + course);
        System.out.println("Группа:  " + group);
        System.out.println("Седняя оценка:  " + averageMark);
        System.out.println("------------------------------");
    }

    //3. Создать метод, который будет изменять текущую группу студента
    // (сам метод в качестве параметра будет принимать новую группу)
    public void changeGroup(String newGroup) {
        this.group = newGroup;
    }

    //4. Создать метод, который будет возвращать текущую группу студента.
    public String currentGroup() {
        return group;
    }

    // 5. Создать метод, который будет изменять оценку студента и группу студента.
    public void changeMarkAndGroup(int newAverageMark, String newGroup) {
        this.averageMark = newAverageMark;
        this.group = newGroup;
    }

    /*7. Создать метод в классе Student, который будет принимать массив студентов
    и возвращать из этих студентов, массив студентов у которых оценка выше переданной  оценке в методе.
    (Сигнатура метода будет выглядеть так PublicStudent[]getStudents(Students[] students, int mark)*/
    public static Student[] getStudents(Student[] students, int mark) {
        int count = 0;
        for (Student s : students) {
            if (s.averageMark > mark) {
                count++;
            }
        }

        Student[] result = new Student[count];
        int index = 0;

        for (Student s : students) {
            if (s.averageMark > mark) {
                result[index++] = s;
            }
        }

        return result;
    }


    public static void main(String[] args) {
//6. В классе main создать массив из пяти студентов.

        Student[] student = new Student[5];
        student[0] = new Student(1, "Светлана", "Семежон",
                "Соцально-экономический", 2, "22214", 8);
        student[1] = new Student(2, "Татьяна", "Иванова",
                "Финансы и кредит", 1, "11514", 6);
        student[2] = new Student(3, "Макар", "Крылов",
                "Прикладной математики", 3, "33724", 9);
        student[3] = new Student(4, "Борис", "Григорьев",
                "Психологический", 5, "55804", 7);
        student[4] = new Student(5, "Аркадий", "Пирожков",
                "Соцально-экономический", 2, "22814", 5);

            /*8. В классе main из полученных студентов из задания 7 пройтись
        в цикле по массиву и вызвать на каждом студенте метод info, который вы создавали в задании 2*/
        Student[] bestStudents = Student.getStudents(student, 7);
        System.out.println("Студенты с оценкой выше 7:");
        for (Student s : bestStudents) {
            s.info();
        }
    }
}