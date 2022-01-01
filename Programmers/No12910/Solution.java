package Programmers.No12910;
import java.util.PriorityQueue;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : arr) {
            if(i % divisor == 0) pq.offer(i);
        }

        if(pq.isEmpty()) return new int[] {-1};
        int[] answer = new int[pq.size()];
        for(int i = 0; i < answer.length; i++) answer[i] = pq.poll();
        return answer;
    }
}