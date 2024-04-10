import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 거리          차이
		//  1 : 2 ~ 7   : 6
		//  2 : 8 ~ 19  : 12
		//  3 : 20 ~ 37 : 18
		//  4 : 38 ~ 61	: 24
		int a = Integer.parseInt(br.readLine());
		int cnt = 2;
		int start = 2;
		int end = 7;
		while(true) {
			if(a==1) {
				bw.write(1+"");
				break;
			}
			if(a>= start && a<= end) {
				bw.write(cnt+"");
				break;
			}else {
				start = end +1;
				end = end+cnt*6;
				cnt ++;
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
