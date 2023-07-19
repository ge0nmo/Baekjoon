import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        
        int length = arr1.length;
        String[] answer = new String[arr1.length];
        
        for(int i = 0; i < length; i++)
        {
            answer[i] = toBinary(n, arr1[i], arr2[i]);
            
        }

        return answer;
    }
    
    public String toBinary(int n, int num1, int num2)
    {
        StringBuilder sb = new StringBuilder();
        //String first = String.format("%" + n + "s", Integer.toBinary(num1));
        //String second = String.format("%" + n + "s", Integer.toBinary(num2));
        
        for(int i = 0; i < n; i++)
        {
            if(num1 % 2 == 0 && num2 % 2 == 0)
                sb.append(" ");
            else
                sb.append("#");
            
            num1 = num1/2;
            num2 = num2/2;
            
        }
        
        return sb.reverse().toString();
    }
}