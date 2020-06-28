import java.util.Stack;
public class Checksymboy {

        public static void main(String[] args) {
            boolean check = true;
            Stack<Character> stack = new Stack<>();
            //String string = "s * (s – a) * s – b) * (s – c)";
            //String string = "s * (s – a) * (s – b * (s – c)";
            String string = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a))";
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == '(') {
                    stack.add(string.charAt(i));
                } else if (string.charAt(i) == ')') {
                    if (stack.size() == 0) {
                        check = false;
                    } else
                        stack.pop();
                }
            }
            if (stack.size() == 0 && check) {
                System.out.println("Correct brackets used.");
            } else
                System.out.println("Incorrect brackets used.");
        }
    }

