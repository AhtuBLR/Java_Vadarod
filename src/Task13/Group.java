package Task13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//У группы: номер группы, коллекция студентов (List<Student> students)
public class Group {
    private String group;
    List<Student> students;

    public Group(String group) {
        this.group = group;
        this.students = new ArrayList<>();
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }


//1.4. Реализовать метод классе Group, который должен пройти по всем студентам в группе и удалить тех,
// у кого средний бал ниже переданной оценки в параметре метода. (метод remove).
// Сигнатура метода: public void removeStudentsByMark(int mark);

    public void removeStudentsByMark(int mark) {
        Iterator<Student> iterator = students.iterator();//вызов итератора, для прохождения по коллекции со студентами
        while (iterator.hasNext()) {//Метод hasNext() проверяет, остался ли еще хотя бы один элемент для итерации.
            if (iterator.next().getAverageMark() < mark) { //метод next(), возвращает следующего студента вызов  метода getAverageMark(), чтобы получить среднюю оценку этого студента. Проверяется, меньше ли она указанного значения mark.
                iterator.remove();// если средняя оценка меньше переданной в mark, то удаляется студент из коллекции
            }
        }
    }

    //1.5. Реализовать метод, если в группе меньше 2 человек, перевести этих студентов в другую группу.
//(методы коллекций size(), addAll()); Сигнатура метода: public void transferToGroup(Group newGroup);

    public void transferToGroup(Group newGroup) {
        if (students.size() < 2) {
            newGroup.getStudents().addAll(students);
            students.clear();
        }
    }

    //1.6. Реализовать метод в классе Group, который считает средний бал по группе. Сигнатуру и название придумайте сами.

    public double groupAverageMark() {
        if (students.isEmpty()) {
            return 0; // Если студентов нет, возвращаем 0
        }

        double totalMarks = 0.0;

        for (Student student : students) {
            totalMarks += student.getAverageMark(); // Суммируем средние баллы
        }

        return totalMarks / students.size(); // Делим на количество студентов
    }

    public int size() {
        return students.size();
    }

    @Override
    public String toString() {
        return "Группа: " + group + ", " + "Студент: " + students;
    }
}


