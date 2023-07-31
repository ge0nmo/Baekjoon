class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for(int i = 1; i <= number; i++)
        {
            int divisor = getDivisor(i);
            if(divisor > limit)
                answer += power;
            
            else
                answer += divisor;
        }
        
        return answer;
    }
    
    public static int getDivisor(int n)
    {
        int count = 0;
        
        
        for(int i = 1; i * i <= n; i++)
        {
            if(i * i == n)
                count++;
            
            else if(n % i == 0)
                count += 2;
        }
        
        
        return count;
    }
}