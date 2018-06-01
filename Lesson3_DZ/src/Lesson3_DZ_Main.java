import java.util.Stack;

public class Lesson3_DZ_Main {
    public static void main(String[] args) {
//        String str = "abcd";
//
//        Stack st = new Stack();
//        for (int i = 0; i < str.length(); i++) {
//            st.push(str.charAt(i));
//        }
//
//        while ( !st.isEmpty() ) {
//            System.out.print(st.pop());
//        }
//
//        if (true)
//            return;

        Deque deq = new ArrayDeque<Integer>(Integer.class, 6);
        deq.insertLast(1);
        deq.insertLast(2);
        deq.insertLast(3);
        deq.insertLast(4);
        deq.insertFirst(5);
        deq.insertFirst(6);

        deq.removeFirst();
        deq.removeLast();
//        displayLeftToRight(deq); // Queue
        displayRightToLeft(deq); //Stack
    }

    private static <T> void displayRightToLeft(Deque<T> deq) {
        while ( !deq.isEmpty() ) {
            System.out.println(deq.removeLast());
        }
    }

    private static <T> void displayLeftToRight(Deque<T> deq) {
        while ( !deq.isEmpty() ) {
            System.out.println(deq.removeFirst());
        }
    }
}
