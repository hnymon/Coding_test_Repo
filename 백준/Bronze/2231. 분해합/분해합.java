import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<>();
		for(int i=1; i<N; i++) {
			String sn = ts(i);
			int sum = 0;
			for(int j=0; j<sn.length(); j++) {
				sum += sn.charAt(j)-'0';
			}
			if(Integer.parseInt(sn)+sum == N) {
				list.add(i);
			}
		}
		Collections.sort(list);
		if(list.isEmpty()) {
			bw.write(0+"");
		}else {
			bw.write(list.get(0)+"");
		}
		bw.flush();
		bw.close();
		bw.close();
	}
	public static String ts(int N) {
        // 기저 사례 : N이 한 자리 수인 경우
        if (N < 10) {
            return Integer.toString(N);
        }
        // 현재 자리의 숫자를 문자열로 변환하여 반환
        int digit = N % 10;
        return ts(N / 10)+""+digit;
    }

}
