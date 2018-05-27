package hashTable;

public class HashTable {

    static final Object EMPTY = null;
    static final Object DELETED = new Object();
    static final double A = 0.3758;
    static final int[] PRIME_NUMBER = {3, 5, 7, 11, 13, 17, 19 };

    Object[] a;
    int count;
    int threshold;

    public HashTable() {
        this(32);
    }

    public HashTable(int size) {
        this.a = new Object[size];
        this.threshold = (int)(this.a.length * 0.7);
    }

    private void resize() {
        int newSize = a.length * 2;
        HashTable newHashTable = new HashTable(newSize);
        for (Object value : a)
            if (value != EMPTY && value != DELETED)
                newHashTable.add(value);
        this.a = newHashTable.a;
        this.threshold = newHashTable.threshold;
    }

    public void add(Object value) {
        int collisionCount = 0;
        do {
            int index = getIndex(value, collisionCount);
            if (a[index] == EMPTY || a[index] == DELETED) {
                a[index] = value;
                this.count++;
                if (this.count >= this.threshold) resize();
                return;
            } else if (a[index] == value)
                return;
            ++collisionCount;
        } while (collisionCount < a.length);
    }

    private int getIndex(Object value, int collisionCount) {
        int startIndex = (int)(((value.hashCode() * A) % 1) * this.a.length);
        int step = PRIME_NUMBER[value.hashCode() % 7];
        return (startIndex + collisionCount * step) % a.length;
    }

    public void remove(Object value) {
        int collisionCount = 0;
        do {
            int index = getIndex(value, collisionCount);
            if (a[index] == EMPTY) return;
            else if (a[index].equals(value)) {
                a[index] = DELETED;
                this.count--;
                return;
            }
            ++collisionCount;
        } while (collisionCount < a.length);
    }

    public boolean contains(Object value) {
        int collisionCount = 0;
        do {
            int index = getIndex(value, collisionCount);
            if (a[index] == EMPTY) return false;
            else if (a[index].equals(value)) return true;
            ++collisionCount;
        } while (collisionCount < a.length);
        return false;
    }
}
