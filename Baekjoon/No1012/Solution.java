package Baekjoon.No1012;

import java.io.*;
import java.util.*;

public class Solution {
    // 문제풀이에 사용할 변수들. 테스트케이스가 바뀔 때마다 초기화
    static int m, n, k, num;
    static int[][] ground;
    static boolean[][] checked;
    static int[] dx = { 1, 0, -1, 0 }; // 상하좌우 확인용
    static int[] dy = { 0, 1, 0, -1 };

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        // 테이스케이스 개수만큼 반복
        for (int i = 0; i < test; i++) {
            m = sc.nextInt();
            n = sc.nextInt();
            ground = new int[n][m]; // 초기화. 가로, 세로 바꿔서 생성
            checked = new boolean[n][m]; // 초기화
            k = sc.nextInt();
            num = 0; // 초기화

            // 배추위치 입력
            for (int j = 0; j < k; j++) {
                int y = sc.nextInt();
                int x = sc.nextInt();

                ground[x][y] = 1;
            }

            // 배추가 존재하고, 확인되지 않은 위치를 찾아 dfs호출
            for (int a = 0; a < n; a++) {
                for (int b = 0; b < m; b++) {
                    if (ground[a][b] == 1 && checked[a][b] == false) {
                        dfs(a, b);
                        num++; // dfs가 다 끝난 후에 추가
                    }
                }
            }

            System.out.println(num);
            sc.close();
        }
    }

    // dfs함수
    public static void dfs(int x, int y) {
        checked[x][y] = true;

        // 상하좌우 확인
        for (int t = 0; t < 4; t++) {
            int temp_x = x + dx[t];
            int temp_y = y + dy[t];

            if (temp_x >= 0 && temp_x < n && temp_y >= 0 && temp_y < m) {
                if (ground[temp_x][temp_y] == 1 && checked[temp_x][temp_y] == false) {
                    dfs(temp_x, temp_y);
                }
            }
        }
    }
}
