package Task13;

//У студента поля: имя, фамилия, дата рождения, город рождения, средний бал
public class Student {
    private String name;
    private String surname;
    private String dateOfBirth;
    private String cityOfBirth;
    private double averageMark;

    public Student(String name, String surname, String dateOfBirth, String cityOfBirth, double averageMark) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.cityOfBirth = cityOfBirth;
        this.averageMark = averageMark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCityOfBirth() {
        return cityOfBirth;
    }

    public void setCityOfBirth(String cityOfBirth) {
        this.cityOfBirth = cityOfBirth;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }


    public String toString() {
        return "Имя: " + name + ", " + "Фамилия: " + surname + ", " + "Дата рождения: " + dateOfBirth + ", " + "Город: "
                + cityOfBirth + ", " + "Средняя оценка: " + averageMark;
    }
}