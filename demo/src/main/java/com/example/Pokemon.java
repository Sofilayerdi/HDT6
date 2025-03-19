public class Pokemon {
    private String name;
    private int number;
    private String type1;
    private String type2;
    private String classification;
    private double height;
    private double weight;
    private String ability;
    private int generation;
    private boolean isLegendary;

    public Pokemon(String name, int number, String type1, String type2, String classification, double height, double weight, String ability, int generation, boolean isLegendary) {
        this.name = name;
        this.number = number;
        this.type1 = type1;
        this.type2 = type2;
        this.classification = classification;
        this.height = height;
        this.weight = weight;
        this.ability = ability;
        this.generation = generation;
        this.isLegendary = isLegendary;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String getType1() {
        return type1;
    }

    public String getType2() {
        return type2;
    }

    public String getClassification() {
        return classification;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getAbility() {
        return ability;
    }

    public int getGeneration() {
        return generation;
    }

    public boolean isLegendary() {
        return isLegendary;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "Nombre='" + name + '\'' +
                ", Numero=" + number +
                ", Type1='" + type1 + '\'' +
                ", Type2='" + type2 + '\'' +
                ", Clasificacion='" + classification + '\'' +
                ", Altura=" + height +
                ", Peso=" + weight +
                ", Habilidad='" + ability + '\'' +
                ", Generacion=" + generation +
                ", Legendario=" + isLegendary +
                '}';
    }
}
