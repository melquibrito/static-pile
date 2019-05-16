package staticlist;

public class StaticList<T extends Comparable> {

    private int beginning = 0;
    private int end = 0;
    private int size = 0;
    private final Object data[];

    public StaticList(int tamanhoFila) {
        data = new Object[tamanhoFila];
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean add(T t) {
        if (isFull()) {
            return false;
        }
        data[end] = t;
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
        if (isEmpty()) {
            return null;
        }
        T t = (T) data[beginning];
        return t;
    }

}

