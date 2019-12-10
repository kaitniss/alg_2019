package lesson_2.homework;

import java.util.Random;

//2. Создать массив большого размера (миллион элементов).
//3. Заполнить массив случайными числами.
//
public class Hw_2_23 {
    public static void main(String[] args) {
        MyArrayList<Integer> arr2 = new MyArrayList<>(1000000);

        Random random = new Random();
        for (int i = 0; i < 1000000; i++) {
            arr2.add(random.nextInt(100));
            //System.out.println(arr2);
        }
        System.out.println(arr2);
        System.out.println(arr2.size());
    }

}
