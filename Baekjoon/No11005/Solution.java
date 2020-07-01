package Baekjoon.No11005;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int n = sc.nextInt();
        String ans = "";
        int temp;

        while (num != 0) {
            temp = num % n;
            num = num / n;

            if(temp > 9) ans = (char)(temp +55) + ans;
            else ans = (char)(temp + 48) + ans;
        }

        System.out.print(ans);
        sc.close();
    }
}