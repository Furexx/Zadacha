public class MyQueue<E> extends MyClass<E>{

    private static int front, rear, capacity;

    public MyQueue(E[] array) {
        super(array);
        front = 0;
        rear = 0;
    }


    @Override
    void initialize(int numOfElements) {
        capacity = numOfElements;
        array = new E[capacity];
    }

    @Override
    void add(E item) {
      if (capacity == rear) {
          System.out.println("Queue is full");
      }
      else {
          array[rear] = item;
          rear++;
      }

    }

    @Override
    void remove() {
        if (front == rear) {
            System.out.println("Queue is empty");
        }
        else {
            for (int i = 0; i < rear - 1; i++) {
                array[i] = array[i +1];
            }
            if (rear < capacity){
                array[rear] = null;
            }
            rear--;
        }
    }

    @Override
    void getElement() {
        if (front == rear){
            System.out.println("Queue is empty");
        }
        System.out.println(array[front]);

    }
}
