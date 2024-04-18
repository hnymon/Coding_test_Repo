import java.util.*;
import java.io.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        Queue<String> q1 = new LinkedList<>();
        Queue<String> q2 = new LinkedList<>();
        for(int i=0; i<cards1.length; i++){
            q1.add(cards1[i]);
        }
        for(int i=0; i<cards2.length; i++){
            q2.add(cards2[i]);    
        }
        String[] arr = new String[goal.length];
        for(int i=0; i<goal.length; i++){
            if(goal[i].equals(q1.peek())){
                arr[i] = q1.poll();
            }
            else if(goal[i].equals(q2.peek())){
                arr[i] = q2.poll();
            }
            else {
                answer = "No";
                break;
            }
        }
        for(int i=0; i<goal.length; i++){
            if(goal[i].equals(arr[i])){
                if(i == goal.length-1){
                    return "Yes";
                }
                continue;
            }
        }
        return answer;
    }
}