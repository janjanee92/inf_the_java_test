package com.janjanee.infthejavatest;

import java.util.Arrays;

public class MergeSortTest {

    static int[] buff;

    private static void divideConquer(int[] arr, int left, int right) {

        // 크키가 1보다 큰 경우만 분할
        if (left < right) {

            int center = (left + right) / 2;              //  중간을 기점으로 균등 분할 (분할)

            divideConquer(arr, left, center);            //  배열의 앞부분을 재귀적으로 합병정렬 (정복)
            divideConquer(arr, center + 1, right);  //  배열의 뒷부분을 재귀적으로 합병정렬 (정복)
            merge(arr, left, center, right);    //  실제 합병 수행

        }
    }

    private static void merge(int[] arr, int left, int center, int right) {

        // i는 arr[left] ~ arr[right] 배열의 인덱스
        int i;
        // p는 buff에 복사한 요소의 개수
        // j는 buff의 값과 arr의 값 비교 시 buff에서 사용하는 인덱스
        int p = 0, j = 0;
        // 새로 합병될 arr의 인덱스
        int k = left;

        // 배열의 앞부분 (a[left] ~ a[center])을 buff[0] ~ buff[center - left]에 복사.
        for (i = left; i <= center; i++)
            buff[p++] = arr[i];

        // 배열의 뒷부분 (a[center + 1] ~ a[right])과 buff로 복사한 배열의 앞부분 p개를 병합하여 배열 arr에 저장
        while (i <= right && j < p)
            arr[k++] = (buff[j] <= arr[i]) ? buff[j++] : arr[i++];

        // 배열 buff에 남아 있는 요소를 배열 arr에 복사
        while (j < p)
            arr[k++] = buff[j++];

    }

    public static void mergeSort(int[] arr) {

        // 배열 크기만큼 임시 배열 생성
        buff = new int[arr.length];

        // 분할 정복을 이용한 배열 전체 합병정렬
        divideConquer(arr, 0, arr.length - 1);

    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 6, 7 , 5, 4};

        // 합병정렬
        mergeSort(arr);

        // 결과 출력
        System.out.println(Arrays.toString(arr));

    }

}
