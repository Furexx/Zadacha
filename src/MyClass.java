import java.util.Stack;

abstract class MyClass<E> {
    protected E[] array;

    public MyClass(E[] array){
        this.array = array;
    }

    abstract void initialize();

    abstract void add(E item);


    abstract void remove();

    abstract void getElement();

}
