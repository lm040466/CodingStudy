package Programmers.No12982;

import java.util.Arrays;

class Solution {
    static int answer, tar;
    static int[] nums;

    public int solution(int[] numbers, int target) {
        Arrays.sort(d);
        int answer = 0;
        for(int i : d) {
            if(i > budget) break;
            answer++;
            budget -= i;
        }
        return answer;
    }
}