class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        char[][] A = new char[park.length][park[0].length()];
        int q = 0;
        int w = 0;
        for(int i = 0; i < park.length; i++){
            for(int j = 0; j < park[0].length(); j++){
                A[i][j] = park[i].charAt(j);
                if(A[i][j] == 'S'){
                    answer[0] = i; // 세로
                    answer[1] = j; // 가로
                }
            }
        }
        for(String route : routes) {
            char d = route.charAt(0);
            int v = Integer.parseInt(route.substring(2,3));
            boolean a = true;
            int qr = answer[0];
            int wr = answer[1];
            for(int j = 0; j < v; j++){
                if(d == 'E'){
                    if(wr + 1 < A[0].length && A[qr][wr+1] != 'X'){
                        wr++;  
                    } else {
                        a = false;
                        break;
                    }
                } 
                if(d == 'W'){
                    if(wr - 1 >= 0 && A[qr][wr-1] != 'X'){
                        wr--;    
                    }else {
                        a = false;
                        break;
                    }
                } 
                if(d == 'S'){
                    if(qr + 1 < A.length && A[qr+1][wr] != 'X'){
                        qr++;    
                    }else {
                        a = false;
                        break;
                    }
                } 
                if(d == 'N') {
                    if(qr - 1 >= 0 && A[qr-1][wr] != 'X'){
                        qr--;
                    }else {
                        a = false;
                        break;
                    }
                }
            }
            if(a){
                answer[0] = qr;
                answer[1] = wr;
            }
        }
        return answer;
    }
}