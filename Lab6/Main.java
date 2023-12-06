import java.util.*;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        AmmunitionManager manager = new AmmunitionManager();

        manager.addAmmunition(new Armor("Plate Armor", 1500, 25.5, 5));
        manager.addAmmunition(new Weapon("Sword", 500, 3.2, 7));
        manager.addAmmunition(new Weapon("Sword 2", 1000, 4.1, 12));
        manager.addAmmunition(new Shield("Wooden Shield", 300, 5.0, 3));

        System.out.println("Total Cost: " + manager.calculateTotalCost());
        manager.sortAmmunitionByWeight();

        /*
        ArrayList<Ammunition> items = manager.getAmmunitionList();
        for (Ammunition item: items){
            System.out.println(item.getName());
        }
        */

        ArrayList<Ammunition> itemsInRange = manager.findItemsInPriceRange(200, 999);
        for (Ammunition item : itemsInRange) {
            System.out.println(item.getName() + " - $" + item.getCost());
        }
    }
}