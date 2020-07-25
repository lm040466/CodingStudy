package Programmers.No42588;

import java.util.*;

class Solution {
    public int[] solution(int[] heights) {
        int[] answer = new int[heights.length];
        for(int i = heights.length - 1; i >= 0; i --) {
            Stack<Integer> stack = new Stack<>();
            for(int j = 0; j < i; j++) stack.push(heights[j]);
            while(!stack.empty()) {
                int x = stack.pop();
                if(x > heights[i]) {
                    answer[i] = stack.size() + 1;
                    break;
                }
            }
        }
        return answer;
    }
}

// 스택을 사용하지 않은 다른사람의 풀이
/*
import java.util.*;

class Solution {
    public int[] solution(int[] heights) {
        int[] answer = new int[heights.length];

        for (int i = 0; i < heights.length; i++) {
            for (int j = i + 1; j < heights.length; j++) {
                if (heights[i] > heights[j]) {
                    answer[j] = i + 1;
                }
            }
        }
        return answer;
    }
}
*/