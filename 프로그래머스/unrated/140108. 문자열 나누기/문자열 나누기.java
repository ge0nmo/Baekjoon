class Solution {
    public int solution(String s) {
        int answer = 0;
        
        int lt = 0;
        int rt = 0;
        char ch = s.charAt(0);
        
        for(int i = 0; i < s.length(); i++)
        {
            if(lt == rt)
            {
                ch = s.charAt(i);
                answer++;
            }
            
            if(ch == s.charAt(i))
                lt++;
            
            else
                rt++;
        }
        
        return answer;
    }
}