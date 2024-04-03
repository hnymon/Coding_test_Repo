class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        // answer index 설정용
        int a = 0;
        for(String tar : targets){
            int sum = 0;
            for(int i=0; i<tar.length(); i++){
                // tar를 한 글짜 씩 key()를 실행
                int cnt = key(keymap, tar.charAt(i));
                // cnt 가 -1이라면 target에 없는 것이므로 종료
                if(cnt == -1){
                    sum = -1;
                    break;
                }
                // -1이 아니면 존재하는 것
                // 즉, sum에 cnt를 쌓아 for문이 종료되면
                // 해당인덱스에 값 넣기
                sum += cnt;
            }
            answer[a] = sum;
            a ++;
        }    
        return answer;
    }
    // 매개변수로 keymap 배열과 tar의 한 char를 받아 실행
    public int key(String[] keymap, char c){
        int min = -1; // 기본값 설정 및 없을 때
        for(String key : keymap){
            // keymap의 배열을 하나씩 돎
            for(int i=0; i<key.length(); i++){
                // key의 char 중 하나가 매개변수로 들어온 c와 같은지 비교
                if(key.charAt(i) == c){
                    // 처음 같은 char가 나왔을 때
                    if(min == -1){
                        min = i+1;
                    }
                    // keymap 배열을 반복하여 돌며 가장 작은 min 을 찾음
                    else if(min > i){
                        min = i+1;
                    }
                    // break; 시 다음 key를 돌게 됨
                    break;
                }
            }
        }
        // 없으면 초기 선언한 -1을 반환
        // 있을 경우 반복문을 돌며 선정된 가장 작은 min 을 반환
        return min;
    }
}