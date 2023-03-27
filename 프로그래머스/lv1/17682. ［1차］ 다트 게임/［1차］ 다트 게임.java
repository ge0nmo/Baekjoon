class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int score[] = new int[3];
        int idx = -1;
        
        for(int i = 0; i < dartResult.length(); i++)
        {
            char x = dartResult.charAt(i);
            if(Character.isDigit(x))
            {
                idx++;
                if(x == '1' && dartResult.charAt(i + 1) == '0')
                {
                    score[idx] = 10;
                    i++;
                }
                else
                {
                    score[idx] = x - '0';
                }
            }
            
            else if(x == 'S')
                score[idx] = (int)Math.pow(score[idx], 1);
            
            else if(x == 'D')
                score[idx] = (int)Math.pow(score[idx], 2);
            
            else if(x == 'T')
                score[idx] = (int)Math.pow(score[idx], 3);
            
            else if(x == '*')
            {
                score[idx] *= 2;
                if(idx > 0)
                {
                    score[idx - 1] *= 2;
                }
            }
                
            
            else if(x == '#')
                score[idx] *= -1;
            
        }
        
        for(int a : score)
        {
            answer += a;
        }
        
        return answer;
    }
}