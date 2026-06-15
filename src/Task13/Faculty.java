package Task13;

import java.util.ArrayList;
import java.util.List;

//У факультета: наименование факультета, список групп (List<Group> groups. )
public class Faculty {
    private String faculty;
    private List<Group> groups;
    private FacultyStatus status;

    public Faculty(String faculty) {
        this.faculty = faculty;
        this.groups = new ArrayList<>();
        this.status =FacultyStatus.ACTIVE;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public FacultyStatus getStatus() {
        return status;
    }

    public void setStatus(FacultyStatus status) {
        this.status = status;
    }

    public void addGroup(Group group) {
        groups.add(group);
    }

//1.8* Реализовать метод по смене статуса факультета:
// Если общее количество студентов на факультете меньше 20-сделать факультет неактитвным. (Метод size() в коллекции)
    public void updateStatus() {
        int totalStudents = 0;

        for (Group group : groups) { // Подсчет общего количества студентов во всех группах
            totalStudents += group.size();
        }
        if (totalStudents < 20) {
            status = FacultyStatus.NOT_ACTIVE;
        } else {
            status = FacultyStatus.ACTIVE;
        }
    }



    @Override
    public String toString() {
        return "Факультет: " + faculty + ", " + "Группа: " + groups;
    }
}
