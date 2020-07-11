package Baekjoon.No10828;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>(); // 스택 선언. 타입에 따라 지정하여 선언.
        int num = sc.nextInt(); // 명령개수

        // 명령개수만큼 반복
        for (int i = 0; i < num; i++) {
            String order = sc.next();

            // 다섯가지 명령에 대해 분리
            switch (order) {
                case "push":
                    stack.push(sc.nextInt());
                    break;

                case "pop":
                    if (stack.empty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(stack.pop());
                    }
                    break;

                case "size":
                    System.out.println(stack.size());
                    break;

                case "empty":
                    if (stack.empty()) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;

                case "top":
                    if (stack.empty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(stack.peek());
                    }
                    break;
            }
        }

        sc.close();
    }
}