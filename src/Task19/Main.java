package Task19;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        upperMethod();
        createCity();


    }

    //1.1 На основании этого интерфейса создать лямбда выражение, которое будет возвращать строку с большими буквами.

    public static void upperMethod() {
        StringHandler toUpper = string -> string.toUpperCase();
        System.out.println(toUpper.handler("лямбда - да - да -да"));
    }

    public static void createCity() {
        //1.1. Создать города
        City city1 = new City(1, "Каир", 9500000, Continent.AFRICA);
        City city2 = new City(2, "Принцеса Элизабет", 50, Continent.ANTARCTICA);
        City city3 = new City(3, "Токио", 34000000, Continent.ASIA);
        City city4 = new City(4, "Сидней", 5000000, Continent.AUSTRALIA);
        City city5 = new City(5, "Лондон", 9000000, Continent.EUROPE);
        City city6 = new City(6, "Нью-Йорк", 8500000, Continent.NORT_AMERICA);
        City city7 = new City(7, "Сан-Паулу", 12000000, Continent.SOUTH_AMERICA);
        City city8 = new City(8, "Шанхай", 24000000, Continent.ASIA);
        City city9 = new City(9, "Бангкок", 8000000, Continent.ASIA);
        City city10 = new City(10, "Мадрид", 3200000, Continent.EUROPE);
        List<City> cities = List.of(city1, city2, city3, city4, city5, city6, city7, city8, city9, city10);

//1.2. Найти самый густонаселённый город на континенте (filter по континенту+ max)

        City maxAsia = cities.stream().filter(city -> city.getContinent() == Continent.ASIA).max(Comparator.comparing(City::getPopulation)).orElse(null);
        System.out.println();
        System.out.println("Самый густонаселенный город в " + Continent.ASIA.getCirilicContinentType() + ": " + maxAsia);

        City maxEurope = cities.stream().filter(city -> city.getContinent() == Continent.EUROPE).max(Comparator.comparing(City::getPopulation)).orElse(null);
        System.out.println();
        System.out.println("Самый густонаселенный город в " + Continent.EUROPE.getCirilicContinentType() + ": " + maxEurope);

//1.3. Найти город, с минимальным населением на континенте. (filter по континенту+ min)
        City minAsia = cities.stream().filter(city -> city.getContinent() == Continent.ASIA).min(Comparator.comparing(City::getPopulation)).orElse(null);
        System.out.println();
        System.out.println("Самый минимально населенный город в " + Continent.ASIA.getCirilicContinentType() + ": " + minAsia);

        City minEurope = cities.stream().filter(city -> city.getContinent() == Continent.EUROPE).min(Comparator.comparing(City::getPopulation)).orElse(null);
        System.out.println();
        System.out.println("Самый минимально населенный город в " + Continent.EUROPE.getCirilicContinentType() + ": " + minEurope);

//1.4. Найти самый густонаселённый город (max)
        City maxCities = cities.stream().max(Comparator.comparing(City::getPopulation)).orElse(null);
        System.out.println();
        System.out.println("Самый густонаселённый город: " + maxCities);

//1.5. Найти город с самым маленьким населением. (min)
        City minCities = cities.stream().min(Comparator.comparing(City::getPopulation)).orElse(null);
        System.out.println();
        System.out.println("Самый минимально населенный город: " + minCities);

// 1.6. Найти первый попавшиеся город, у которого население больше 1млн. (filter + findFirst).
        City over_1M_FirstCity = cities.stream().filter(city -> city.getPopulation() > 1000000).findFirst().orElse(null);
        System.out.println();
        System.out.println("Первый город с населением > 1 млн: " + over_1M_FirstCity);

// 1.7. Отобрать города с населением больше 1 млн. (filter)
        List<City> over_1M_population = cities.stream().filter(city -> city.getPopulation() > 1000000).toList();
        System.out.println();
        System.out.println("Города с населением больше 1 млн. " + over_1M_population);

//1.8. Создать коллекцию из названий городов, на основании объектов (map)
        List<String> cityNames = cities.stream().map(City::getCityName).toList();
        System.out.println();
        System.out.println("Названия всех городов: " + cityNames);
    }
}