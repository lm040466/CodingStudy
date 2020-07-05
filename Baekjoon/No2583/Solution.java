package Baekjoon.No2583;

import java.io.*;
import java.util.*;

public class Solution {

    static int m, n, k, area;
    static int x1, x2, y1, y2; // 직사각형 좌표
    static int[][] board; // 모눈종이
    static boolean[][] checked;
    static int[] dx = { 1, 0, -1, 0 }; // 상하좌우 탐색
    static int[] dy = { 0, 1, 0, -1 };
    static ArrayList<Integer> areas; // 넓이저장용

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        k = sc.nextInt();
        board = new int[n][m];
        checked = new boolean[n][m];

        areas = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();

            // 두 좌표 사이의 공간을 체크
            for (int j = x1; j < x2; j++) {
                for (int k = y1; k < y2; k++) {
                    board[j][k] = 1;
                }
            }
        }

        // board가 0인 곳(=직사각형이 없는 곳) 탐색
        for (int a = 0; a < n; a++) {
            for (int b = 0; b < m; b++) {
                if (board[a][b] == 0 && checked[a][b] == false) {
                    area = 0; // 초기화
                    dfs(a, b);
                    areas.add(area); // dfs호출(재귀호출)이 끝난 후 추가
                }
            }
        }
        Collections.sort(areas); // ArrayList 오름차순 정렬

        System.out.println(areas.size());
        // 배열 각 인수 출력
        for (int i : areas) {
            System.out.print(i + " ");
        }

        sc.close();
    }

    public static void dfs(int x, int y) {
        area++; // 재귀호출 전에 크기 증가
        checked[x][y] = true;

        // 상하좌우 탐색
        for (int t = 0; t < 4; t++) {
            int temp_x = x + dx[t];
            int temp_y = y + dy[t];

            if (temp_x >= 0 && temp_x < n && temp_y >= 0 && temp_y < m) {
                if (board[temp_x][temp_y] == 0 && checked[temp_x][temp_y] == false) {
                    dfs(temp_x, temp_y);
                }
            }
        }
    }
}
