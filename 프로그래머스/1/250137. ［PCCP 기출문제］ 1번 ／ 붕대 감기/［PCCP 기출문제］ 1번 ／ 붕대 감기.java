import java.util.Map;
import java.util.HashMap;
class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        // bandage : 시전시간, 초당 회복량, 추가 회복량
        // health : 최대 체력
        // attacks : [공격 시간, 피해량]
        int aL = attacks.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<aL; i++){
            map.put(attacks[i][0], attacks[i][1]);
        }
        int cnt = 0;
        int maxH = health;
        for(int i=1; i<=attacks[aL-1][0]; i++){
            if(map.containsKey(i)){
                cnt =0;
                health -= map.get(i);
                if(health<= 0){
                    return -1;
                }
                if(i == attacks[aL-1][0]){
                    return health;
                }
                continue;
            }
            if(health + bandage[1] >= maxH){
                health = maxH;
                cnt++;
            } else {
                health += bandage[1];
                if(health >= maxH)
                    health = maxH;
                cnt++;
            }
            if(cnt == bandage[0]){
                health += bandage[2];
                cnt = 0;
                if(health >= maxH)
                    health = maxH;
            }
        }
        return health;
    }
}