import java.util.*;
class Solution {
    public int[] solution(String[] wallpaper) {
        int start_x=0; // [0] 중 가장 작은 것
        int start_y=0; // [1] 중 가장 작은 것
        int end_x=0;   // [0] 중 가장 큰 것 +1
        int end_y=0;   // [1] 중 가장 큰 것 +1
        int cnt =0;
        for(int i=0; i<wallpaper.length; i++){
            String[] items = wallpaper[i].split("");
            for(int j=0; j<items.length; j++){
                if(items[j].equals("#")){
                    if(cnt == 0) {
                        // 초기값 설정
                        start_x = i;
                        start_y = j;
                        cnt ++;
                    }
                    if(start_x >= i) start_x = i;
                    if(start_y >= j) start_y = j;
                    if(end_x <= i) end_x = i;
                    if(end_y <= j) end_y = j;
                    
                }
            }
        }
        
        int[] answer = {start_x, start_y, end_x+1, end_y+1};
        return answer;
    }
}