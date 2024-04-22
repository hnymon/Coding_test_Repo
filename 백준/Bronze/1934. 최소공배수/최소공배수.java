import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	// 최소공배수는 (n1 * n2) / 최대공약수
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			int n1 = Integer.parseInt(st.nextToken());
			int n2 = Integer.parseInt(st.nextToken());
			bw.write(n1*n2/gcd(n1,n2)+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
    // 최소 공배수 구하는 알고리즘
	// 숫자 2개를 받음
	// n1 % n2 == 0이면 n2 를 return
	// 그렇지 않을 경우 다시 n2, n1%n2 를 인자로 메서드를 진행
	// ex 6 10
	// 6 % 10 == 0 아니므로 
	// 10, 6 를 넣어서 진행
	// 10 % 6 == 0 아니므로
	// 6, 4 진행
	// 6 % 4 == 0 아님
	// 4, 2 진행 
	// 4 % 2 == 0 이므로 2를 return
	public static int gcd(int n1, int n2) {
		if(n1 % n2 == 0) {
			return n2;
		}
		return gcd(n2, n1%n2);
	}
}
