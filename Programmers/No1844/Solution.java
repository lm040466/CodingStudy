package Programmers.No1844;
import java.util.Queue;
import java.util.LinkedList;

class Solution {
    int n, m;
    int[] dx = {0, 1, 0, -1};
    int[] dy = {1, 0, -1, 0};
    public int solution(int[][] maps) {
        n = maps.length;
        m = maps[0].length;

        boolean[][] visited = new boolean[n][m];
        int[][] cnt = new int[n][m];

        bfs(maps, visited, cnt);

        return cnt[n - 1][m - 1] == 0 ? -1 : cnt[n - 1][m - 1];
    }

    public void bfs(int[][] maps, boolean[][] visited, int[][] cnt) {
        Queue<Integer> queueX = new LinkedList<>();
        Queue<Integer> queueY = new LinkedList<>();

        queueX.offer(0);
        queueY.offer(0);

        visited[0][0] = true;
        cnt[0][0] = 1;

        while(!queueX.isEmpty()) {
            int x = queueX.poll();
            int y = queueY.poll();

            for(int i = 0; i < 4; i++) {
                int tempX = x + dx[i];
                int tempY = y + dy[i];

                if(tempX >= 0 && tempX < n && tempY >= 0 && tempY < m) {
                    if(maps[tempX][tempY] == 1 && !visited[tempX][tempY]) {
                        queueX.offer(tempX);
                        queueY.offer(tempY);

                        visited[tempX][tempY] = true;

                        cnt[tempX][tempY] = cnt[x][y] + 1;
                    }
                }
            }
        }
    }
}