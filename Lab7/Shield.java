public class Shield extends Ammunition {
    private int durability;

    public Shield(String name, double cost, double weight, int durability) {
        super(name, cost, weight);
        this.durability = durability;
    }


    public int getDurability() { return durability; }
    public void setDurability(int durability) { this.durability = durability; }
}