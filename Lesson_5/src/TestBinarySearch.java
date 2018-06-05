public class TestBinarySearch {

    public static void main(String[] args) {
        OrderedArrayImpl<Integer> array = new OrderedArrayImpl(5);
        array.insert(5);
        array.insert(3);
        array.insert(7);
        array.insert(6);
        array.insert(1);

        array.display();

        System.out.println("Find 7. Position expected 4, real is " + array.recBinarySearch(7));
        System.out.println("Find 13. Position expected -1, real is " + array.recBinarySearch(13));
    }
}
