import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = Integer.parseInt(br.readLine());
		int type = Integer.parseInt(br.readLine());
		int sum = 0;
		for(int i=0; i<type; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int price = Integer.parseInt(st.nextToken());
			int count = Integer.parseInt(st.nextToken());
			int pc = price*count;
			sum += pc;
		}
		if(total == sum) System.out.println("Yes");
		else System.out.println("No");
		br.close();
	}
}
