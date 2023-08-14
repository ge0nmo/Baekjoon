class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        
        for(int i = 0; i < section.length;)
        {
            int start = section[i];
            int end = start + m - 1;
            
            while(i < section.length && section[i] <= end)
            {
                i++;
            }
            answer++;
        }
        
        return answer;
    }
}