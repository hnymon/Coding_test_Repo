import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int[][] xy = new int[N][2];
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			xy[i][0] = Integer.parseInt(st.nextToken());
			xy[i][1] = Integer.parseInt(st.nextToken());
		}
		// 첫 번째 기준으로 오름차순 정렬 
		Arrays.sort(xy, Comparator.comparingInt((int[] o) -> o[0]));
		// 두 번째 기준으로 오름차순 정렬
		Arrays.sort(xy, Comparator.comparingInt((int[] o) -> o[1]));
		for(int i=0; i<N; i++) {
			bw.write(xy[i][0]+" "+xy[i][1]+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
