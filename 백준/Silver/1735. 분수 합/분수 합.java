import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	// 최대공약수
	public static long gcd(long n1, long n2) {
		if(n1%n2==0) {
			return n2;
		}
		return gcd(n2, n1%n2);
	}
	// 최소공배수
	public static long lcm(long n1, long n2) {
		return n1*n2/gcd(n1,n2);
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		// 첫 번째 수의 분자 분모
		long nc1 = Long.parseLong(st.nextToken());
		long np1 = Long.parseLong(st.nextToken());
		st = new StringTokenizer(br.readLine());
		// 두 번째 수의 분자 분모
		long nc2 = Long.parseLong(st.nextToken());
		long np2 = Long.parseLong(st.nextToken());
		// 분모들의 최소공배수 구하기
		long nLCM = lcm(np1,np2);
		// 각 분자들에 곱해줘야 할 수
		// 최소공배수 / 분모
		long nc1m = nLCM/np1;
		long nc2m = nLCM/np2;
		// 기약분수 만들기
		// 분자와 분모를 최대공약수로 나눠주기
		long rc = (nc1*nc1m)+(nc2*nc2m);
		long rGCD = gcd(rc, nLCM);
		bw.write(rc/rGCD + " " + nLCM/rGCD);
		bw.flush();
		bw.close();
		br.close();
	}
}

