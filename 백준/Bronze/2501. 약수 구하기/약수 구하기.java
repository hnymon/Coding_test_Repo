import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int cnt = 0;
		for(int i=0; i<N; i++) {
			if(N%(i+1)==0) {
				cnt++;
			}
			if(cnt == K) {
				bw.write(String.valueOf(1+i+""));
				break;
			}
		}
		if(cnt < K) {
			cnt = 0;
			bw.write(String.valueOf(0+""));
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
