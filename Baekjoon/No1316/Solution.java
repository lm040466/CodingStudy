package Baekjoon.No1316;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int chk = num; // 단어개수

        // 단어개수만큼 반복
        for (int i = 0; i < num; i++) {
            String word = br.readLine();
            String[] str = word.split(""); // 한글자씩 저장
            ArrayList<String> words = new ArrayList<String>(); // 확인용 리스트

            // 리스트에 포함이 되어 있지만 마지막으로 추가된 글자가 아니라면 그룹단어가 아님
            for (int j = 0; j < str.length; j++) {
                if (words.contains(str[j])) {
                    if (!words.get(words.size() - 1).equals(str[j])) {
                        chk--;
                        break;
                    }
                } else {
                    words.add(str[j]);
                }
            }
        }
        System.out.print(chk);
    }
}
