package les6.task1;

import java.util.Objects;

public class MyArrayList<E> {
    private final int INIT_SIZE = 16;
    private final int CUT_RATE = 4;
    private Object[] array = new Object[INIT_SIZE];
    private int pointer = 0;

    public int size() {
        return pointer;
    }

    public void add(E item) {
        if(pointer == array.length-1)
            resize(array.length*2);
        array[pointer++] = item;
    }

    public void remove(int index) {
        if (index >= pointer) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + pointer);
        }
        for (int i = index; i<pointer; i++)
            array[i] = array[i+1];
        array[pointer] = null;
        pointer--;
        if (array.length > INIT_SIZE && pointer < array.length / CUT_RATE)
            resize(array.length/2);
    }

    public void remove(E item) {
        int i = 0;
        found: {
            if (item == null) {
                for (; i < pointer; i++) {
                    if (array[i] == null) {
                        this.remove(i);
                        break found;
                    }
                }
            } else {
                for (; i < pointer; i++) {
                    if (item.equals(array[i])) {
                        this.remove(i);
                        break found;
                    }
                }
            }
        }
    }

    public E get(int index) {
        if (index >= pointer) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + pointer);
        }
        return (E) array[index];
    }

    public void clear() {
        for (int i = 0; i < pointer; i++) {
            array[i] = null;
        }
        pointer = 0;
    }


    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }
}
