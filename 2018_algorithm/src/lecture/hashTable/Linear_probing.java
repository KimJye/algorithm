package hashTable;

//Multiplication Method
public class Linear_probing {

  static class HashTable {

      static final int EMPTY = 0;
      static final int SIZE = 37;
      int[] a;

      public HashTable() {
          a = new int[SIZE];
      }

      public void add(int value) throws Exception {
          int startIndex = value % SIZE; // ������ ��ġ ���
          int count = 0;                 // �浹 Ƚ��
          System.out.printf("%d",value);
          System.out.println();
          do {
              int index = (startIndex + count) % SIZE; // ������ ��ġ ���
              if (a[index] == EMPTY) {                 // �� ĭ�̸�
                  a[index] = value;                    // �����ϰ� ����
                  System.out.printf("%d", a[index]);
                  System.out.println();
                  return;
              } else if (a[index] == value) return; // �̹� �� ���� ��������� �׳� ����
              ++count;                     // ������� ������, �浹�� �Ͼ ��Ȳ. �浹 Ƚ�� ����
              System.out.printf("%d,%d",count,index);
              System.out.println();
          } while (count < a.length);      // �浹 Ƚ���� �迭�� ũ�⺸�� ũ�ų� ������ �۾� ����
          throw new Exception("���� ����");
      }

      public void remove(int value) {
      }

      public boolean contains(int value) {
          int startIndex = value % SIZE; // ������ ��ġ ���
          int count = 0;                 // �浹 Ƚ��
          do {
              int index = (startIndex + count) % SIZE; // ������ ��ġ ���
              if (a[index] == EMPTY) return false;      // �� ĭ�̸� �� ���� �ؽ� ���̺� ����.
              else if (a[index] == value) return true;  // ã����.
              ++count;                  // ������� ������, �浹�� �Ͼ ��Ȳ. �浹 Ƚ�� ����
          } while (count < a.length);   // �浹 Ƚ���� �迭�� ũ�⺸�� ũ�ų� ������ �۾� ����
          return false;
      }
  }

  public static void main(String[] args) throws Exception {
      int maxValue = 200, maxCount = 10;
      HashTable hashTable = new HashTable();

      int[] data = { 4, 13, 144, 7, 9, 11, 44, 2, 115, 107, 196 };
      for (int i = 0; i < data.length; ++i)
          hashTable.add(data[i]);

      for (int i = 1;  i <= maxValue; ++i)
          if (hashTable.contains(i))
              System.out.println(i);
  }
}
