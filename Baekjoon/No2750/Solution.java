package Baekjoon.No2750;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int[] ans = new int[num];

        for (int i = 0; i < num; i++) {
            ans[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(ans);

        for (int j = 0; j < num; j++) {
            System.out.print(ans[j]);
            System.out.print("\n");
        }
    }
}