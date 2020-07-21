package Programmers.No42576;

import java.util.*; //Arrays, HashMap 사용

class Solution {
    public String solution(String[] participant, String[] completion) {
        // 정렬
        Arrays.sort(participant);
        Arrays.sort(completion);

        // 비교
        for (int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }

        return participant[participant.length - 1]; // 마지막까지 나오지 않았다면, 마지막 선수가 완주 못함
    }
}

// 해시를 이용한 다른사람의 풀이
/*
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for (String player : participant)
            hm.put(player, hm.getOrDefault(player, 0) + 1);
        for (String player : completion)
            hm.put(player, hm.get(player) - 1);

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0) {
                answer = key;
            }
        }
        return answer;
    }
}
*/