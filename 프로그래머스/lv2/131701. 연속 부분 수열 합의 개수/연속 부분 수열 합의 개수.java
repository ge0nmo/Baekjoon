import java.util.*;
class Solution {
    
    static Set<Integer> set = new HashSet();
    static int arr[];
    
    public int solution(int[] elements) {
        
        int answer = 0;
        Set<Integer> set = new HashSet();
        
        for(int i = 1; i < elements.length; i++)
        {
            for(int j = 0; j < elements.length; j++)
            {
                int sum = 0;
                for(int k = j; k < j + i; k++)
                {
                    sum += elements[k % elements.length];
                }
                
                set.add(sum);
            }
        }
        
        return set.size() + 1;
    }
}