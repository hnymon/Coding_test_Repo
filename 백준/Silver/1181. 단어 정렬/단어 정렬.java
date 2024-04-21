import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		Set<String> set = new HashSet<>();
		for(int i=0; i<N; i++) {
			set.add(br.readLine());
		}
		String[] arr = new String[set.size()];
		Iterator<String> iterSet = set.iterator();
		int cnt = 0;
		while(iterSet.hasNext()) {
			arr[cnt] = iterSet.next();
			cnt++;
		}
		Arrays.sort(arr);
		Arrays.sort(arr, (o1, o2) -> o1.length() - o2.length());
		for(int i=0; i<arr.length; i++) {
			bw.write(arr[i]+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
