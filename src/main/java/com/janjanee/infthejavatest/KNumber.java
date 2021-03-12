package com.janjanee.infthejavatest;

import java.util.Arrays;

public class KNumber {

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int i = 0;

        for (int[] command : commands) {

            // 지정된 길이만큼 잘라서 tmp 배열 복사
            int[] tmp = Arrays.copyOfRange(array, command[0] - 1, command[1]);

            // 정렬
            Arrays.sort(tmp);

            // k값 찾기
            answer[i++] = tmp[command[2] - 1];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] solution = solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}, {3, 6, 2}});
        System.out.println(Arrays.toString(solution));
    }
}
