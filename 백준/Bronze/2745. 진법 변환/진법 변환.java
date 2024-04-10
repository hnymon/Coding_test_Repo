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
		String N = st.nextToken();
		int B = Integer.parseInt(st.nextToken());
		// 새로 알게된 것
		// Integer.parseInt(a, b) 문자열 a를 b 진법으로 변환
		bw.write(String.valueOf(Integer.parseInt(N, B)));
		bw.flush();
		bw.close();
		br.close();
	}
}