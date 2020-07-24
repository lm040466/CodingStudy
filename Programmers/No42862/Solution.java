package Programmers.No42862;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] member = new int[n + 2]; // 입력의 수를 그대로 확인하고 앞뒷번호를 참조할 수 있도록
        for (int x : reserve)
            member[x]++;
        for (int y : lost)
            member[y]--;
        for (int i = 1; i < member.length - 1; i++) {
            // 앞번호가 없는 경우
            if (member[i] > 0 && member[i - 1] < 0) {
                member[i]--;
                member[i - 1]++;
            }
            // 뒷번호가 없는경우
            if (member[i] > 0 && member[i + 1] < 0) {
                member[i]--;
                member[i + 1]++;
            }
        }
        for (int z : member) {
            if (z >= 0)
                answer++;
        }
        return answer - 2; // member[0]와 member[n+1]은 고려대상 제외
    }
}