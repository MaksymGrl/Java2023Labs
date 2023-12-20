public class Weapon extends Ammunition {
    private int damage;

    public Weapon(String name, double cost, double weight, int damage) {
        super(name, cost, weight);
        this.damage = damage;
    }


    public int getDamage() { return damage; }
    public void setDamage(int damage) { this.damage = damage; }
}