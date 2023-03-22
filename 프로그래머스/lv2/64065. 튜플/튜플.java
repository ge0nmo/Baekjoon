import java.util.*;
import java.util.stream.Stream;

class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        Map<Integer, Integer> map = new HashMap();

        s = s.replace("{", "").replace("}", "");

        String arr[] = s.split(",");

        for(String str : arr)
        {
            int num = Integer.parseInt(str);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        answer = new int[map.size()];


        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((a, b) -> map.get(b) - map.get(a));

        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) 
        {
            answer[i] = list.get(i);
        }
        
        return answer;

    }
}