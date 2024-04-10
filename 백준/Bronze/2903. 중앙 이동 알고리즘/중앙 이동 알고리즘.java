import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// 단계 : 0 > 1 > 2  > 3
		// 2제  : 0 > 2 > 4  > 8
		// 네모 : 1 > 4 > 16 > 256
		// 결과 : 4 > 9 > 25 > 81 
		// 결근 : 2 > 3 > 5  > 9   > 17 > 33
		//          1   2    4    8    16
		int a = Integer.parseInt(br.readLine());
		int b = 2;
		for(int i=0; i<a; i++) {
			b+= Math.pow(2, i);
		}
		bw.write(String.valueOf((int)Math.pow(b, 2)));
		bw.flush();
		bw.close();
		br.close();
	}
}
