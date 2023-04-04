class Solution {
    public int solution(int n) {
        int answer = n + 1;
        int a = Integer.bitCount(n);
        
        while(true)
        {
            if(Integer.bitCount(answer) == a)
                break;
            
            answer++;
        }
        
        
        
        return answer;
    }
    
    public static String toBinary(int n)
    {
        StringBuilder sb = new StringBuilder();
        sb.append(1);
        while(n > 1)
        {
            int rest = n % 2;
            sb.append(rest);
            
            n = n / 2;
        }
        
        return sb.toString();
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