package Baekjoon.No9012;

import java.util.*;

public class Solution {
    static String[] word;
    static Stack<String> stack; // '(' 저장 스택
    static boolean check; // VPS확인

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // 테스트 데이터 개수만큼 반복
        for (int i = 0; i < num; i++) {
            word = sc.next().split(""); // 한글자씩 자르기
            stack = new Stack<>();
            check = true;

            for (int j = 0; j < word.length; j++) {
                // 괄호 종류에 따라 실행
                switch (word[j]) {
                    case "(":
                        stack.push("(");
                        break;

                    case ")":
                        // 스택이 비어있다면 개수가 맞지않는 것
                        if (stack.empty()) {
                            check = false;
                        } else {
                            stack.pop(); // '(' 하나 빼기
                        }
                        break;

                    default:
                        break;
                }
            }

            // '('와 ')'의 개수가 같은지 확인
            if (check == true && stack.empty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}