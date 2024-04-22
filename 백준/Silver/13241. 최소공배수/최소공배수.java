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
		long n1 = Integer.parseInt(st.nextToken());
		long n2 = Integer.parseInt(st.nextToken());
		// 최대공약수 : n1*n2/최소공배수
		bw.write(n1*n2/gcd(n1,n2)+"");
		bw.flush();
		bw.close();
		br.close();
	}
	// 최소공배수를 구하는 공식
	public static long gcd(long n1, long n2) {
		if(n1 % n2 == 0) {
			return n2;
		}
		return gcd(n2, n1%n2);
	}
}
