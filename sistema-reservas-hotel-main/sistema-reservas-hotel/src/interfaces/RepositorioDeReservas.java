package interfaces;

public interface RepositorioDeReservas<T> {
    
    void add(T object);
    void remove(int index);
    void set(int index, T object);
    void clear();
    T get(int index);
    int size();

}
