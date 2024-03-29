package JavaForCodingTest.No4_2;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int total = 0;
        for(int i = 0; i <=n; i++) {
            for(int j = 0; j < 60; j++) {
                for(int k = 0; k < 60; k++) {
                    if(check(i, j, k)) total++;
                }
            }
        }

        System.out.println(total);
    }

    static boolean check(int h, int m, int s) {
        if(h % 10 == 3 || m / 10 == 3 || m % 10 == 3 || s / 10 == 3 || s % 10 == 3) {
            return true;
        }
        return false;
    }
}