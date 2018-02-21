package arrayListSimple;

import java.util.Arrays;

public class SimpleListMD<E> implements ListMD {
  
  private Object[] listBody;
  private Object[] tmpArray;
  
  public SimpleListMD() {
    createIfEmpty(2);
  }
  
  public int size() {
    int size = 0;
    for (Object object : listBody) {
      if (object != null) {
        size++;
      }
    }
    return size;
  }
  
  public int save(Object entry) {
    createIfEmpty(2);
    int result = saveInFirstEmptyCell(entry);
    if (result == -1) {
      doubleArraysSize();
    } else {
      return result;
    }
    return saveInFirstEmptyCell(entry);
  }
  
  private void doubleArraysSize() {
    int currentSize = listBody.length;
    tmpArray = new Object[(currentSize * 2)];
    rewriteArrayToTmpArray();
    listBody = tmpArray;
    tmpArray = new Object[0];
  }
  
  private void rewriteArrayToTmpArray() {
    for (int i = 0; i < listBody.length; i++) {
      tmpArray[i] = listBody[i];
    }
  }
  
  private int saveInFirstEmptyCell(Object entry) {
    for (int i = 0; i < listBody.length; i++) {
      if (listBody[i] == null) {
        listBody[i] = entry;
        return i;
      }
    }
    return -1;
  }
  
  
  private void createIfEmpty(int size) {
    if (listBody == null) {
      listBody = new Object[size];
    }
  }
  
  public Object remove(int index) {
    return null;
  }
  
  @Override
  public String toString() {
    return Arrays.toString(listBody);
  }
}
