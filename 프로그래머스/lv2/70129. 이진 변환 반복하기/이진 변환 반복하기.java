class Solution {
    
    static int answer = 0;
    
    public int[] solution(String s) {
        int[] arr = new int[2];
        int count = 0;
        
        while(!s.equals("1"))
        {
            s = toBinary(s);
            count++;
        }
        
        arr[0] = count;
        arr[1] = answer;
        
        return arr;
    }
    
    public static String toBinary(String str)
    {
        String s = str.replace("0", "");
        StringBuilder sb = new StringBuilder();

        int removedZero = str.length() - s.length();
        int length = s.length();

        answer += removedZero;


        while(length > 1)
        {
            int rest = length % 2;
            length = length / 2;
            sb.append(rest);
        }

        sb.append(1);

        return sb.reverse().toString();
    }
}