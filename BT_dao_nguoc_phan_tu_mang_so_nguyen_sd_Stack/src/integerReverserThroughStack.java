import java.util.Stack;

public class integerReverserThroughStack {

    public static <MyStack> void main(String[] as) throws Exception {

        Stack<Integer> stack = new Stack<Integer>();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int x:arr){
            System.out.printf("%d ",x   );
        }
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}
