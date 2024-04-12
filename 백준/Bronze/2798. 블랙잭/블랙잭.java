import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		int lastIndex = N-1;
		int midleIndex = lastIndex-1;
		int startIndex = midleIndex-1;
		int max = 0;
		while(true) {
			int sum = arr[lastIndex] + arr[midleIndex] + arr[startIndex];
			if(max< sum && sum<=M) max = sum;
			if(lastIndex == 2)break;
			if(sum == M) break;
			if(startIndex -1 <0) {
				midleIndex --;
				startIndex = midleIndex-1;
				// 0 1 n
				// -1 0 n
				// n-3  n-2  n-1
				if(midleIndex == 0 && lastIndex >= 3) {
					lastIndex--;
					midleIndex = lastIndex-1;
					startIndex = midleIndex-1;
				}
			} else {
				startIndex --;
			}
			
		}
		if(max != 0) {
			bw.write(max+"");
		}
		bw.flush();
		bw.close();
		bw.close();
	}
}
