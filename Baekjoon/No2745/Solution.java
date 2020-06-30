package Baekjoon.No2745;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        char[] str = sc.next().toCharArray(); // 각 char를 array로 받기
        int x = sc.nextInt();
        double ans = 0;

        int j = 0; // j는 앞에서부터 참조. i는 길이 - 1 로 지수값
        // 아스키코드(char값)에서 정수형으로 변환
        for (int i = str.length - 1; i >= 0; i--) {
            int y = (int) str[j];
            if (y > 60) {
                y = y - 55;
            } else {
                y = y - 48;
            }

            ans = ans + y * Math.pow(x, i); // 계산
            j++;
        }

        System.out.print((int) ans); // double은 실수형이기 때문에 int형변환 후 출력
        sc.close();
    }
}