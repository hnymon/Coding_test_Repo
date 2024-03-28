class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        // 페인트 배열
        // 다시 칠 : 1
        int[] arr = new int[n];
        for(int i=0; i<section.length; i++){
            arr[section[i]-1] = 1;
        }
        for(int i=0; i<n; i++){
            if(arr[i] == 1) {
                answer++; // 페인트칠을 해야 하는 구간이 시작될 때마다 횟수 증가
                for(int j=i; j<Math.min(i+m, n); j++) {
                    arr[j] = 0; // 구간을 다시 칠하고 페인트 배열을 0으로 초기화
                }
            }
        }
        return answer;
    }
}
