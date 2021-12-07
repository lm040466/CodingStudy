package JavaForCodingTest.No3_1;

class Main {
    public static void main(String[] args) {
        int n = 1260;
        int[] types = {500, 100, 50, 10};
        int cnt = 0;

        for(int i = 0; i < types.length; i++) {
            int coin = types[i];
            cnt += n / coin;
            n %= coin;
        }

        System.out.println(cnt);
    }
}