package JavaForCodingTest.No3_2;

import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

        Arrays.sort(arr);

        int answer = 0;
        while(true) {
            if(m > k) {
                answer += arr[n - 1] * k;
                m -= k + 1;
                answer += arr[n - 2];
            } else {
                answer += arr[n - 1] * m;
                break;
            }
        }

        System.out.println(answer);
    }
}
 /*
  * https://github.com/ndb796/python-for-coding-test/blob/master/3/2.java
  *
        Arrays.sort(arr); // 입력 받은 수들 정렬하기
        int first = arr[n - 1]; // 가장 큰 수
        int second = arr[n - 2]; // 두 번째로 큰 수

        // 가장 큰 수가 더해지는 횟수 계산
        int cnt = (m / (k + 1)) * k;
        cnt += m % (k + 1);

        int result = 0;
        result += cnt * first; // 가장 큰 수 더하기
        result += (m - cnt) * second; // 두 번째로 큰 수 더하기
 */