import java.util.EmptyStackException;
import java.util.LinkedList;


public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack() {
        stack = new LinkedList();
    }
    public void push(T element) { // phuong thuc push
        stack.addFirst(element);
    }
    public T pop() { //pthuc pop
        if(isEmpty()) { //kiem tra co rong khong
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public int size() { // p.thuc size
        return stack.size();
    }
    public boolean isEmpty() {
        if(stack.size() == 0) {
            return true;
        }
        return false;
    }

}
