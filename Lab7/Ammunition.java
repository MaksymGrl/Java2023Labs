import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ammunition that = (Ammunition) o;
        return Double.compare(that.cost, cost) == 0 &&
                Double.compare(that.weight, weight) == 0 &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost, weight);
    }
}