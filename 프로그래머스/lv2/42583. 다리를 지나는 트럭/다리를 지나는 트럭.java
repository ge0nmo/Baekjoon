import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int sum = truck_weights[0];
        
        Queue<Integer> que = new LinkedList();
        
        for(int i = 0; i < bridge_length; i++)
        {
            que.offer(0);
        }
        
        que.poll();
        que.offer(truck_weights[0]);
        answer++;;
        truck_weights = Arrays.copyOfRange(truck_weights, 1, truck_weights.length);
        
        while(truck_weights.length != 0 || sum != 0)
        {
            sum -= que.poll();
            
            if(truck_weights.length != 0)
            {
                if(sum + truck_weights[0] <= weight)
                {
                    que.offer(truck_weights[0]);
                    sum += truck_weights[0];
                    truck_weights = Arrays.copyOfRange(truck_weights, 1, truck_weights.length);
                }
                
                else
                {
                    que.offer(0);
                }
                
            }
            
            else
            {
                que.offer(0);
            }
            
            answer++;
        }
        
        return answer;
    }
}
