import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		String[] arr1 = new String[N];
		for(int i=0; i<N; i++) {
			arr1[i] = br.readLine();
		}
		String[] arr2 = new String[M];
		for(int i=0; i<M; i++) {
			arr2[i] = br.readLine();
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		List<String> list = new ArrayList<>();
		for(int i=0; i<M; i++) {
			if(Arrays.binarySearch(arr1, arr2[i]) >= 0) {
				list.add(arr2[i]);
			}
		}
		bw.write(list.size()+"\n");
		for(int i=0; i<list.size(); i++) {
			bw.write(list.get(i)+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
