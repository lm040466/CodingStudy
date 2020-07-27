package Programmers.No42746;

import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] str = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++)
            str[i] = String.valueOf(numbers[i]);

        Arrays.sort(str, (a, b) -> ((b + a).compareTo(a + b))); // 배열 정렬. 뒤랑 붙여보자

        if (str[0].equals("0"))
            return "0"; // 0만 입력되는 경우. 예외처리
        for (String s : str)
            answer += s; // 문자열(String) 합치기

        return answer;
    }
}