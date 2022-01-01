package Programmers.No12901;

class Solution {
    public String solution(int a, int b) {
        int[] day = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] ans = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};

        int days = b;
        for(int i = 0; i < a - 1; i++) {
            days += day[i];
        }

        return ans[days%7];
    }
}