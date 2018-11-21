import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyArrayListTest<T> {


    @Test
    public void testAdd(){
        MyArrayList<T> testArrayList = new MyArrayList<T>();
        T t = (T) "1";
        testArrayList.add(t);
        testArrayList.add((T) "2");
        String expected = (String) testArrayList.get(1);
        String actual = "2";

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testRemove(){
        MyArrayList<T> testArrayList = new MyArrayList<T>();
        testArrayList.add((T) "1");
        testArrayList.add((T) "2");
        testArrayList.add((T) "3");
        testArrayList.remove(0);

        String actual = (String) testArrayList.get(1);
        String expected = "3";

        Assert.assertEquals(expected, actual);
    }

//    @Test
//    public void testSet(){
//        MyArrayList<T> testArrayList = new MyArrayList<T>();
//        testArrayList.add((T) "1");
//        testArrayList.add((T) "2");
//        testArrayList.add((T) "3");
//
//        String actual = (String) testArrayList.get(0);
//        String expected = "1";
//
//        Assert.assertEquals(expected, actual);
//    }

    @Test
    public void testConstructor(){
        MyArrayList<T> testArrayList = new MyArrayList(3);
       testArrayList.addWithIndex((T) "2", 2);

       String expected = "2";
       String actual = (String) testArrayList.get(2);

       Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAddWithIndex(){
        MyArrayList<T> testArrayList = new MyArrayList<T>();
        testArrayList.add((T) "1");
        testArrayList.add((T) "2");
        testArrayList.add((T) "3");
        testArrayList.addWithIndex((T) "4", 1);

        String actual = (String) testArrayList.get(1);
        String expected = "4";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSet(){
        MyArrayList<T> testArrayList = new MyArrayList<T>();
        testArrayList.add((T) "1");
        testArrayList.add((T) "2");
        testArrayList.add((T) "3");
        testArrayList.set(1, (T) "4");

        String actual = (String) testArrayList.get(1);
        String expected = "4";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testClear(){
        MyArrayList<T> testArrayList = new MyArrayList<T>();
        testArrayList.add((T) "1");
        testArrayList.add((T) "2");
        testArrayList.add((T) "3");
        testArrayList.clear();

        int actual = testArrayList.size();
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testContains(){
        MyArrayList<T> testArrayList = new MyArrayList<T>();
        testArrayList.add((T) "1");
        testArrayList.add((T) "2");
        testArrayList.add((T) "3");

        Assert.assertTrue(testArrayList.contains((T) "3"));
        Assert.assertFalse(testArrayList.contains((T) "4"));
    }

    @Test
    public void isEmptyTest(){
        MyArrayList<T> testArrayList = new MyArrayList<T>();
        Assert.assertTrue(testArrayList.isEmpty());

        testArrayList.add((T)"3");
        Assert.assertFalse(testArrayList.isEmpty());
    }






}
