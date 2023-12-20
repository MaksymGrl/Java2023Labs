import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Тест 1: використання порожнього конструктора
        AmmunitionSet ammunitionSet = new AmmunitionSet();
        System.out.println("Test 1: Empty Constructor");
        performBasicOperations(ammunitionSet);

        // Тест 2: використання конструктора з одним об'єктом
        Ammunition initialAmmo = new Weapon("Dagger", 200, 1.5, 4);
        AmmunitionSet singleItemSet = new AmmunitionSet(initialAmmo);
        System.out.println("\nTest 2: Single Item Constructor");
        performBasicOperations(singleItemSet);

        // Тест 3: використання конструктора з колекцією об'єктів
        List<Ammunition> initialCollection = Arrays.asList(
                new Armor("Leather Armor", 600, 15.0, 3),
                new Shield("Iron Shield", 400, 7.5, 5)
        );
        AmmunitionSet collectionSet = new AmmunitionSet(initialCollection);
        System.out.println("\nTest 3: Collection Constructor");
        performBasicOperations(collectionSet);
    }

    private static void performBasicOperations(AmmunitionSet ammunitionSet) {
        // Додавання елементів
        ammunitionSet.add(new Armor("Chainmail", 800, 15.0, 4));
        ammunitionSet.add(new Weapon("Axe", 600, 5.1, 8));

        // Перевірка розміру та isEmpty
        System.out.println("Size of set: " + ammunitionSet.size());
        System.out.println("Is set empty? " + ammunitionSet.isEmpty());

        // Відображання елементів
        System.out.println("Items in set:");
        for (Ammunition ammo : ammunitionSet) {
            System.out.println(ammo.getName() + " - $" + ammo.getCost());
        }
        // Спроба додати копію
        boolean added = ammunitionSet.add(new Weapon("Axe", 600, 5.1, 8));
        System.out.println("Was duplicate item added? " + added); // Повинно бути false

        // Чи є об'єкт в сеті
        Ammunition axe = new Weapon("Axe", 600, 5.1, 8);
        System.out.println("Set contains Axe: " + ammunitionSet.contains(axe));

        // Видалення об'єекта
        ammunitionSet.remove(axe);
        System.out.println("Set contains Axe after removal: " + ammunitionSet.contains(axe));

        // Додавання групи
        ArrayList<Ammunition> additionalItems = new ArrayList<>();
        additionalItems.add(new Shield("Bronze Shield", 250, 6.0, 3));
        additionalItems.add(new Weapon("Bow", 400, 2.5, 5));
        ammunitionSet.addAll(additionalItems);

        // Видалення групи
        ArrayList<Ammunition> itemsToRemove = new ArrayList<>();
        itemsToRemove.add(new Weapon("Bow", 400, 2.5, 5));
        ammunitionSet.removeAll(itemsToRemove);

        // Відображання елементів після операцій
        System.out.println("Items in set:");
        for (Ammunition ammo : ammunitionSet) {
            System.out.println(ammo.getName() + " - $" + ammo.getCost());
        }

        // Утримати певні елементи
        ArrayList<Ammunition> itemsToRetain = new ArrayList<>();
        itemsToRetain.add(new Armor("Chainmail", 800, 15.0, 4));
        ammunitionSet.retainAll(itemsToRetain);

        // Конвертація в Array
        System.out.println("Set converted to array. Array length: " + ammunitionSet.toArray().length);

        // Відображання елементів після операцій
        System.out.println("Items in set:");
        for (Ammunition ammo : ammunitionSet) {
            System.out.println(ammo.getName() + " - $" + ammo.getCost());
        }

        // Очищення сету
        ammunitionSet.clear();
        System.out.println("Is set empty after clearing? " + ammunitionSet.isEmpty());
    }
}