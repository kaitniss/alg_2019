package lesson_2;

import java.util.Arrays;

public class Program {
    public static void main(String[] args){
        int [] arr1 = new int[10]; //примитивный массив, new  = создать объект
        String [] str1 = new String[10];//объектный массив ссылочного типа

        //заполним массив элементами
        for (int i = 0; i <arr1.length ; i++) {
            arr1[i] = i;
        }
        System.out.println(Arrays.toString(arr1));

        //все нечетные элементы удвоить
        //пройдись по весму массиву, есоии аррИ = нечетное (остаток от деления на 2 != 0) , то умножаем на 2
        for (int i = 0; i <arr1.length ; i++) {
            if(arr1[i] % 2 != 0){
                arr1[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr1)); //для класса арайс есть метод тустринг
    }
}
