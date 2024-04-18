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
		String six = "666";
		int cnt = 0;
		int a = 665;
		while(true) {
			a++;
			if(String.valueOf(a).contains(six)) {
				cnt ++;
			}
			if(cnt == N) break;
		}
		bw.write(a+"");
		bw.flush();
		bw.close();
		bw.close();
	}
}
