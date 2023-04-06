class Solution 
{
    int count = 0;
    
    public int solution(int[] numbers, int target) {
        int answer = 0;
        
        dfs(0, 0, target, numbers);
        
        return count;
    }
    
    public void dfs(int depth, int sum, int target, int numbers[])
    {
        if(depth == numbers.length)
        {
            if(sum == target)
                count++;
        }
        
        else
        {
            dfs(depth + 1, sum + numbers[depth], target, numbers);
            dfs(depth + 1, sum - numbers[depth], target, numbers);
            
        }
    }
}