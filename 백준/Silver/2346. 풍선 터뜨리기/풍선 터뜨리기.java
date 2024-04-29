import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		LinkedList<int[]> ll = new LinkedList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		// {1,3}, {2,2}, ...
		for(int i=0; i<N; i++) {
			ll.add(new int[] {i+1, Integer.parseInt(st.nextToken())});
		}
		// 처음 풍선 인덱스 설정
		int idx = 0;
		while(ll.size() != 1) {
			// 이동방향 설정
			int m = ll.get(idx)[1];
			int s = ll.size() -1;
			// 풍선 번호 추가
			sb.append(ll.get(idx)[0]).append(" ");
			// ll에서 해당 인덱스 삭제
			ll.remove(idx);
			// 다음 인덱스 설정을 위해 --
			if(m>0) m--;
			// 다음 인덱스 설정
			idx = (idx+m) % s;
			// 음수일 경우 ll의 크기만큼 더해줌
			if(idx < 0) {
				idx += s;
			}
		}
		sb.append(ll.get(0)[0]);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
