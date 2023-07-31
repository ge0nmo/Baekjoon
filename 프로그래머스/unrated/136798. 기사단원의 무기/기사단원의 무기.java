class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        int divisors[] = new int[number + 1];
        
        for(int i = 1; i <= number; i++)
        {
            divisors[i] = 1;
        }
        
        for(int i = 2; i <= number; i++)
        {
            for(int j = i; j <= number; j += i)
            {
                divisors[j]++;
            }
        }
        
        for(int i = 1; i <= number; i++)
        {
            answer += (divisors[i] > limit) ? power : divisors[i];
        }
        
        return answer;
    }
}