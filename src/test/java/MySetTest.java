import org.junit.Assert;
import org.junit.Test;
import java.util.Collection;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MySetTest<T> {

    @Test
    public void addTest(){
        MySet<T> testSet = new MySet<>();
        testSet.add((T) "2");

        int actual = testSet.size();
        int expected = 1;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsTest(){
        MySet<T> testSet = new MySet<>();
        testSet.add((T) "2");

        Assert.assertTrue(testSet.contains((T) "2"));
    }

    @Test
    public void containsAllTest(){
        MySet<T> testSet = new MySet<>();
        testSet.add((T) "2");
        testSet.add((T) "3");
        testSet.add((T) "4");

        Set<T> testSet2 = new HashSet<>();
        testSet2.add((T) "2");
        testSet2.add((T) "3");

        Assert.assertTrue(testSet.containsAll(testSet2));

    }

    @Test
    public void containsAllFalse(){
        MySet<T> testSet = new MySet<>();
        testSet.add((T) "2");
        testSet.add((T) "3");

        Set<T> testSet2 = new HashSet<>();
        testSet2.add((T) "2");
        testSet2.add((T) "4");

        Assert.assertFalse(testSet.containsAll(testSet2));
    }

    @Test
    public void addAllTestTrue(){
        MySet<T> testSet = new MySet<>();
        testSet.add((T) "2");

        Set<T> testSet2 = new HashSet<>();
        testSet2.add((T)"3");
        testSet2.add((T)"4");

        Assert.assertTrue(testSet.addAll(testSet2));
        Assert.assertTrue(testSet.containsAll(testSet2));
    }

    @Test
    public void addAllTestFalse(){
        MySet<T> testSet = new MySet<>();
        testSet.add((T) "2");
        testSet.add((T) "3");

        Set<T> testSet2 = new HashSet<>();
        testSet2.add((T)"3");
        testSet2.add((T)"4");

        Assert.assertFalse(testSet.addAll(testSet2));
        Assert.assertTrue(testSet.contains((T) "4"));
    }

    @Test
    public void clearTest(){
        MySet<T> testSet = new MySet<>();
        testSet.add((T) "2");
        testSet.add((T) "3");

        testSet.clear();
        Assert.assertFalse(testSet.contains((T) "3"));
    }


    @Test
    public void isEmptyTest(){
        MySet<T> testSet = new MySet<>();

        Assert.assertTrue(testSet.isEmpty());

        testSet.add((T) "1");
        Assert.assertFalse(testSet.isEmpty());
    }


    @Test
    public void toArrayTest(){
        MySet<T> testSet = new MySet<>();
        testSet.add((T) "2");
        testSet.add((T) "3");

        Object[] testArray = {(T) "2", (T) "3"};

        Object [] testSetArray = testSet.toArray();

        Assert.assertEquals(testArray, testSetArray);
    }

}
