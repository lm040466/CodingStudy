package Programmers.No42840;

//나의 풀이
import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int x, y, z, count;
        x = y = z = count = 0;

        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == one[i%5]) x++;
            if(answers[i] == two[i%8]) y++;
            if(answers[i] == three[i%10]) z++;
        }

        int[] ans = {x, y, z};
        Arrays.sort(ans); //오름차순 정렬. 최대값

        ArrayList<Integer> temp = new ArrayList<>();

        if(x == ans[2]) temp.add(1);
        if(y == ans[2]) temp.add(2);
        if(z == ans[2]) temp.add(3);

        //배열 생성
        int[] answer = new int[temp.size()];
        for(int num : temp) {
            answer[count] = temp.get(count);
            count++;
        }
        return answer;
    }
}

// 다른 사람의 풀이
/*
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answer) {
        int[] a = { 1, 2, 3, 4, 5 };
        int[] b = { 2, 1, 2, 3, 2, 4, 2, 5 };
        int[] c = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
        int[] score = new int[3];
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == a[i % a.length]) {
                score[0]++;
            }
            if (answer[i] == b[i % b.length]) {
                score[1]++;
            }
            if (answer[i] == c[i % c.length]) {
                score[2]++;
            }
        }
        int maxScore = Math.max(score[0], Math.max(score[1], score[2])); // 최대값찾기
        ArrayList<Integer> list = new ArrayList<>();
        if (maxScore == score[0]) {
            list.add(1);
        }
        if (maxScore == score[1]) {
            list.add(2);
        }
        if (maxScore == score[2]) {
            list.add(3);
        }
        return list.stream().mapToInt(i -> i.intValue()).toArray(); // 리스트를 배열로 변경
    }
}
*/