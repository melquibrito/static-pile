package staticlist;

public class StaticList<T extends Comparable> {
    
    private int beginning = 0, end = 0, size = 0;
    private final Object data[];

    public StaticList(int size) {
        data = new Object[size];
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean add(T object) {
        if (isFull()) {
            return false;
        }
        data[end] = object;
        end = (end + 1) % data.length;
        size++;
        return true;
    }

    public T remove() {
        if (isEmpty()) {
            return null;
        }
        T t = (T) data[beginning];
        beginning = (beginning + 1) % data.length;
        size--;
        return t;
    }

    public T get() {
        if (!isEmpty()) {
            T t = (T) data[beginning];
            return t;
        }
        return null;
    }
    
}
