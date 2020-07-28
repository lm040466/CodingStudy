package Baekjoon.No1788;

import java.util.*;

public class Solution {
    static int before, temp, ans;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        before = 0;
        ans = 1;
        int num = sc.nextInt();

        Fibonacci(num);

        System.out.print(ans);

        sc.close();
    }

    static void Fibonacci(int num) {
        if(num == 1) return;
        if(num == 0) ans = 0;
        if (num != 1 && num != 0) {
            temp = ans;
            ans += before;
            before = temp;
            num--;
            Fibonacci(num);
        } else if (num == 0) {
            ans = 0;
        }
    }

}