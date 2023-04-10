class Solution {
    
    static int num;
    static int count = 0;
    static boolean visited[];
    
    public int solution(int k, int[][] dungeons) {
        
        visited = new boolean[dungeons.length];
        dfs(k, dungeons, 0);
        
        
        return count;
    }
    
    public static void dfs(int k, int arr[][], int depth)
    {
        for(int i = 0; i < arr.length; i++)
        {
            if(visited[i] || arr[i][0] > k)
                continue;
            
            
            visited[i] = true;
            dfs(k - arr[i][1], arr, depth + 1);
            visited[i] = false;
        }
        
        count = Math.max(count, depth);
    }
    
    
}