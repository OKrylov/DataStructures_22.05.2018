public class Main {

    public static void main(String[] args) {
//        HashTable hashTable = new HashTable(23);
        HashTable hashTable = new DoubleHashTable(23);

        Item item2 = new Item("Irina", 36);
        Item item3 = new Item("Pavel", 18);
        Item item1 = new Item("Oleg", 25);

        hashTable.add(item1);
        hashTable.add(item2);
        hashTable.add(item3);

//        hashTable.remove(item3);

        System.out.println("Find 26 = "+ hashTable.find(26));

        hashTable.display();
    }
}
