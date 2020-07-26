package Programmers.No43165;

class Solution {
    static int answer, tar;
    static int[] nums;

    public int solution(int[] numbers, int target) {
        answer = 0;
        tar = target;
        nums = new int[numbers.length];
        System.arraycopy(numbers, 0, nums, 0, numbers.length);

        dfs(0, nums[0], 0);

        return answer;
    }

    static void dfs(int sum, int num, int array_num) {
        int temp_sum1 = sum + num;
        int temp_sum2 = sum - num;
        if (array_num == nums.length - 1) {
            if (temp_sum1 == tar)
                answer++;
            if (temp_sum2 == tar)
                answer++;
        } else {
            array_num++;
            num = nums[array_num];
            dfs(temp_sum1, num, array_num);
            dfs(temp_sum2, num, array_num);
        }
    }
}

// 너무 똑똑한 다른 사람의 풀이
/*
class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        answer = dfs(numbers, 0, 0, target);
        return answer;
    }

    int dfs(int[] numbers, int n, int sum, int target) {
        if (n == numbers.length) {
            if (sum == target) {
                return 1;
            }
            return 0;
        }
        return dfs(numbers, n + 1, sum + numbers[n], target) + dfs(numbers, n + 1, sum - numbers[n], target);
    }
}
*/