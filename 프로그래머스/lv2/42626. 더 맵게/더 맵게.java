import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        int length = scoville.length;

        
        int index = length;
        
        for(int i = 0; i < length; i++)
        {
            if(scoville[i] >= K)
            {
                index = i;
                break;
            }
        }
        
        
        PriorityQueue<Integer> que = new PriorityQueue();
        
        for(int num : scoville)
        {
            que.offer(num);
        }
        
        while(que.peek() < K)
        {
            if(que.size() == 1)
                return -1;
            
            int lowestScoville = que.poll();
            int secondLowestScoville = que.poll();
            
            int mixedScoville = lowestScoville + (secondLowestScoville * 2);
            
            que.offer(mixedScoville);
            
            answer++;            
        }

        return answer;
    }
}