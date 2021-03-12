package com.janjanee.infthejavatest;

import java.util.Arrays;

public class HIndex {

    public static int solution(int[] citations) {

        // 정렬
        Arrays.sort(citations);

        int len = citations.length;
        int h = 0;

        // 현재 검사 대상 숫자를 포함하여 뒤로 오는 숫자 개수가
        // 현재 숫자값과 일치하거나 작다면 그 개수가 h값.
        for (int i = 0; i < len; i++) {

            int num = citations[i];
            h = num == 0 ? h : len - i;
            if (len - i <= num) break;

        }

        return h;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{0, 1, 4, 5, 6}));
    }
}
