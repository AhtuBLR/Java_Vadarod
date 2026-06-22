package Task14;

//сделать enum класс: Мужской, Женский
public enum Gender {
    MALE("Мужской", "Мужская"),
    FEMAIL("Женский", "Женская");
    private final String genderType;
    private final String roomType;


    Gender(String genderType, String roomType) {
        this.genderType = genderType;
        this.roomType = roomType;
    }

    public String getGenderType() {
        return genderType;
    }

    public String getRoomType() {
        return roomType;
    }
}
