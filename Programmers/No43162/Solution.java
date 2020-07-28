package Programmers.No43162;

class Solution {
    static int[][] com;
    static boolean[] chk;
    static int answer;

    public int solution(int n, int[][] computers) {
        com = new int[n][n];
        chk = new boolean[n];
        answer = n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j)
                    com[i][j] = computers[i][j];
            }
        }
        for (int a = 0; a < n; a++) {
            for (int b = 0; b < n; b++) {
                if (com[a][b] == 1 && !chk[a])
                    dfs(a);
            }
        }
        return answer;
    }

    static void dfs(int x) {
        chk[x] = true;
        for (int k = 0; k < com.length; k++) {
            if (com[x][k] == 1 && !chk[k]) {
                answer--;
                dfs(k);
            }
        }
    }
}