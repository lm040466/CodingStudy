package JavaForCodingTest.No3_4;

import java.util.Scanner;
/* Math.min(), Math.max() 많이 쓰기 */
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int cnt = 0;

        while (n != 1) {
            if(n % k == 0) n /= k;
            else n--;
            cnt++;
        }

        System.out.println(cnt);
    }
}
/*
 * https://github.com/ndb796/python-for-coding-test/blob/master/3/6.java
 *
        while (true) {
            // N이 K로 나누어 떨어지는 수가 될 때까지만 1씩 빼기
            int target = (n / k) * k;
            result += (n - target);
            n = target;
            // N이 K보다 작을 때 (더 이상 나눌 수 없을 때) 반복문 탈출
            if (n < k) break;
            // K로 나누기
            result += 1;
            n /= k;
        }

        // 마지막으로 남은 수에 대하여 1씩 빼기
        result += (n - 1);
 */