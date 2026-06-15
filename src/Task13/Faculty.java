package Task13;

import java.util.ArrayList;
import java.util.List;

//У факультета: наименование факультета, список групп (List<Group> groups. )
public class Faculty {
    private String faculty;
    private List<Group> groups;

    public Faculty(String faculty) {
        this.faculty = faculty;
        this.groups = new ArrayList<>();
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

    public void addGroup(Group group) {
        groups.add(group);
    }


    @Override
    public String toString() {
        return "Факультет: " + faculty + ", " + "Группа: " + groups;
    }
}
