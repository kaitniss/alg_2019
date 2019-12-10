package lesson_2.homework;

import java.util.Random;
//4. Написать методы, реализующие рассмотренные виды сортировок, и проверить скорость выполнения каждой.
//1 000 000 сортируется бесконечно долго, взяла массив поменьше
//
public class Hw_2_4 {
    public static void main(String[] args) {
        MyArrayList<Integer> arr3 = new MyArrayList<>(100000);

        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            arr3.add(random.nextInt(100));
            //System.out.println(arr3);
        }

        long startTime = System.currentTimeMillis();
        {
            arr3.bubbleSort();//26307ms
            //arr3.selectionSort();//26307ms
            //arr3.insertionSort();//2521ms, 3ms  после
        }
        long time = System.currentTimeMillis() - startTime;
        System.out.println("Sort Time " + time + "ms");
    }
}


