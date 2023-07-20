class Solution 
{
    public int solution(int n) 
    {
        int answer = 0;
        answer = toDecimal(toTernary(n));
        
        return answer;
    }
    
    public static String toTernary(int num)
    {
        StringBuilder sb = new StringBuilder();
        while(num != 0)
        {
            sb.append(num%3);
            num /= 3;
        }
        
        return sb.toString();
    }
    
    public static int toDecimal(String num)
    {
        int length = num.length();
        int result = 0;

        for(int i = 0; i < length; i++)
        {
            int n = Character.getNumericValue(num.charAt(i));
            result += n * (int)Math.pow(3, length - i - 1);
        }
        return result;
    }
}