// 4! = 4 * 3 * 2 * 1 = 12 * 2 = 24
public class Factorail {

    public static void main(String[] args) {
//        System.out.println(factorail(5));
        System.out.println(factorial2(5));
    }

    private static int factorail(int digit) {
        if ( digit == 1) {
            return 1;
        }

        return digit * factorail(digit - 1);
    }

    private static int factorial2(int digit) {
        return doFactorial(digit, 1);
    }

    private static int doFactorial(int digit, int acc) {
        if (digit == 1) {
            return acc;
        }
        return doFactorial(digit - 1, acc *= digit);
    }


}
