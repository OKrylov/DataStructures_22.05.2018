public class HelloBye {

    public static void main(String[] args) {
        hello("Artem");
    }

    private static void hello(String name) {
        print("Hello, " + name + "!");
        bye(name);
    }

    private static void bye(String name) {
        print("Good bye, " + name + "!");
    }

    private static void print(String str) {
        System.out.println(str);
    }
}