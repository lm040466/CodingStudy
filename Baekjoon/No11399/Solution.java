package Baekjoon.No11399;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // int num = Integer.parseInt(br.readLine()); // 사람수
        String str = br.readLine();

        String[] ary = str.split(" ");
        ArrayList<Integer> atm = new ArrayList<Integer>();

        // ArrayList에 저장
        for (int i = 0; i < ary.length; i++) {
            atm.add(Integer.parseInt(ary[i]));
        }

        Collections.sort(atm); // 오름차순으로 정렬
        int total = 0;
        // 총합 구하기
        for (int j = 0; j < atm.size(); j++) {
            for (int l = 0; l < j + 1; l++) {
                total = total + atm.get(l);
            }
        }

        System.out.print(total);
    }
}
