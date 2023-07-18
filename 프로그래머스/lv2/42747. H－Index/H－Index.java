import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int length = citations.length;
        
        //Arrays.sort(citations);
        quickSort(0, length - 1, citations);
        
        for(int i = 0; i < length; i++)
        {
            int h = length - i;
            
            if(citations[i] >= h)
            {
                answer = h;
                break;
            }
        }
        
        
        return answer;
    }
    
    public void quickSort(int left, int right, int arr[])
    {
        int i, j, pivot;
        
        if(left < right)
        {
            i = left;
            j = right;
            pivot = arr[left];
            
            while(i < j)
            {
                while(arr[j] > pivot)
                {
                    j--;
                }
                
                while(i < j && arr[i] <= pivot)
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