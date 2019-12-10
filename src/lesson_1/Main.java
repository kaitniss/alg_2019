package lesson_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println(Arrays.toString(arr));

        String[] arrS = new String[7];
        arrS[3] = "rrr";
        System.out.println(Arrays.toString(arrS));

        int[] arr1 = {4, 6, 8};
        arr = arr1;

    }
}