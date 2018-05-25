import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        Integer[] a = {5, 4, 3, 2, 1};


//        a[0] = 5;
//        a[1] = 4;
//        a[2] = 3;
//        a[3] = 2;
//        a[4] = 1;

//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }

//        intTest();

//        strTest();

//        intOrderedTest();

        Array<Integer> intArray = new ArrayImpl<>(5);
        intArray.insert(3);
        intArray.insert(1);
        intArray.insert(5);
        intArray.insert(2);
        intArray.insert(0);

//        intArray.sortBubble();
//        intArray.sortSelect();
        intArray.sortInsert();

        intArray.display();

        Random r = new Random();
        r.nextInt();



    }

    private static void strTest() {
        Array<String> stringArray = new ArrayImpl<>(5);
        stringArray.insert("5");
        stringArray.insert("6");
        stringArray.insert("7");
        stringArray.insert("8");

        if ( !stringArray.isFull() ) {
            stringArray.insert("9");
        }

        stringArray.delete("7");

        if ( !stringArray.isFull() ) {
            stringArray.insert("10");
        }

        stringArray.display();
    }

    private static void intTest() {
        Array<Integer> intArray = new ArrayImpl<>(5);
        intArray.insert(5);
        intArray.insert(6);
        intArray.insert(7);
        intArray.insert(8);

        if ( !intArray.isFull() ) {
            intArray.insert(9);
        }

        intArray.delete(7);

        if ( !intArray.isFull() ) {
            intArray.insert(10);
        }

        intArray.display();


    }

    private static void intOrderedTest() {
        Array<Integer> intArray = new OrderedArrayImpl<>(5);
        intArray.insert(5);
        intArray.insert(8);
        intArray.insert(7);
        intArray.insert(6);

        if ( !intArray.isFull() ) {
            intArray.insert(10);
        }

        intArray.delete(7);

        if ( !intArray.isFull() ) {
            intArray.insert(9);
        }

        intArray.display();

        System.out.println("Index for 6 is " + intArray.indexOf(6));
    }
}
