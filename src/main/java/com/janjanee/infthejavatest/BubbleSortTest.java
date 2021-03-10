package com.janjanee.infthejavatest;

import java.util.Arrays;

public class BubbleSortTest {

    // 자리이동
    static void swap(int[] arr, int idx1, int idx2) {
        int tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp;
    }

    static void bubbleSort(int[] arr) {
        // 수행하는 패스의 횟수는 (배열길이 - 1)회. 마지막 요소는 이미 끝에 놓이기 때문이다.
        for(int i = 0; i < arr.length - 1; i++) {
            // 끝에서 부터 비교하므로 j를 배열의 마지막으로 지정
            // arr[j-1]과 arr[j]를 비교한다.
            for(int j= arr.length - 1 ; j > i; j--) {
                if(arr[j - 1] > arr[j]) {
                    // 자리이동
                    swap(arr, j -1, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 6, 7 , 5, 4};

        // 버블정렬
        bubbleSort(arr);

        // 결과 출력
        System.out.println(Arrays.toString(arr));

    }
}
