import java.util.Map;
import java.util.HashMap;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }
        for(int i = 0; i < callings.length; i++) {
            int ci = map.get(callings[i]);
            if (ci > 0 && ci < players.length) {
                String tmp = players[ci];
                players[ci] = players[ci - 1];
                players[ci - 1] = tmp;
                map.put(players[ci], ci);
                map.put(players[ci - 1], ci - 1);
            }
        }
        return players;
    }
}
