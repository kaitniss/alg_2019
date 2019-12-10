package lesson_2;

import java.util.Arrays;

public class MyArrayList<Item extends Comparable> {
    private Item[] list; //приватное поле для хранения данных того типа который передадим
    private int size = 0; //приватная целая величина, скрлько эл-ов в массиве
    private final int DEFAULT_CAPACITY = 10; //задаем дефолт капасити

    public MyArrayList(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity <=0" + capacity);
        }
        list = (Item[]) new Comparable[capacity]; //инициализируем лист, создать массив объектво (любые) и кастануть его в айтем
    }

    public MyArrayList() {
        list = (Item[]) new Comparable[DEFAULT_CAPACITY];
    } //дефолт

    // методы
    //добавление в конец списка
    public void add(Item item) {
        //if ... recapacity
        list[size] = item;
        size++; //увеличиваем размер
    }

    public void add(int index, Item item) {
        //if ... recapacity
        //закрыть возможность указывать индексы недопустимого интервала
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("index " + index);
        }
        //сдвиг справа налево
        for (int i = size; i > index; i--) {
            list[i] = list[i - 1];
        }
        list[index] = item;
        size++;
    }

    public boolean remove(Item item) {
        //найти элемент
        int i = 0;
        while (i < size && !list[i].equals(item)) {
            i++;
        }
        //не нашли ретерн фалс
        if (i == size) {
            return false;
        }
        remove(i);
        return true;
    }

    public final boolean remove(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("index " + index);
        }
        for (int i = index; i < size - 1; i++) {
            list[i] = list[i + 1];
        }
        size--;
        list[size] = null; //никуда не указывай, указываай на нул
        return true;
    }

    //возвращает по индексу
    public Item get(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("index " + index);
        }
        return list[index];
    }

    public void set(int index, Item item) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("index " + index);
        }
        list[index] = item;
    }

    public int size() {
        return size;
    }

    //расширение массива, нью капасити никогда не удет меньше сайза
    private void recapacity(int newCapacity) {
        Item[] temp = (Item[]) new Object[newCapacity]; //создаем временный массив
        System.arraycopy(list, 0, temp, 0, size);
        list = temp; //перекинуть листу новую ссылку с темп
    }
    //линейный поиск по индексу, find
    public int indexOf(Item item) {
        for (int i = 0; i < size; i++) {
            if (list[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    private boolean less(int index1, int index2) {
        return list[index1].compareTo(list[index2]) < 0;
    }

    private void swap(int index1, int index2) {
        Item temp = list[index1];
        list[index1] = list[index2];
        list[index2] = temp;
    }

    public void selectionSort() {
        int iMin;
        for (int i = 0; i < size - 1; i++) {
            iMin = i;
            for (int j = i + 1; j < size; j++) {
                if (less(j, iMin)) {
                    iMin = j;
                }
            }
            swap(i, iMin);
        }
    }
    //сортировка выбором, неустойчивая
    public void insertionSort() {
        Item key;
        for (int i = 1; i < size; i++) {
            int j = i;
            key = list[i];
            while (j > 0 && key.compareTo(list[j-1]) < 0){
                list[j]= list[j-1];
                j--;
            }
            list[j] = key;
        }
    }

    public void bubbleSort(){
        boolean isSwap;
        for (int i = size - 1; i > 0; i--) {
            isSwap = false;
            for (int j = 0; j <i ; j++) {
                if(less(j+1, j)){
                    swap(j+1, j);
                    isSwap = true;
                }
            }
            if(!isSwap){
                break;
            }
        }
    }




    //переопределяем toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(list[i] + " "); //добавить в сб лист от и + проьел
        }
//        sb.append("\n");
        return sb.toString();
    }
}
