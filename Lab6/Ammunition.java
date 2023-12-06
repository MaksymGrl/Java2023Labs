public abstract class Ammunition {
    private String name;
    private double cost;
    private double weight;

    public Ammunition(String name, double cost, double weight) {
        this.name = name;
        this.cost = cost;
        this.weight = weight;
    }

    public String getName() { return name; }
    public double getCost() { return cost; }
    public double getWeight() { return weight; }

    public void setName(String name) { this.name = name; }
    public void setCost(double cost) { this.cost = cost; }
    public void setWeight(double weight) { this.weight = weight; }
}