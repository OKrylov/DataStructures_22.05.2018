public class CharStack {

        private char[] data;
        private int size;

        public CharStack(int size) {
            this.data = new char[size];
        }

        public void push(char value) {
            data[size++] = value;
        }

        public char pop() {
            size--;
            return data[size];
        }

        public char peek() {
            return data[size - 1];
        }

        public int getSize() {
            return size;
        }

        public boolean isFull() {
            return size >= data.length;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public void display() {
            for (int i = size - 1; i >= 0; i--) {
                System.out.println(data[i]);
            }
        }

}
