package Programmers.No77486;
import java.util.HashMap;

class Solution {
    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        HashMap<String, Integer> enrolls = new HashMap<>();
        HashMap<String, String> referrals = new HashMap<>();
        for(int i = 0; i < enroll.length; i++) {
            enrolls.put(enroll[i], 0);
            referrals.put(enroll[i], referral[i]);
        }

        for(int i = 0; i < seller.length; i++) {
            int get = amount[i] * 100;
            enrolls.put(seller[i], enrolls.get(seller[i]) + get);
            String ref = seller[i];

            while(referrals.containsKey(ref)) {
                get /= 10;
                if(get <= 0) break;

                enrolls.put(ref, enrolls.get(ref) - get);
                ref = referrals.get(ref);
                if(!ref.equals("-")) enrolls.put(ref, enrolls.get(ref) + get);
            }
        }

        int[] answer = new int[enroll.length];
        for(int i = 0; i < answer.length; i++) answer[i] = enrolls.get(enroll[i]);

        return answer;
    }
}