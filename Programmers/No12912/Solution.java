package Programmers.No12912;

class Solution {
    public long solution(int a, int b) {
        return (long) (a + b) * (Math.abs(b - a) + 1) / 2;
    }
}