import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;
// 범위가 매우 큼
// >> int, long 의 범위보다 최대 크기가 크므로
// BigInteger 을 사용
public class Main {
	public static BigInteger factorial(BigInteger num) {
		if(num.equals(BigInteger.valueOf(1))||num.equals(BigInteger.valueOf(0))) return BigInteger.valueOf(1);
		return num.multiply(factorial(num.subtract(BigInteger.valueOf(1))));
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st ;
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			bw.write(factorial(BigInteger.valueOf(M)).divide(factorial(BigInteger.valueOf(M-N)).multiply(factorial(BigInteger.valueOf(N))))+ "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
