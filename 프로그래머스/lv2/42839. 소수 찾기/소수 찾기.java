import java.util.*;
class Solution 
{
    
    static boolean isPrime[] = new boolean[100001];
    static String arr[], str[];
    static boolean check[];
    static Set<Integer> set = new HashSet<>();
    
    public int solution(String numbers) {
        
        int answer = 0;
        
        arr = numbers.split("");
        str = new String[arr.length];
        check = new boolean[arr.length];
        
        dfs("", 0);
        
        for(int num : set)
        {
            if(isPrime(num))
                answer++;
        }
        
        return answer;
    }
    
    public static void dfs(String word, int depth)
    {
        if(word != "")
        {
            int num = Integer.parseInt(word);
            set.add(num);
        }
        
        if(depth == arr.length)
            return;
        
        else
        {
            for(int i = 0; i < arr.length; i++)
            {
                if(!check[i])
                {
                    check[i] = true;
                    dfs(word + arr[i], depth + 1);
                    check[i] = false;
                }
            }
        }
    }
    
    public static boolean isPrime(int num)
    {
        if(num < 2)
            return false;
        
        if(num == 2)
            return true;
        
        if(num % 2 == 0)
            return false;
        
        for(int i = 2; i <= Math.sqrt(num); i++)
        {
            if(num % i == 0)
                return false;
                
        }
        
        return true;
    }
}