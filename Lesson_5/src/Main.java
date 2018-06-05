public class Main {

    public static void main(String[] args) {
        countdown(-5);
//        int n = 5;
//        while (true) {
//            System.out.println(n--);
//        }
    }

    private static int countdown(int n) {
        if (n < 0) {
            return n;
        }
        System.out.println(n);
        return countdown(n - 1);
    }
}
