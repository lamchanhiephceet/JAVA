import java.util.Arrays;
import java.util.Stack;

public class DecimalToBinary {
    public void convertBinary(int num) {
        Stack<Integer> stack = new Stack<Integer>();
        while (num != 0) {
            int n = num % 2;
            stack.push(n);
            num /= 2;
        }
        while (!(stack.isEmpty())) {
            System.out.println(stack.pop());
        }
    }

    public static void main(String[] args) {
        int decimalNumber = 12;
        System.out.println("He nhi phan cua " + decimalNumber + " la:");
        new DecimalToBinary().convertBinary(decimalNumber);
    }
}
