import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.Arrays;

public class AmmunitionSet implements Set<Ammunition> {
    private static final int INITIAL_CAPACITY = 15;
    private Ammunition[] items;
    private int size;

    public AmmunitionSet() {
        items = new Ammunition[INITIAL_CAPACITY];
        size = 0;
    }

    public AmmunitionSet(Ammunition ammo) {
        this();
        add(ammo);
    }

    public AmmunitionSet(Collection<Ammunition> collection) {
        this();
        addAll(collection);
    }

    private void resizeIfNeeded() {
        if (size == items.length) {
            int newCapacity = items.length + (int) (items.length * 0.3);
            Ammunition[] newItems = new Ammunition[newCapacity];
            System.arraycopy(items, 0, newItems, 0, items.length);
            items = newItems;
        }
    }

    @Override
    public boolean add(Ammunition ammunition) {
        if (contains(ammunition)) return false;
        resizeIfNeeded();
        items[size++] = ammunition;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < size; i++) {
            if (items[i].equals(o)) {
                System.arraycopy(items, i + 1, items, i, size - i - 1);
                size--;
                items[size] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean contains(Object o) {
        for (Ammunition item : items) {
            if (item != null && item.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Iterator<Ammunition> iterator() {
        return new Iterator<>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size;
            }

            @Override
            public Ammunition next() {
                if (!hasNext()) throw new NoSuchElementException();
                return items[currentIndex++];
            }
        };
    }

    @Override
    public Object[] toArray() {
        Ammunition[] newArray = new Ammunition[size];
        System.arraycopy(items, 0, newArray, 0, size);
        return newArray;
    }

    @Override
    public boolean addAll(Collection<? extends Ammunition> c) {
        boolean modified = false;
        for (Ammunition item : c) {
            if (add(item)) {
                modified = true;
            }
        }
        return modified;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean modified = false;
        for (Object item : c) {
            if (remove(item)) {
                modified = true;
            }
        }
        return modified;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        boolean modified = false;
        for (int i = 0; i < size; ) {
            if (!c.contains(items[i])) {
                remove(items[i]);
                modified = true;
            } else {
                i++;
            }
        }
        return modified;
    }

    @Override
    public void clear() {
        Arrays.fill(items, 0, size, null);
        size = 0;
    }


    @Override
    public <T> T[] toArray(T[] a) {
        if (a.length < size) {
            return (T[]) Arrays.copyOf(items, size, a.getClass());
        }
        System.arraycopy(items, 0, a, 0, size);
        if (a.length > size) {
            a[size] = null;
        }
        return a;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object item : c) {
            if (!contains(item)) {
                return false;
            }
        }
        return true;
    }
}