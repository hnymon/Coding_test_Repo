import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<terms.length; i++){
            map.put(terms[i].split(" ")[0], Integer.parseInt(terms[i].split(" ")[1]));
        }
        int intToday = Integer.parseInt(today.replaceAll("[.]", ""));
        for(int i=0; i<privacies.length; i++){
            String pri = privacies[i].split(" ")[0];
            int plus = map.get(privacies[i].split(" ")[1])*28 -1;
            
            int m = plus/28%12;
            int d = plus%28;
            int y = plus/28/12;
            
            int pYear = Integer.parseInt(pri.substring(0,4))+y;
            int pMonth = Integer.parseInt(pri.substring(5,7))+m;
            int pDay = Integer.parseInt(pri.substring(8))+d;
            if(pDay>28){
                pDay -=28;
                pMonth++;
            } 
            if(pMonth>12){
                pMonth -=12;
                pYear++;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(pYear);
            if(pMonth<10) sb.append("0"+pMonth);
            else sb.append(pMonth);
            if(pDay<10) sb.append("0"+pDay);
            else sb.append(pDay);
            int pDate = Integer.parseInt(sb.toString());
            if(intToday>pDate){
                list.add(i+1);
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}