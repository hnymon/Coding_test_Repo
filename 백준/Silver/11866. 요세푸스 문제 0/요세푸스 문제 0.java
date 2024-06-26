import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int cnt = 0;
		Queue<Integer> q = new LinkedList<>();
		for(int i=1; i<=N; i++) {
			q.add(i);
		}
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		while(true) {
			if(q.size()==1) {
				sb.append(q.poll());
				break;
			}
			cnt ++;
			if(cnt == K) {
				if(q.size()!=1) {
					sb.append(q.poll()+", ");
				}
				cnt = 0;
			} else {
				q.add(q.poll());
			}
		}
		sb.append(">");
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
