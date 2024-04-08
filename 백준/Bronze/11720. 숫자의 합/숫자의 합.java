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
		String s = br.readLine();
		int[] arr = new int[N];
		int max = 0;
		for(int i=0; i<N; i++) {
			arr[i] = s.charAt(i)-'0';
			max += arr[i];
		}
		bw.write(String.valueOf(max));
		bw.flush();
		bw.close();
		br.close();
	}
}
