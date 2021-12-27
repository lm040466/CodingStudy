package Programmers.No43238;
import java.util.Arrays;

class Solution {
//    public static void main(String[] args) {
//        int n = 6;
//        int[] times = {7, 10};
//        System.out.print(solution(n, times));
//    }

    public static long solution(int n, int[] times) {
        Arrays.sort(times);

        long answer = 0;
        long left = 0;
        long right = (long) times[times.length - 1] * n;

        while(left <= right) {
            long mid = (left + right) / 2;
            long sum = 0;

            for(int i = 0; i < times.length; i++) {
                sum += mid / times[i];
            }

            if(sum < n) left = mid + 1;
            else {
                right = mid - 1;
                answer = mid;
            }
        }

        return answer;
    }
}