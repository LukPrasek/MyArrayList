package arrayListSimple;

import java.util.ArrayList;
import java.util.List;

public class Main {//TODO remove after debug
  
  public static void main(String[] args) {
    
    SimpleListMD<ArrayList> list = new SimpleListMD<>();
    
    ArrayList list1 = new ArrayList();
    ArrayList list2 = new ArrayList();
    ArrayList list3 = new ArrayList();
    ArrayList list4 = new ArrayList();
  
    System.out.println(list.size());
    list.save(list1);
    System.out.println(list.size());
    list.save(list2);
    System.out.println(list.size());
    list.save(list3);
    System.out.println(list.size());
    list.save(list4);
    System.out.println(list.size());
    
    
    
  }
}
