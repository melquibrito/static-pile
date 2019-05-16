package staticpile;

public class StaticPile<T extends Comparable> {

    private int beginning = 0, end = 0, size = 0;
    private final Object data[];

    public StaticPile(int size) {
        data = new Object[size];
    }
    
    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean add(T object) {
        if (!isFull()) {
            data[end] = object;
            end = (end + 1) % data.length;
            size++;
            return true;
        }
        return false;
    }

    public T remove() {
        if (!isEmpty()) {
            T t = (T) data[beginning];
            beginning = (beginning + 1) % data.length;
            size--;
            return t;
        }
        return null;
    }

    public T get() {
        if (!isEmpty()) {
            T t = (T) data[beginning];
            return t;
        }
        return null;
    }
    
    public int size() {
        return size;
    }
    
    @Override
    public String toString() {
        String list = "[]";
        if (!isEmpty()) {
            list = "[" + data[0];
            if (this.size() > 1) {
                for (int i = 1; i < this.size(); i++) {
                    list = list + ", " + data[i];
                }
            }
            list = list + "]";
        }
        return list;
    }

}
