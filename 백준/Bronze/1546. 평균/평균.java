import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		double[] arr = new double[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		double max = 0;
		for(int i=0; i<N; i++) {
			arr[i] = Double.parseDouble(st.nextToken());
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		double sum = 0;
		for(int i=0; i<N; i++) {
			arr[i] = arr[i]/max*100;
			sum += arr[i];
		}
		bw.write(sum/N+"");
		bw.flush();
		bw.close();
		br.close();
	}
}
