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
		StringTokenizer st;
		String[] arr = {"factor","multiple","neither"};
		while(true) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if(a==0 && b==0) {
				break;
			}
			if(b%a ==0)bw.write(arr[0]+"\n");
			else if(a%b==0)bw.write(arr[1]+"\n");
			else bw.write(arr[2]+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
