class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        // 페인트 배열
        // 다시 칠 : 1
        int[] arr = new int[n];
        for (int i = 0; i < section.length; i++) {
            arr[section[i] - 1] = 1;
        }
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == 1) {
                answer++;
                for (int j = i; j >= Math.max(0, i - m + 1); j--) {
                    arr[j] = 0;
                }
            }
        }
        return answer;
    }
}
