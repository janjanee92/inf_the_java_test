package com.janjanee.infthejavatest;

import java.util.Arrays;

public class ShellSortTest {

    public static void shellSort(int[] arr) {

        // h 인덱스를 기준으로 비교 시작
        // h는 현재를 반으로 나눈 기준으로 잡았다.
        // 삽입 정렬 코드와 거의 같다. 차이점은 선택한 요소와 비교하는 요소가
        // 이웃하지 않고 h 만큼 떨어져 있다.
        for (int h = arr.length / 2; h > 0; h /= 2 ) {
            for (int i = h; i < arr.length; i++) {
                int idx = i - h;
                int tmp = arr[i];

                while( (idx >= 0) && (arr[idx] > tmp) ) {
                    arr[idx + h] = arr[idx];
                    idx -= h;
                }

                arr[idx + h] = tmp;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {3, 1, 2, 6, 7 , 5, 4};

        shellSort(arr);

        System.out.println(Arrays.toString(arr));
    }

}
