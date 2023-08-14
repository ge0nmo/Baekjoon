class Solution {
    
    static int arr[];
    
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int start = section[0];
        
        arr = new int[n + 1];
        
        for(int i = 0; i < section.length; i++)
        {
            int num = section[i];
            arr[num] = 1;
        }
        
        
        for(int i = start; i < arr.length; i++)
        {
            if(arr[i] == 0)
                continue;
            
            paint(i, Math.min(i + m - 1, n));
            
            answer++;
            
            i += m - 1;
        }
        
        
        return answer;
    }
    
    public void paint(int start, int end)
    {
        for(int i = start; i <= end; i++)
        {
            arr[start] = 0;
        }
    }
}