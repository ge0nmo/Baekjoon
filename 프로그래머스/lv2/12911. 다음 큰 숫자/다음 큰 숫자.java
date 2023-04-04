class Solution {
    public int solution(int n) {
        int answer = n + 1;
        int count = toBinary(n);
        
        while(true)
        {
            if(toBinary(answer) == count)
                break;
            
            answer++;
        }
        
        
        return answer;
    }
    
    public static int toBinary(int n)
    {
        int count = 1;
        
        while(n > 1)
        {
            int rest = n % 2;
            if(rest == 1)
                count++;
            
            n = n / 2;
        }
        
        return count;
    }
    
    public static int toNum(String str)
    {
        int n = str.length() - 1;
        int answer = 0;
        
        for(char x : str.toCharArray())
        {
            if(x == '1')
            {
                answer += Math.pow(2, n);
            }
            
            n--;
        }
        
        return answer;
    }
}