public class Main {

    public static void main(String[] args) {
        Tree theTree = new TreeImpl(100);
        theTree.insert(new Person("Oleg", 25, 60));
        theTree.insert(new Person("Oleg", 25, 25));
        theTree.insert(new Person("Oleg", 25, 66));
        theTree.insert(new Person("Oleg", 25, 15));
        theTree.insert(new Person("Oleg", 25, 45));
        theTree.insert(new Person("Oleg", 25, 5));
        theTree.insert(new Person("Oleg", 25, 20));
        theTree.insert(new Person("Oleg", 25, 30));
        theTree.insert(new Person("Oleg", 25, 55));
        theTree.insert(new Person("Oleg", 25, 31));
        theTree.insert(new Person("Oleg", 25, 62));

//        theTree.remove(55);
//        theTree.remove(62);
//        System.out.println(theTree.remove(25));
//        System.out.println("55 person = " + theTree.find(60));

        theTree.traverse(TraverseType.PRE_ORDER);

        theTree.displayTree();
    }
}
