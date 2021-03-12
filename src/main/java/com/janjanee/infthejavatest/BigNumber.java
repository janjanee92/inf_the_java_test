package com.janjanee.infthejavatest;

import java.util.Arrays;

public class BigNumber {

    public static String solution(int[] numbers) {
        String answer;

        // String[] 으로 변환
        String[] strArray = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);

        // 비교 숫자 두 개를 String 더하기 연산을 하여 역순 비교.
        Arrays.sort(strArray, (o1, o2) -> Integer.parseInt(o2 + o1) - Integer.parseInt(o1 + o2));

        // 문자열 생성
        answer = String.join("", strArray);

        // 문자열 맨 앞 자리가 0일 경우 (ex - 00000) "0"을 리턴
        if (answer.charAt(0) == '0') {
            return "0";
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 30, 34, 5, 9}));
    }
}
