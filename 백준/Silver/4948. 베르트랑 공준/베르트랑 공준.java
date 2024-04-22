import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	// true : 소수 | false : 소수 아님
	public static boolean prime(int n) {
		if(n<2) {
			return false;
		}
		if(n==2) {
			return true;
		}
		for(int i=2; i<=Math.sqrt(n); i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while(true) {
			int n = Integer.parseInt(br.readLine());
			int cnt = 0;
			if(n == 0) {
				break;
			} else {
				for(int i=n+1; i<=2*n; i++) {
					if(prime(i)) {
						cnt++;
					}
				}
				bw.write(cnt+"\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
