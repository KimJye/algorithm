package hashTable;

public class Example {

    public static void main(String[] args) throws Exception {
        Person[] a = new Person[] {
                new Person("ȫ�浿", 18),
                new Person("�Ӳ���", 22),
                new Person("����ġ", 23)
        };
        HashTable hashTable = new HashTable();

        for (Person person : a)
            hashTable.add(person);

        for (Person person : a)
            System.out.println(hashTable.contains(person));
        System.out.println(hashTable.contains(new Person("�����", 30)));
    }
}
