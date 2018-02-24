package example;

import java.util.Collection;

/**
 * This is interface for collection  with automatically extendable size.
 *
 * @param <E>
 */
public interface ListMD<E> extends Collection<E>{

    int size();

    int save(E entry);

    Integer[] save(Collection<E> collection);

    E remove(int index);

    E get(int index);
}

