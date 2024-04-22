import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		br.close();
		// 간격들의 최대공약수
		int gcd = 0;
		for(int i=0; i<N-1; i++) {
			int d = arr[i+1] - arr[i];
			gcd = gcd(d, gcd);
		}
		// 전체 나무 수 - 처음 나무 수       
		bw.write((arr[N-1]-arr[0])/gcd+1 - arr.length+"");
		bw.flush();
		bw.close();
	}
	// 최대공약수
	public static int gcd(int n1, int n2) {
		while(n2!=0) {
			int n = n1%n2;
			n1 = n2;
			n2 = n;
		}
		return n1;
	}
}
