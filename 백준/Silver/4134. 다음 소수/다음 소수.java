import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		for(int i=0; i<N; i++) {
			long n = Long.parseLong(br.readLine());
			// 0 1 2 는 가장 크거나 같은 소수는 2
			if(n==0||n==1||n==2) {
				bw.write(2+"\n");
				continue;
			}
			while(true) {
				int res = 0;
				// 해당 수의 제곱까지 하는 이유는 제곱일 경우 반드시 그 수는 약수가 됨
				for(long j=2; j<Math.sqrt(n)+1; j++) {
					if(n%j == 0) {
						res++;
						break;
					}
				}
				if(res ==0) {
					bw.write(n+"\n");
					break;
				}
				// 계속 n++ 을 해줘서 다음 숫자를 확인
				n++;
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
	
}
