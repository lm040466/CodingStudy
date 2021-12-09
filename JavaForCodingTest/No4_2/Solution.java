package JavaForCodingTest.No4_1;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        String[] plan = sc.nextLine().split(" ");
        int x = 0;
        int y = 0;

        for(String s : plan) {
            switch(s) {
                case "L":
                    y = Math.max(0, y - 1);
                    break;
                case "R":
                    y = Math.min(n - 1, y + 1);
                    break;
                case "U":
                    x = Math.max(0, x - 1);
                    break;
                case "D":
                    x = Math.min(n - 1, x + 1);
                    break;
            }
        }

        x++;
        y++;
        System.out.println(x + " " + y);
    }
}