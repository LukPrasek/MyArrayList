package arrayListSimple;

/**
 * This is interface for collection  with automatically extendable size.
 * @param <E>
 */
public interface ListMD<E> {
 
  int size();
  
  int save (E entry);
  
  E remove (int index);
  
}
