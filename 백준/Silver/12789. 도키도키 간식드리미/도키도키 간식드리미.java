import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 큐에 번호표를 넣고, 스택에는 순서대로 빼면서 확인
        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(st.nextToken());
            q.add(n);
        }
        int next = 1; // 다음에 기대하는 번호표
        while (!q.isEmpty()) {
            int current = q.poll();
            if (current == next) {
                next++;
            } else {
                s.push(current);
            }
            // 스택이 비어있지 않고, 다음으로 기대하는 번호표가 스택 맨 위에 있으면 처리
            while (!s.isEmpty() && s.peek() == next) {
            	// 같을 경우 최상단 삭제
                s.pop();
                // while문을 종료, 다음 단계를 위해 ++
                next++;
            }
        }
        // 스택이 비어있으면 모든 학생들이 순서대로 줄을 서 있음
        if (s.isEmpty()) {
            bw.write("Nice");
        } else {
            bw.write("Sad");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
