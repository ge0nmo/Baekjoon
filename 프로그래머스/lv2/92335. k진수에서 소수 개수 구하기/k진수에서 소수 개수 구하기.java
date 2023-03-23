class Solution {
    
    static boolean check[] = new boolean[1000000000];
    
    public int solution(int n, int k)
    {
        
        int answer = -1;
        int count = 0;
        
        String arr[] = prime(n, k).split("0");
        
        for(String s : arr)
        {
            if(s.equals(""))
                continue;
            
            if(isPrime(Long.valueOf(s)))
                count++;
        }
        
        return count;
    }
    
    public static String prime(int n, int k)
    {
        StringBuilder sb = new StringBuilder();
        
        while(n > 0)
        {
            int rest = n % k;
            sb.append(rest);
            n = n / k;
        }
        
        return sb.reverse().toString();
    }
    
    public static boolean isPrime(long n)
    {
        if(n == 1)
            return false;
        
        if(n == 2)
            return true;
        
        int num = (int)Math.sqrt(n);
        
        for(int i = 2; i <= num; i++)
        {
            if(n % i == 0)
                return false;
        }
        
        return true;
    
    }
}