import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        Map<String, Integer> map = new HashMap();
        
        for(int i = 0; i < players.length; i++)
        {
            map.put(players[i], i);
        }
        
        for(String calling : callings)
        {
            int index = map.get(calling);
            String player = players[index];
            String takenPlayer = players[index - 1];
            
            players[index] = takenPlayer;
            players[index - 1] = player;
            
            map.put(player, map.get(player) - 1);
            map.put(takenPlayer, map.get(takenPlayer) + 1);

        }
        
        return players;
    }
}