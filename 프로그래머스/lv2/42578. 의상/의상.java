import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        Map<String, Integer> map = new HashMap();
        //각 배열에서 종류를 가져온다.
        //종류의 개수에 따라 조합의 수가 달라짐
        for(int i = 0; i < clothes.length; i++)
        {
            String type = clothes[i][1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }
        
        for(int num : map.values())
        {
            answer *= num + 1;
        }
        
        return answer - 1;
    
    }
}