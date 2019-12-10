package lesson_2.homework;

import java.util.Random;

//Добавить методы ensureCapacity() , trimToSize() ,
//так же в методе add() реализовать увеличение внутреннего массива при приближении к заполнению.

public class Hw_2_1 {
    public static void main(String[] args) {
        MyArrayList<Integer> arr1 = new MyArrayList<>(10);

        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            arr1.add(random.nextInt(100));
            System.out.println(arr1);
        }
        arr1.ensureCapacity(30);
        arr1.trimToSize();
        System.out.println(arr1.size() + " size");
    }

}
