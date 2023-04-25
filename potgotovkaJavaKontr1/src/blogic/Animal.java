package blogic;

public class Animal
{
    private String name;
    private AnimalType animalType;
    private boolean predator;
    private String region;
    private boolean endangered;

    public static final String[] REGIONS = {"Africa", "Asia", "Australia", "Europe", "America"};

    public String getName() {
        return name;
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    public boolean isPredator() {
        return predator;
    }

    public String getRegion() {
        return region;
    }

    public boolean isEndangered() {
        return endangered;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
        this.name = "UNKNOWN";
    }

    public void setAnimalType(AnimalType animalType) {
        if (animalType != null)
        {
            this.animalType = animalType;
        }
        this.animalType = AnimalType.BIRD;
    }

    public void setPredator(boolean predator) {
        this.predator = predator;
    }

    public void setRegion(String region) {
        for (int i = 0; i < REGIONS.length; i++)
        {
            if (region != null && region.equals(REGIONS[i]))
            {
                this.region = region;
                return;
            }
        }
        this.region = "UNKNOWN";
    }

    public void setEndangered(boolean endangered) {
        this.endangered = endangered;
    }

    @Override
    public String toString() {
        return "Животно {" +
                name + ", тип= " + animalType.getTypeName() +
                ", хишник= " + ((predator)? "Да" : "Не") +
                ", район= " + region +
                ", застрашен= " + ((endangered)? "Да" : "Не" +
                '}');
    }
}
