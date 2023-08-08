class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        int lt = 0;
        
        int arr[] = new int[ingredient.length];
        
        for(int n : ingredient)
        {
            arr[lt++] = n;
            
            if(n == 1 && lt >= 4)
            {
                if(arr[lt - 2] == 3 && arr[lt - 3] == 2 && arr[lt - 4] == 1)
                {
                    answer++;
                    
                    lt = lt - 4;
                }
            }
        }
        
        return answer;
    }
}