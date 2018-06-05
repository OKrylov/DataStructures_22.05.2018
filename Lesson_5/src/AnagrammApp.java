import java.util.LinkedHashSet;
import java.util.Set;

public class AnagrammApp {

    private int size;
    private int count;
    private static char[] arr = new char[4];

    private static Set<String> data = new LinkedHashSet<>();

    public static void main(String[] args) {
        String str = "soul";
        fillArray(str);
        getAnagramm(str.length());

        //
//        for (String anagramm : data) {
//            System.out.println(anagramm);
//        }

        data.forEach(System.out::println);
    }

    private static void getAnagramm(int currentSize) {
        if (currentSize == 1) {
            return;
        }
        for (int i = 0; i < currentSize; i++) {
            getAnagramm(currentSize - 1);
            data.add(getCurrentAnagramm());
//            if (currentSize == 2) {
//                display();
//            }
            rotate(currentSize);
        }



    }

    private static void rotate(int currentSize) {
        int pos = arr.length - currentSize;
        char temp = arr[pos];
        int index = pos + 1;
        for (; index < arr.length; index++) {
            arr[index - 1] = arr[index];
        }
        arr[index - 1] = temp;//soul -> sulo
    }

    private static void display() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println("");
    }

    private static String getCurrentAnagramm() {
        return new String(arr);
    }

    private static void fillArray(String str) {
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
    }

}
