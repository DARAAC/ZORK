package ch.bbw.zork;

public class Items {
    private String name;
    private String description;
    private int weight;

    public Items(String name, String description, int weight){
        this.name = name;
        this.description = description;
        this.weight = weight;
    }

    public String getName() {

        return name;
    }
    public String getDescription() {
        return description;
    }

    public int getWeight() {
        return weight;
    }
}
