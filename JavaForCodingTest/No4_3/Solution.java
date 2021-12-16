package JavaForCodingTest.No4_3;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String start = sc.nextLine();

        int x = (int) start.charAt(0) - 97;     // int x = start.charAt(0) - 'a';
        int y = (int) start.charAt(1) - 49;     // int y = start.charAt(1) - '1';

        int[] dx = {1, -1, 2, 2, 1, -1, -2, -2};
        int[] dy = {2, 2, 1, -1, -2, -2, 1, -1};

        int cases = 8;
        for(int i = 0; i < 8; i++) {
            int temp_x = x + dx[i];
            int temp_y = y + dy[i];

            if(temp_x < 0 || temp_x >= 8 || temp_y < 0 || temp_y >= 8)
                cases--;
        }

        System.out.println(cases);
    }
}