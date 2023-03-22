class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        if(cacheSize == 0)
            return 5 * cities.length;
        
        String arr[] = new String[cacheSize];
        
        for(String x : cities)
        {
            int idx = cacheSize - 1;
            String city = x.toUpperCase();
            boolean check = false;
            
            for(int i = 0; i < cacheSize; i++)
            {
                if(city.equals(arr[i]))
                {
                    idx = i;
                    check = true;
                }
            }
            
            if(check)
                answer++;
            
            else
                answer += 5;
            
            for(int j = idx; j >= 1; j--)
            {
                arr[j] = arr[j - 1];
            }
            
            arr[0] = city;
        }

        return answer;
        
    }
}