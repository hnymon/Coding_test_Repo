import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		String[] arr = new String[N];
		for(int i=0; i<N; i++) {
			arr[i] = br.readLine();
		}
		Arrays.sort(arr, (o1, o2) -> o1.length() - o2.length());
		Arrays.sort(arr, (o1, o2) -> Integer.parseInt(o1.split(" ")[0]) - Integer.parseInt(o2.split(" ")[0]));
		for(int i=0; i<N; i++) {
			bw.write(arr[i]+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
