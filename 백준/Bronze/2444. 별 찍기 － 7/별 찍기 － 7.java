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
		for(int i=0; i<2*N-1; i++) {
			// 공백
			if(i<N) {
				for(int j=0; j<N-i-1; j++) {
					bw.write(" ");
				}
				for(int j=0; j<i*2+1; j++) {
					bw.write("*");
				}
				bw.newLine();
			}
			else {
				for(int j=0; j<=i-N; j++) {
					bw.write(" ");
				}
				for(int j=0; j<2*N-3-2*(i-N); j++) {
					bw.write("*");
				}
				bw.newLine();
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
