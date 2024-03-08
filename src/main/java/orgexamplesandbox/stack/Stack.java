package orgexamplesandbox.stack;

public interface Stack<E> {

    boolean empty();
    E peek();
    E pop();
    void push(E item);
    int search(E element);

}
