import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		Map<Integer, Integer> map = new HashMap<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			int n = Integer.parseInt(st.nextToken());
			if(map.get(n) == null) {
				map.put(n, 1);
			}else {
				map.put(n, map.get(n)+1);
			}
		}
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<M; i++) {
			int n2 = Integer.parseInt(st.nextToken());
			if(map.get(n2) != null) {
				bw.write(map.get(n2)+" ");
			} else {
				bw.write(0+" ");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
