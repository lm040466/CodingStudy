package Baekjoon.No10870;

import java.util.*;

public class Solution {
    static int before, temp, ans;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        before = 0; // 초기화
        ans = 1; // 초기화. n = 1에 대한 출력값
        int num = sc.nextInt();

        Fibonacci(num); // 호출

        System.out.print(ans);

        sc.close();
    }

    static void Fibonacci(int num) {
        if (num != 1 && num != 0) {
            temp = ans;
            ans += before;
            before = temp;
            num--;
            Fibonacci(num); // 재호출
        }
        // 0을 입력받았을 때에 대한 처리. n = 1의 경우 함수 종료
        else if (num == 0) {
            ans = 0;
        }
    }
}