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
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		int day = (v-a)/(a-b);
		// 나머지 0 : 딱떨어짐 +1 만 하면 됨
		// 나머지 존재 : 낮에 하루 더 이동이므로 day ++
		if((v-a)%(a-b) != 0) {
			day ++;
		}
		bw.write(String.valueOf(day+1));
		bw.flush();
		bw.close();
		br.close();
	}
}
