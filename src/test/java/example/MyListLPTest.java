package example;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;


import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class MyListLPTest {


    @Test
    public void shouldSaveObjectInFirstUnoccupiedCell() {
        //given
        MyListLP myListLP = new MyListLP();

        //when
        int actual = myListLP.save(new Integer(123124));
        int actual2 = myListLP.save(new Integer(123124));

        //then
        Assert.assertEquals(0, actual);
        Assert.assertEquals(1, actual2);
    }

    @Test
    public void shouldReturnObjectFromGivenIndex() {
        //given
        MyListLP myListLP = new MyListLP();

        myListLP.save(new Integer(12));
        myListLP.save(new Integer(122));

        //when
        Object actual = myListLP.get(0);
        Object actual2 = myListLP.get(1);

        //then
        assertEquals(12, actual);
        assertEquals(122, actual2);
    }


    @Test
    public void shouldRemoveGivenObject() {
        //given
        MyListLP myListLP = new MyListLP();
        myListLP.save(new Integer(12));
        myListLP.save(new Integer(122));

        //when
        Object actual1 = myListLP.remove(0);
        Object actual2 = myListLP.remove(1);

        //then
        assertEquals(12, actual1);
        assertEquals(122, actual2);
        assertNull(myListLP.remove(0));
        assertNull(myListLP.remove(1));
    }

    @Test
    public void shouldReturnTableSize() {
        //given
        MyListLP myListLP = new MyListLP();
        myListLP.save(new Integer(15));
        myListLP.save(new Integer(155));

        //when
        int size = myListLP.size();

        //then
        assertEquals(2, size);
    }

    @Test
    @Parameters({"11","22"})
    public void shouldResizeArray(int number) {
        //given
        MyListLP myListLP = new MyListLP();

        //when
        addRandomObjectToList(number, myListLP);

        //then
        assertEquals(number, myListLP.size());
        assertNotNull(myListLP.get(10));

    }

    private ListMD addRandomObjectToList(int number, ListMD listToFill) {
        for (int i = 1; i <= number; i++) {
            listToFill.save(new Integer(i * 13));

        }

        return listToFill;
    }

    @Test
    public void save() {
        //given


        //when

        //then

    }
}