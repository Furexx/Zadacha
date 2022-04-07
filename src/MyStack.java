import java.util.Stack;

public class MyStack<E> extends MyClass<E>{

    private Stack<E> stack;

    public MyStack(E[] array) {
        super(array);
    }

    @Override
    void initialize() {
        this.stack = new Stack<>();
        for (E item: array) {
            stack.push(item);
        }
    }

    @Override
    void add(E item) {
        stack.push(item);
    }

    @Override
    void remove() {
        stack.pop();
    }

    @Override
    void getElement() {
        System.out.println(stack.peek());
    }


}


