import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

public class MySet <T>{

    MyArrayList<T> mySet = new MyArrayList<>();



    public boolean add(T t){
        if(!mySet.contains(t)){
            mySet.add(t);
            return true;
        }
        return false;
    }

    public int size(){
        return mySet.size();
    }

    public boolean addAll(Collection<T> t){
        boolean returnBool = true;
        for(Object o: t){
            returnBool = this.add((T) o) && returnBool;
        }
        return returnBool;
    }


    public void clear(){
        mySet.clear();
    }

    public boolean contains(T t){
       return mySet.contains(t);
    }

    public boolean containsAll(Collection<T> collection){
        if(collection.size() == 0){
            return false;
        }
        if(mySet.size()<collection.size()){
            return false;
        }
        for(Object o: collection){
           if(!mySet.contains((T) o)){
               return false;
           }

        } return true;
    }


    public boolean isEmpty() {
        return mySet.isEmpty();
    }


    public Object[] toArray() {
        Object[] array = new Object[mySet.size()];
        for(int i = 0; i<mySet.size(); i++){
            array[i] = mySet.get(i);
        }
        return array;
    }
}
