import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 1 4 9 16 25
// 1 2 3  4  5 
// 제곱을 기준으로 1개 씩 증가

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		for(int i=1; i*i<=N; i++) {
			cnt++;
		}
		bw.write(cnt+"");
		bw.flush();
		bw.close();
		br.close();
	}
}
