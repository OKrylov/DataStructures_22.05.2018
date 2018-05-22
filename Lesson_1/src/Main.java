public class Main {

    public static void main(String[] args) {
        int a = 4;
        String str = new String("abc");//001


        System.out.println("Value is " + a);
        System.out.println("Value is " + str);
        System.out.println("a = 4: " + (a == 4));


        String str2 = "abc";//002
        String str3 = str;//001
        System.out.println("Variable 'str' = abc: " + (str == str2));
        System.out.println("Variable 'str' = abc: " + (str == str2));
        System.out.println("Variable 'str' = 'str3': " + (str == str3));
        System.out.println("Variable by equals 'str' = 'abc': " + (str.equals(str2)));

        System.out.println("------------------");

        test(a, str);//001
        System.out.println("a = " + a);
        System.out.println("str = " + str);

        System.out.println("------------------");

        Person p = new Person("Oleg");//005
        test2(p);//005
        System.out.println("p = " + p);
        //Oleg
        //Pavel
        //ERROR
        //sdghu25412

        Integer[] arr = new Integer[5];
        arr[0] = 5;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    private static void test(int a, String str) {//001
        a += 1;
        str = "def";//004
    }
    private static void test2(Person p) {//005
//        p.setName("Pavel");//005
        p = new Person("Pavel");
    }

}
