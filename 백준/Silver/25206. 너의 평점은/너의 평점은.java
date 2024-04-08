import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		Map<String, Double> map = new HashMap<>();
		map.put("A+", 4.5);
		map.put("A0", 4.0);
		map.put("B+", 3.5);
		map.put("B0", 3.0);
		map.put("C+", 2.5);
		map.put("C0", 2.0);
		map.put("D+", 1.5);
		map.put("D0", 1.0);
		map.put("F", 0.0);
		map.put("P", 0.0);
		double sum = 0;
		int a = 20;
		int sum2 = 0;
		for(int i=0; i<20; i++) {
			st = new StringTokenizer(br.readLine());
			st.nextToken();
			double n1 = Double.parseDouble(st.nextToken());
			String s1 = st.nextToken();
			double n2 = map.get(s1);
			sum += n1*n2;
			if(!s1.equals("P")) {
				sum2 +=n1;
			}
		}
		bw.write(String.valueOf(sum/sum2));
		bw.flush();
		bw.close();
		br.close();
	}
}
