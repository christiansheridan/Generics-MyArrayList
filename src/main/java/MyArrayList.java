public class MyArrayList <T>{

    private T[] asArray;

    public T[] getAsArray() {
        return asArray;
    }

    public void setAsArray(T[] asArray) {
        this.asArray = asArray;
    }

    public MyArrayList(){
        asArray = (T[]) new Object[0];
    }

    public MyArrayList(int length){
        asArray = (T[]) new Object[length];
    }

    public void add(T t){

        T[] temp = (T[]) new Object[asArray.length+1];

        for (int i = 0; i <asArray.length; i++){
            temp[i] = asArray[i];
        }

        temp[asArray.length] = t;
        asArray = temp;
    }

    public void addWithIndex(T t, int index){
        T[] temp = (T[]) new Object[asArray.length+1];
        for (int i = 0; i <index; i++){
            temp[i] = asArray[i];
        }
        temp[index] = t;
        for (int j = index+1; j<asArray.length+1; j++){
            temp[j] = asArray[j-1];
        }
        asArray = temp;
    }

    public void remove(int index)
    {
        if (index < 0 || index >= asArray.length) return;
        T[] temp = (T[]) new Object[asArray.length - 1];

        boolean found = false;
        for (int i = 0; i < asArray.length; i++)
        {
            if (i == index)
            {
                found = true;
                continue;
            }
            temp[i - (found ? 1 : 0)] = asArray[i];
        }
        asArray = temp;
    }

    public T get(int index)
    {
        return asArray[index];
    }

    public void set(int index, T input){
        this.addWithIndex(input, index);
        this.remove(index+1);
    }

    public void clear(){
        while(asArray.length>0){
            this.remove(0);
        }
    }

    public int size(){
        return asArray.length;
    }

    public boolean contains(T input){
        for(int i=0; i <asArray.length; i++){
            if(asArray[i].equals(input)){
                return true;
            }
        } return false;
    }

    public boolean isEmpty(){
        if (asArray.length == 0){
            return true;
        } else return false;
    }

}

