import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	// 범위인 1,000,000 까지 배열 미리 만들기
	static boolean[] primeArr = new boolean[1000001];
	// 소수 판별 배열 만들기
	// 소수 false; 소수x true;
	public static void findPrime() {
		// 0, 1 은 소수 x
		primeArr[0] = primeArr[1] = true;
		// 골드바흐의 추측 : 소수 구하기
		for(int i=2; i<primeArr.length; i++) {
			// i를 소수로 초기 설정
			if(primeArr[i] == false) {
				// i의 배수들을 소수에서 제외
				for(int j=2; i*j<primeArr.length; j++) {
					primeArr[i*j] = true;
				}
			}
		}
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// 소수 배열 method 실행
		findPrime();
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			int cnt = 0;
			int N = Integer.parseInt(br.readLine());
			// 순서만 다를 경우 같은 파티션이므로 n/2
			for(int j=2; j<=N/2; j++) {
				// j, n-j 가 둘 다 소수이면서 합이 n일 때
				if(!primeArr[j]) {
					if(!primeArr[N-j]) {
						cnt++;
					}
				}
			}
			bw.write(cnt+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}

