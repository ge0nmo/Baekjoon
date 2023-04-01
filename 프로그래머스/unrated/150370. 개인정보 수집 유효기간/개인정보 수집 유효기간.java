import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        List<Integer> list = new ArrayList();

        Map<String, Integer> termsMap = new HashMap();

        for(String str : terms)
        {
            String arr[] = str.split(" ");
            String termsType = arr[0];
            int period = Integer.parseInt(arr[1]);
            termsMap.put(termsType, period);
        }

        for(int i = 0; i < privacies.length; i++)
        {
            String str = privacies[i];

            String information[] = str.split(" ");

            int year, month, day;

            year = Integer.parseInt(information[0].substring(0, 4));

            if(information[0].charAt(5) == '0')
            {
                month = Integer.parseInt(information[0].substring(6, 7));
            }

            else
            {
                month = Integer.parseInt(information[0].substring(5, 7));
            }

            if(information[0].charAt(8) == '0')
            {
                day = Integer.parseInt(information[0].substring(9));
            }

            else
            {
                day = Integer.parseInt(information[0].substring(8));
            }

            int period = termsMap.get(information[1]);

            int expiry = month + period;

            if(expiry > 12)
            {
                year += expiry / 12;
                month =  expiry % 12;
            }

            else
                month = expiry;

            if(day - 1 == 0)
            {
                day = 28;
                month--;
            }

            else
                day--;

            if(month == 0)
            {
                year--;
                month = 12;
            }

            int expiredAt = (year * 10000) + (month * 100) + (day);
            int today1 = Integer.parseInt(today.replace(".", ""));

            if(today1 > expiredAt)
            {
                list.add(i);
            }
        }

        //2021 0202

        answer = new int[list.size()];
            
         for(int i = 0; i < list.size(); i++)
         {
            answer[i] = list.get(i) + 1;
         }
        
        return answer;
    }
}