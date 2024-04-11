import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

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
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int first = 0;
		int sum = 0;
		for(int i=M; i<=N; i++) {
			if(!prime(i)) {
				if(first==0) {
					first = i;
				}
				sum += i;
			}
		}
		if(first == 0) {
			bw.write(-1+"");
		}else {
			bw.write(sum+"\n");
			bw.write(first+"");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
