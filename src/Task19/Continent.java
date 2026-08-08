package Task19;

public enum Continent {

    AFRICA("Африка", "Африке"),
    ANTARCTICA("Антарктида", "Антарктиде"),
    ASIA("Азия", "Азии"),
    AUSTRALIA("Австралия", "Австралии"),
    EUROPE("Европа", "Европе"),
    NORT_AMERICA("Северная Америка", "Северной Америке"),
    SOUTH_AMERICA("Южная Америка", "Южной Америке");


    private final String cirilicContinent;
    private final String cirilicContinentType;

    Continent(String cirilicContinent, String cirilicContinenttype) {
        this.cirilicContinent = cirilicContinent;
        this.cirilicContinentType = cirilicContinenttype;
    }

    public String getCirilicContinent() {
        return cirilicContinent;
    }

    public String getCirilicContinentType() {
        return cirilicContinentType;
    }
}