import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String a = String.valueOf(n);
        for(int i=0;i<a.length();i++){
            answer += a.charAt(i)-'0';
        }
        return answer;
    }
}