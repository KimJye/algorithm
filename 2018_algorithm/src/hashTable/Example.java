package hashTable;

public class Example {

    public static void main(String[] args) throws Exception {
        Person[] a = new Person[] {
                new Person("È«±æµ¿", 18),
                new Person("ÀÓ²©Á¤", 22),
                new Person("Àü¿ìÄ¡", 23)
        };
        HashTable hashTable = new HashTable();

        for (Person person : a)
            hashTable.add(person);

        for (Person person : a)
            System.out.println(hashTable.contains(person));
        System.out.println(hashTable.contains(new Person("¿¬ÈïºÎ", 30)));
    }
}
