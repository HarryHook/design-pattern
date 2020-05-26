package code.running.fun;

public interface Iterator<T> {

    Boolean hasNext();

    T next();

    void remove();
}
