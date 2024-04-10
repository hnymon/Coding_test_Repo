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
		int a = 1;
		int b = 1;
		boolean c = true;
		// 처음 a==1, b==1 : b++
		
		// true 흐름 a==1
		// if b-- 0 아니라면 a++ b--
		// else if b-- 0 일때 {
		//		a++;
		//      false 흐름 변환
		//	}
		// 
		
		// false 흐름 b==1일때		
		// if a-- 0 아니라면 a-- b++
		// else if a-- 0 일때 {
		//		b++;
		//      true 흐름 변환
		//	}
		//
		for(int i=0; i<N-1; i++) {
			if(i==0) {
				b++;
				continue;
			}
			if(c) {
				if(b-1 != 0) {
					a++;
					b--;
				} else if(b-1 ==0) {
					a++;
					c = false;
				}
			} else{
				if(a-1 != 0) {
					b++;
					a--;
				} else if(a-1 ==0) {
					b++;
					c = true;
				}
			}
		}
		bw.write(a+"/"+b);
		bw.flush();
		bw.close();
		br.close();
	}
}
