package lesson_3;

import java.util.Arrays;
import java.util.EmptyStackException;

public class MyQueue<Item> {
    private Item[] list;
    private int size;
    private int DEFAULT_CAPACITY = 10;
    private int begin = 0;
    private int end = 0;

    //0 1 2 3 4
    //        b
    //    e
    //1 3     7

    public MyQueue(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("bad capacity " + capacity);
        }
        list = (Item[]) new Object[capacity];
    }

    public MyQueue() {
        list = (Item[]) new Object[DEFAULT_CAPACITY];
    }

    public void insert(Item item) {
        if (isFull()) {
            throw new StackOverflowError();
        }
        list[end] = item;
        size++;
        end = nextIndex(end);
    }

    public Item remove(){
        Item value = peek();
        size--;
        list[begin] = null;
        begin = nextIndex(begin);
        return value;
    }


    public Item peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list[begin];
    }

    private int nextIndex(int index) {
        return (index + 1) % list.length;
    }

    public boolean isFull() {
        return size == list.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyQueue{" +
                "begin=" + begin +
                ", end=" + end +
                '}' + Arrays.toString(list);
    }
}
