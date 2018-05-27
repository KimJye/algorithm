package hashTable;

import java.util.Random;

public class 두배확장코드추가  {

    static class HashTable {

        static final int EMPTY = 0;
        static final int DELETED = -1;
        static final double A = 0.3758;

        int[] a;
        int count;
        int threshold;

        public HashTable() {
            this(32);  // 디폴트 크기 32
        }

        public HashTable(int size) {
            this.a = new int[size];
            this.count = 0;
            this.threshold = (int)(this.a.length * 0.7); //load factor가 0.7 이상이면 두 배 확장해야 함
        }

        private void resize() {
            int newSize = a.length * 2;
            HashTable newHashTable = new HashTable(newSize);
            for (int i = 0; i < a.length; ++i)
                if (a[i] != EMPTY && a[i] != DELETED)
                    newHashTable.add(a[i]);
            this.a = newHashTable.a;
            this.threshold = newHashTable.threshold;
        }

        private int getStartIndex(int value) { // 최초 저장할 위치 계산
            double fractionalPart = (value * A) % 1;       // (1), (2)
            return (int)(fractionalPart * this.a.length);  // (3), (4)
        }

        private static int getStepDistance(int value) { // 충돌 발생한 경우 건너뛸 간격 계산
            int r = 0;     
            switch (value % 7) {   // value가 음수일 경우에 버그!
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

        public void add(int value) {
            int startIndex = getStartIndex(value);
            int step = getStepDistance(value);
            int collisionCount = 0;
            do {
                int index = (startIndex + collisionCount * step) % a.length;
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

        public void remove(int value) {
            int startIndex = getStartIndex(value);
            int step = getStepDistance(value);
            int collisionCount = 0;
            do {
                int index = (startIndex + collisionCount * step) % a.length;
                if (a[index] == EMPTY) return;
                else if (a[index] == value) {
                    a[index] = DELETED;
                    this.count--;
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
                ++collisionCount;
            } while (collisionCount < a.length);
            return false;
        }
    }

    public static void main(String[] args) throws Exception {
        int maxValue = 600;
        HashTable hashTable = new HashTable();

        Random random = new Random();
        for (int i = 0; i < maxValue * 2; ++i)
            hashTable.add(random.nextInt(maxValue));

        for (int i = 1;  i <= maxValue; ++i)
            if (hashTable.contains(i))
                System.out.println(i);
    }
}
