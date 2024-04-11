import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] arr = new int[2];
		int[][] v = new int[3][2];
		for(int i=0; i<3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<2; j++) {
				v[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		// XOR 연산자인 ^ 를 사용하여 빠져있는 좌표값을 고름
		arr[0] = v[0][0] ^ v[1][0] ^ v[2][0];
        arr[1] = v[0][1] ^ v[1][1] ^ v[2][1];
        bw.write(arr[0]+" "+arr[1]);
		bw.flush();
		bw.close();
		br.close();
	}
}
