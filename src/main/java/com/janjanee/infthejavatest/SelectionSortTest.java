package com.janjanee.infthejavatest;

import java.util.Arrays;

public class SelectionSortTest {

    static void swap(int[] arr, int idx1, int idx2) {
        int tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp;
    }

    static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            int min = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            if (i != min) {
                swap(arr, i, min);
            }

        }

    }

    public static void main(String[] args) {
        int[] arr = {5, 12, 11, 40, 8 , 13, 20};

        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}