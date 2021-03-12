package com.janjanee.infthejavatest;

import java.util.Arrays;

public class HIndex {

    public static int solution(int[] citations) {

        Arrays.sort(citations);

        int len = citations.length;
        int h = 0;

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
