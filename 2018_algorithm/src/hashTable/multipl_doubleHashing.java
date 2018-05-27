package hashTable;
//multiplication method + doubling hashing 기능 구현

public class multipl_doubleHashing{

    static class HashTable {

        static final int EMPTY = 0;
        static final int DELETED = -1;
        static final double A = 0.3758;

        int[] a;

        public HashTable() {
            this(32);  // 디폴트 크기 32
        }

        public HashTable(int size) {
            this.a = new int[size];
        }

        private int getStartIndex(int value) { // 최초 저장할 위치 계산
            double fractionalPart = (value * A) % 1;       // (1), (2)
            return (int)(fractionalPart * this.a.length);  // (3), (4)
        }

        private static int getStepDistance(int value) { // 충돌 발생한 경우 건너뛸 간격 계산
            int r = 0;
            switch (value % 7) {
            case 0: r = 3; break;
            case 1: r = 5; break;
            case 2: r = 7; break;
            case 3: r = 11; break;
            case 4: r = 13; break;
            case 5: r = 17; break;
            case 6: r = 19; break;
            }
            return r;
        }

        public void add(int value) throws Exception {
            int startIndex = getStartIndex(value);
            int step = getStepDistance(value);
            int collisionCount = 0;
            do {
                int index = (startIndex + collisionCount * step) % a.length;
                if (a[index] == EMPTY || a[index] == DELETED) {
                    a[index] = value;
                    return;
                } else if (a[index] == value)
                    return;
                ++collisionCount;
            } while (collisionCount < a.length);
            throw new Exception("공간 부족");
        }

        public void remove(int value) {
            int startIndex = getStartIndex(value);
            int step = getStepDistance(value);
            int collisionCount = 0;
            do {
                int index = (startIndex + collisionCount * step) % a.length;
                if (a[index] == EMPTY) return;
                else if (a[index] == value) {
                    a[index] = DELETED;
                    return;
                }
                ++collisionCount;
            } while (collisionCount < a.length);
        }

        public boolean contains(int value) {
            int startIndex = getStartIndex(value);
            int step = getStepDistance(value);
            int collisionCount = 0;
            do {
                int index = (startIndex + collisionCount * step) % a.length;
                if (a[index] == EMPTY) return false;
                else if (a[index] == value) return true;
                index = (index + 1) % 37;
                ++collisionCount;
            } while (collisionCount < a.length);
            return false;
        }
    }

    public static void main(String[] args) throws Exception {
        int maxValue = 200, maxCount = 10;
        HashTable hashTable = new HashTable();

        int[] data = { 4, 13, 144, 7, 9, 11, 44, 115, 107, 196 };
        for (int i = 0; i < data.length; ++i)
            hashTable.add(data[i]);

        hashTable.remove(11);
        hashTable.remove(44);

        for (int i = 1;  i <= maxValue; ++i)
            if (hashTable.contains(i))
                System.out.println(i);
    }
}
