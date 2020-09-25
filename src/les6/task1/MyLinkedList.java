package les6.task1;

import java.util.LinkedList;

public class MyLinkedList<E> {
    private MyLinkedListElement<E> head, tail;
    private int pointer = 0;

    public int size() {
        return pointer;
    }

    public void add(E item) {
        MyLinkedListElement<E> element = new MyLinkedListElement<>();
        element.data = item;
        if (head == null) {
            head = element;
        }
        else {
            if (tail == null) {
                tail = element;
                tail.data = item;
                head.next = tail;
                tail.previous = head;
            } else {
                tail.next = element;
                element.previous = tail;
                tail = element;
            }
        }
        pointer++;
    }

    public void remove(int index) {
        if (index >= pointer) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + pointer);
        }
        if (index == 0) {
            head = head.next;
            head.previous = null;
        }
        else {
            if (index == pointer - 1) {
                tail = tail.previous;
                tail.next = null;
            } else {
                MyLinkedListElement<E> element = head;
                for (int i = 0; i < index; i++) {
                    element = element.next;
                }
                    element.previous.next = element.next;
                    element.next.previous = element.previous;
            }
        }
        pointer--;
    }

    public void remove(E item) {
        MyLinkedListElement<E> element = head;
        int i = 0;
        found: {
            if (item == null) {
                for (; i < pointer; i++) {
                    if (element.data == null) {
                        this.remove(i);
                        break found;
                    }
                    else {
                        element = element.next;
                    }
                }
            } else {
                for (; i < pointer; i++) {
                    if (item.equals(element.data)) {
                        this.remove(i);
                        break found;
                    }
                    else {
                        element = element.next;
                    }
                }
            }
        }
    }

    public E get(int index) {
        if (index >= pointer) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + pointer);
        }
        MyLinkedListElement<E> element = head;
        for (int i = 0; i < index; i++) {
            element = element.next;
        }
        return element.data;
    }

    public void clear() {
        for (; pointer > 0; pointer--) {
            this.remove(pointer - 1);
        }
    }
}
