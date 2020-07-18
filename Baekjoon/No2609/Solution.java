package Baekjoon.No2609;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int min = a * b;

        // 나누기
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }

        int max = b;

        if (min != 0) {
            while (true) {
                if (a % b == 0 || b == 1)
                    break;
                int r = a % b;
                a = b;
                b = r;
            }
            max = b;
            min = min / max;
        }

        System.out.println(max);
        System.out.println(min);

        sc.close();
    }
}