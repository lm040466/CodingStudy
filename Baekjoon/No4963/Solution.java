package Baekjoon.No4963;

import java.io.*;
import java.util.*;

public class Solution {

  static int w, h, count; //너비, 높이, 섬의개수
  static int[][] map; //지도
  static boolean[][] checked; //확인
  static int[] dx = {1, 0, -1, 0, -1, -1, 1, 1}; //상하좌우대각선
  static int[] dy = {0, 1, 0, -1, -1, 1, -1, 1};

  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    w = sc.nextInt();
    h = sc.nextInt();

    //입력이 '0 0'이 되기 전까지 실행
    while (w != 0 && h != 0) {
      map = new int[h][w]; //초기화
      checked = new boolean[h][w]; //초기화
      count = 0; //초기화

      //지도입력
      for (int i = 0; i < h; i++) {
        for (int j = 0; j < w; j++) {
          map[i][j] = sc.nextInt();
        }
      }

      //섬이 있는 곳에서 dfs호출. 섬 하나를 다 탐색한 후(재귀완료) count 증가
      for (int a = 0; a < h; a++) {
        for (int b = 0; b < w; b++) {
          if (map[a][b] == 1 && checked[a][b] == false) {
            dfs(a, b);
            count++;
          }
        }
      }
      System.out.println(count);

      w = sc.nextInt();
      h = sc.nextInt();
    }

    sc.close();
  }

  public static void dfs(int x, int y) {
    checked[x][y] = true;

    //상하좌우대각선 탐색
    for (int t = 0; t < 8; t++) {
      int temp_x = x + dx[t];
      int temp_y = y + dy[t];

      if (temp_x >= 0 && temp_x < h && temp_y >= 0 && temp_y < w) {
        if (map[temp_x][temp_y] == 1 && checked[temp_x][temp_y] == false) {
          dfs(temp_x, temp_y);
        }
      }
    }
  }
}
