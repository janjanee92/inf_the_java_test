package com.janjanee.infthejavatest;

import java.util.Arrays;

public class SelectionSortTest {

    // 자리이동
    static void swap(int[] arr, int idx1, int idx2) {
        int tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp;
    }

    // 선택정렬
    static void selectionSort(int[] arr) {

        // 마지막 자리는 자동 정렬 되므로 arr.length - 1
        for (int i = 0; i < arr.length - 1; i++) {

            // 현재 정렬할 인덱스를 최솟값으로 잡고 시작
            int min = i;

            // 정렬 대상 인덱스 다음 순서부터 배열 끝까지 비교하며 최솟값을 찾는다.
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            // 정렬 대상 인덱스 자리에 이미 최솟값이 있다면 넘어간다.
            if (i != min) {
                swap(arr, i, min);
            }

        }

    }

    public static void main(String[] args) {

        int[] arr = {3, 1, 2, 6, 7 , 5, 4};

        // 선택정렬
        selectionSort(arr);

        // 결과 출력
        System.out.println(Arrays.toString(arr));

    }
}