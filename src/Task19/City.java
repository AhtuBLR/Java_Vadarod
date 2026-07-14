package Task19;


//2. Создать класс Город. Поля id, имя города, население, континент (Enum)
public class City {
    private int id;
    private String cityName;
    private int population;
    private Continent continent;


    public City(int id, String cityName, int population, Continent continent) {
        this.id = id;
        this.cityName = cityName;
        this.population = population;
        this.continent = continent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    @Override
    public String toString() {
        return " {" + cityName +
                ", Id: " + id +
                ", Население: " + population +
                ", Континент: " + continent.getCirilicContinent() +
                '}';
    }
}