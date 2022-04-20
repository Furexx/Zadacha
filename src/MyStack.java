public class MyStack<E> extends MyClass<E>{

    private static int top, capacity;

    public MyStack(E[] array) {
        super(array);
        top = -1;
    }

    @Override
    void initialize(int numberOfElements) {
        capacity = numberOfElements;
        array = new E[capacity];
    }

    @Override
    void add(E item) {
        if (top + 1 == capacity){
            System.out.println("Stack is full");
        }else {
            top++;
            array[top] = item;
        }
    }

    @Override
    void remove() {
        if (top == -1){
            System.out.println("Stack is empty");
        }else {
            array[top] = null;
            top--;
        }
    }

    @Override
    void getElement() {
        if (top == -1){
            System.out.println("Stack is empty");
        }
        else {
            System.out.println(array[top]);
        }
    }


}


