package JavaForCodingTest.No3_3;

import java.util.Scanner;
/* Math.min(), Math.max() 많이 쓰기 */
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int max = -1;

        for(int i = 0; i < n; i++) {
            int min = 10001;
            for(int j = 0; j < m; j++) {
                int next = sc.nextInt();
                min = min < next ? min : next;
            }
            max = min > max ? min : max;
        }

        System.out.println(max);
    }
}