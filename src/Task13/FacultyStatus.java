package Task13;

//1.7*. Добавить поле для факультета энамовского типа:
// ACTIVE (Активный) и NOT_ACTIVE (Неактивный факультет). Реализовать геттеры и сеттеры.
public enum FacultyStatus {

    ACTIVE("Активный"),
    NOT_ACTIVE("Неактитвный");
    private final String cirilicFacultyStatus;


    FacultyStatus(String cirilicNameFacultyStatus) {
        this.cirilicFacultyStatus = cirilicNameFacultyStatus;
    }

    public String getCirilicFacultyStatus() {
        return cirilicFacultyStatus;
    }
}
