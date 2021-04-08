package com.janjanee.infthejavatest;

import java.util.Comparator;
import java.util.PriorityQueue;

public class DualPriorityQueue {

    public PriorityQueue<Integer> max = new PriorityQueue<>(Comparator.reverseOrder());
    public PriorityQueue<Integer> min = new PriorityQueue<>();

    public int[] solution(String[] operations) {
        int[] answer = new int[]{0, 0};

        for (String operation : operations) {
            String[] split = operation.split("\\s");
            if ("I".equals(split[0])) {
                add(split[1]);
            } else {
                remove(split[1]);
            }
        }

        int size = max.size();

        if (size >= 2) {
            answer[0] = max.poll();
            answer[1] = min.poll();
        }

        return answer;
    }

    private void add(String s) {
        max.add(Integer.parseInt(s));
        min.add(Integer.parseInt(s));
    }

    private void remove(String s) {
        Integer data;

        if ("1".equals(s)) {
            data = max.poll();
            min.remove(data);
        } else {
            data = min.poll();
            max.remove(data);
        }

    }

}
