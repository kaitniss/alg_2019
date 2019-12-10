package lesson_2;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> mal = new MyArrayList<>(20);
//        mal.add(5);
//        mal.add(6);
//        mal.add(7);
//
//        mal.add(2,99);
//
//        System.out.println(mal);

//        mal.remove(new Integer(6));
//        System.out.println(mal);
//  //      ArrayList al = new ArrayList();
//   //     al.ensureCapacity(100);
//    //    al.trimToSize();

//        System.out.println(mal.indexOf(5));

//        MySortedArrayList<Integer> msal = new MySortedArrayList<>();
//        msal.add(5);
//        msal.add(1);
//        msal.add(9);
//        msal.add(2);
//        msal.add(3);
//
//        System.out.println(msal);
//
//        System.out.println(msal.binaryFind(2));

        Random random= new Random();
        for (int i = 0; i < 10; i++) {
            mal.add(random.nextInt(100));
        }

        System.out.println(mal);

//        mal.selectionSort();
//        mal.insertionSort();
        mal.bubbleSort();
        System.out.println(mal);


    }
}
