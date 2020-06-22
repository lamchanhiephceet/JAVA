import java.io.IOException;
public class stringReverserThroughStack {
    private String input;
    private String output;
    public stringReverserThroughStack(String in) {
        input = in;
    }
    public String reverSer() {
        int stackSize = input.length();
        Stack stack = new Stack(stackSize);
        for(int i = 0; i<input.length();i++) {
            char ch = input.charAt(i);
            stack.push(ch);
        }
        output = "";
        while(!stack.isEmpty()) {
            char ch = stack.pop();
            output = output + ch;
        }
        return output;
    }

    public static void main(String[] args) throws IOException {
        String input = "0.31 AVAJ yb nettirw edoc si sihT";
        String output;
        stringReverserThroughStack theReverser = new stringReverserThroughStack(input);
        output = theReverser.reverSer();
        System.out.println("Reversed: " +output);
    }
    class Stack {
        private int maxSize;
        private char[] stackArray;
        private int top;
        public Stack(int max) {
            maxSize = max;
            stackArray = new char[maxSize];
            top = -1;
        }
        public void push(char j) {
            stackArray[++top] = j;
        }
        public char pop() {
            return stackArray[top--];
        }
        public char peek() {
            return stackArray[top];
        }
        public boolean isEmpty() {
            return (top == -1);
        }
    }
}
