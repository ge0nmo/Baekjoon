import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int count = 0;

        Arrays.sort(people);
        
        int lt = 0;

        
        for(int rt = people.length - 1; rt >= lt; rt--)
        {
            int weight = people[rt] + people[lt];
            
            if(weight > limit)
                count++;
                
            else
            {
                lt++;
                while(weight > limit)
                {
                    weight += people[lt++];
                }
                count++;
            }
        }
        
        return count;
    }
    
    public static void quickSort(int left, int right, int arr[])
    {
        int i, j, pivot;
        
        if(left < right)
        {
            i = left;
            j = right;
            pivot = arr[left];
            
            while(i < j)
            {
                
                while(pivot < arr[j])
                {
                    j--;
                }
                
                while(i < j && pivot >= arr[i])
                {
                    i++;
                }
                
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                
            }
            
            arr[left] = arr[i];
            arr[i] = pivot;
            
            quickSort(left, i - 1, arr);
            quickSort(i + 1, right, arr);
        }
        
    }
}