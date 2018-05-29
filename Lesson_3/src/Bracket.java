/**
 *   "{text() {display(); int[] a = new int[5];}}";
 */
public class Bracket {

    private String input;

    public Bracket(String input) {
        this.input = input;
    }

    public void check() {
        int size = input.length();
        CharStack stack = new CharStack(size);

        for (int i = 0; i < size; i++) {
            char ch = input.charAt(i);
            switch (ch) {
                case '[':
                case '{':
                case '(':
                    stack.push(ch);
                    break;
                case ']':
                case '}':
                case ')':
                    if (stack.isEmpty()) {
                        System.out.println("Error: " + ch + " at " + i);
                        continue;
                    }
                    char head = stack.pop();
                    if (head == '[' && ch != ']') {
                        System.out.println("Error: " + ch + " at " + i);
                    }
                    if (head == '(' && ch != ')') {
                        System.out.println("Error: " + ch + " at " + i);
                    }
                    if (head == '{' && ch != '}') {
                        System.out.println("Error: " + ch + " at " + i);
                    }
                    break;
            }
        }

        if (!stack.isEmpty()) {
            System.out.println("Error: missing right delimiter");
        }
    }

}
