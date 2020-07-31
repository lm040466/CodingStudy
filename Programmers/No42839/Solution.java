package Programmers.No42839;

import java.util.*;

class Solution {
    static ArrayList<Integer> perm_nums; // 순열을 통해 나올 수 있는 수
    static String str_num;
    static int answer;

    public int solution(String numbers) {
        answer = 0;
        perm_nums = new ArrayList<>();
        str_num = numbers;

        // 한자리부터 numbers.length()자리까지 순열
        for (int i = 1; i <= numbers.length(); i++) {
            boolean[] check = new boolean[numbers.length()];
            String temp_ans = "";
            permutation(numbers.length(), i, temp_ans, check);
        }

        // 소수 확인
        for (int i : perm_nums) {
            if (i != 0 && i != 1)
                check(i);
        }

        return answer;
    }

    // 순열 함수
    static void permutation(int n, int r, String temp_ans, boolean[] check) {
        if (temp_ans.length() == r) {
            int temp = Integer.parseInt(temp_ans); // 정수 변환
            if (!perm_nums.contains(temp))
                perm_nums.add(temp);
            return; // void함수 종료
        } else {
            for (int i = 0; i < n; i++) {
                if (!check[i]) {
                    temp_ans += Character.toString(str_num.charAt(i));
                    check[i] = true;
                    permutation(n, r, temp_ans, check); // 재귀호출. i번째 수는 사용불가
                    check[i] = false; // 다시 돌리기.뒤에 다시 붙을 수도 있기 때문에
                    temp_ans = temp_ans.substring(0, temp_ans.length() - 1); // 마지막 글자 지우기
                }
            }
        }
    }

    static void check(int x) {
        boolean chk = true;
        for (int i = 2; i < x; i++) {
            if (x % i == 0)
                chk = false;
        }
        if (chk)
            answer++;
    }
}