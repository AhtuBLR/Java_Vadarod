package Task14;

//1.1 У пациента поля: уникальный идентификатор, имя, фамилия, диагноз, возраст, пол
//(сделать enum класс: Мужской, Женский)

public class Patient implements Comparable<Patient> {
    private int id;
    private String firstName;
    private String lastName;
    private String diagnosis;
    private int age;
    private Gender gender;

    public Patient(int id, String lastName, String firstName, int age, String diagnosis, Gender gender) {
        this.id = id;
        this.gender = gender;
        this.age = age;
        this.diagnosis = diagnosis;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Пациент:  {" +
                "ID : " + id +
                ", Имя : " + firstName +
                ", Фамилия : " + lastName +
                ", Диагноз : " + diagnosis +
                ", Возраст : " + age +
                ", Пол : " + gender.getGenderType() + "}";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true; // Проверка на равенство ссылок
        if (object == null || !(object instanceof Patient)) {
            return false;
        }
        Patient patient = (Patient) object; //Если объект будет равняться Patient, то выполнется приведение типов, чтобы обращаться к его методам и полям
        if (firstName.equals(patient.getFirstName())
                && lastName.equals(patient.getLastName())
                && diagnosis.equals(patient.getDiagnosis())
                && age == (patient.getAge())
                && gender.equals(patient.getGender())) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return firstName.hashCode() + lastName.hashCode() + age + gender.hashCode();
    }

//1.8*. Сортировать пациентов по идентификационному номеру.
    @Override
    public int compareTo(Patient patient) {
        if (id > patient.getId()) {
            return 1;
        } else if (id == patient.getId()) {
            return 0;
        } else
            return -1;
    }
}