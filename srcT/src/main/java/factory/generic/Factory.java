package factory.generic;

public interface Factory<K, V> {

    V create(K key);
}
