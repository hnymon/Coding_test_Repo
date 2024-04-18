import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        Set<Character> skipSet = new HashSet<>();
        for (char c : skip.toCharArray()) {
            skipSet.add(c);
        }
        List<Character> alp = new ArrayList<>();
        for(int i=0; i<26; i++){
            char c = (char)('a'+i);
            if(!skipSet.contains(c)){
                alp.add(c);
            }
        }
        for (char c : s.toCharArray()) {
            int ci = alp.indexOf(c) + index;
            ci %= alp.size();
            answer.append(alp.get(ci));
        }
        return answer.toString();
    }
}