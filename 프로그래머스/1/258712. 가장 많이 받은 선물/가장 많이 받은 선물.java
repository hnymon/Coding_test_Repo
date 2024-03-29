import java.util.Arrays;
class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        int fl = friends.length;
        int gl = gifts.length;
        int[][] arr2 = new int[fl][fl];
        // 주고받은 선물 표
        for(int i=0; i<fl; i++){ // 행
            for(int j=0; j<fl; j++){ // 열 
                for(String gift : gifts){ // 비교
                    String[] strs = gift.split(" ");
                    String gf1 = strs[0];
                    String gf2 = strs[1];
                    if(gf1.equals(friends[i])){
                        if(gf2.equals(friends[j])){
                            arr2[i][j] ++;
                        }
                    }
                }
            }
        }
        // 선물 지수 표
        int[][] arr22 = new int[fl][3];
        for(int i=0; i<fl; i++){
            for(int j=0; j<fl; j++){
                arr22[i][0] += arr2[i][j];
                arr22[i][1] += arr2[j][i];
            }
        }
        for(int i=0; i<fl; i++){
            arr22[i][2] = arr22[i][0]-arr22[i][1];
        }

        // 결과 구하기
        int[] resarr = new int[fl];
        for(int i=0; i<fl; i++){
            for(int j=0; j<fl; j++){
                if(i!=j){
                    if(arr2[i][j] > arr2[j][i]){
                        resarr[i] ++;
                    }
                    if(arr2[i][j] == arr2[j][i]){
                        if(arr22[i][2] > arr22[j][2]){
                            resarr[i] ++;
                        }
                    }
                }
            }
        }
        Arrays.sort(resarr);
        return resarr[fl-1];
    }
}