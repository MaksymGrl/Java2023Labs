import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class AmmunitionManager {
    private ArrayList<Ammunition> ammunitionList = new ArrayList<>();

    public void addAmmunition(Ammunition ammo) {
        ammunitionList.add(ammo);
    }

    public ArrayList<Ammunition> getAmmunitionList(){
        return ammunitionList;
    }
    public double calculateTotalCost() {
        double totalCost = 0;
        for (Ammunition ammo : ammunitionList) {
            totalCost += ammo.getCost();
        }
        return totalCost;
    }

    public void sortAmmunitionByWeight() {
        ammunitionList.sort(Comparator.comparingDouble(Ammunition::getWeight));
    }
    public ArrayList<Ammunition> findItemsInPriceRange(double minPrice, double maxPrice) {
        ArrayList<Ammunition> filteredList = new ArrayList<>();
        for (Ammunition ammo : ammunitionList) {
            if (ammo.getCost() >= minPrice && ammo.getCost() <= maxPrice) {
                filteredList.add(ammo);
            }
        }
        return filteredList;
    }
}