//THIS CLASS IS FINISHED

public class ResizeableArray {
    private Object[] array;
    private int count;

    public ResizeableArray() {
        array = new Object[10];

        count = 0;
    }

    public void add(Object elem) {
        if (elem == null) throw new IllegalArgumentException("parameter must be non-null");

        //if the array is full, we need to resize first
        if (count == array.length) {
            //create a bigger array
            Object[] temp = new Object[2*array.length];

            //copy my old elements into the bigger array
            for (int i = 0; i < count; i++) {
                temp[i] = array[i];
            }

            //array -> {"a", "b", ...}
            //temp -> {"a", "b", ..., null, null, null ...}
            array = temp;
        }

        array[count] = elem;
        count++;
    }

    //get
    //version of collection[pos]
    public Object get(int pos) {
        return array[pos];
    }

    //size
    public int size() {
        return count;
    }
}