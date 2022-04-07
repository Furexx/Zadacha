import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class MyQueue<E> extends MyClass<E>{

    private Queue<E> queue;

    public MyQueue(E[] array) {
        super(array);
    }


    @Override
    void initialize() {
        this.queue = new ArrayDeque<>();
        queue.addAll(Arrays.asList(array));
    }

    @Override
    void add(E item) {
        queue.add(item);
    }

    @Override
    void remove() {
        queue.poll();
    }

    @Override
    void getElement() {
        System.out.println(queue.peek());
    }
}
