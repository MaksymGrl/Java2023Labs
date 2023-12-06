public class Armor extends Ammunition {
    private int protectionLevel;

    public Armor(String name, double cost, double weight, int protectionLevel) {
        super(name, cost, weight);
        this.protectionLevel = protectionLevel;
    }


    public int getProtectionLevel() { return protectionLevel; }
    public void setProtectionLevel(int protectionLevel) { this.protectionLevel = protectionLevel; }
}