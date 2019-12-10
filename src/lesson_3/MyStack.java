package lesson_3;

import java.util.EmptyStackException;

public class MyStack<Item> {
    private Item[] list;
    private int size;//кол-во эл-тов в стеке
    private int DEFAULT_CAPACITY = 10;

    public MyStack(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("bad capacity " + capacity);
        }
        list = (Item[]) new Object[capacity];
    }

    public MyStack() {
        list = (Item[]) new Object[DEFAULT_CAPACITY];
    }

    public void push(Item item){
        if(isFull()){
            throw new StackOverflowError();
        }
        list[size] = item;
        size++;
    }

    public Item pop(){
        Item temp = peek();
        size--;
        list[size] = null;
        return temp;
    }


    public Item peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return list[size-1];
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
}
