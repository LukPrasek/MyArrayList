package arrayListSimple;

import static org.junit.Assert.assertEquals;


public class SimpleListMDTest {
  
  @org.junit.Test
  public void size() {
    // given
    SimpleListMD<Object> listMD = new SimpleListMD<>();
    Object object = 5;
    Object object1 = 3;
    
    // when
    listMD.save(object);
    listMD.save(object1);
    
    // then
    assertEquals(2, listMD.size());
    
  }
}