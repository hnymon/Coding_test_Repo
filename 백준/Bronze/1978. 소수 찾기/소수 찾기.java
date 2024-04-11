import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	// true : 소수 x / false : 소수
	public static boolean prime(int n) {
		if(n==1) return true;
		for(int i=2; i<n; i++) {
			if(n%i==0) return true;
		}
		return false;
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int res = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			int a = Integer.parseInt(st.nextToken());
			if(!prime(a)) {
				res ++;
			}
		}
		bw.write(String.valueOf(res));
		bw.flush();
		bw.close();
		br.close();
	}
	
}
