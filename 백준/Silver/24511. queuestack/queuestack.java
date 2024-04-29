import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;
// https://chaeyami.tistory.com/185#hELLO 참고
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		// 자료구조 0: 큐 | 1: 스택
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] qs = new int[N];
		for(int i=0; i<N; i++) {
			qs[i] = Integer.parseInt(st.nextToken());
		}
		// 초기 요소 설정
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// 삽입값 설정
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int[] arr2 = new int[M];
		for(int i=0; i<M; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}
		// LinkedList 에 값 담기
		LinkedList<Integer> ll = new LinkedList<>();
		for(int i=0; i<N; i++) {
			// 자료구조 형태가 큐 일때
			if(qs[i] == 0) {
				// 리스트의 처음에 값을 추가
				ll.addFirst(arr[i]);
			}
		}// 예시 1번 : 4, 1
		
		// 4, 1,   2 ...
		for(int i=0; i<M; i++) {
			ll.add(arr2[i]);
			sb.append(ll.pollFirst()+" ");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
