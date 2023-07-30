package org.example;

import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[7];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(20);
        }

        print(array);
        array = sort(array);
        print(array);
    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }
    public static int[] swap(int[] array, int i, int j) {
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }

    public static int[] sort(int[] array) {
        int left;
        int right;
        int maxItem;
        int temp;
        int[] arrayTemp;
        for (int j = 0; j < array.length; j++) {
            for (int i = (array.length - j) / 2 - 1; i >= 0; i--) {
                left = i * 2 + 1;
                right = i * 2 + 2;

                if (array.length - j <= right) {
                    if (array.length - j > left) {
                        if (array[left] > array[i]) {
                            array = swap(array, left, i);
                        }
                    }
                } else {
                    if (array[left] > array[right]) {
                        if (array[left] > array[i]) {
                            array = swap(array, left, i);
                        }
                    } else if (array[right] > array[i]) {
                        array = swap(array, right, i);
                    }
                }
                print(array);
            }
            array = swap(array, 0, array.length - j - 1);
            print(array);
        }
        return array;
    }

}