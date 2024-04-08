import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		String[] arr = s.split("");
		int sum = arr.length;
		for(int i=0; i<arr.length; i++) {
			if(arr[i].charAt(0)>='P' && arr[i].charAt(0) <='S') {
				sum += 7;
			}
			else if(arr[i].charAt(0)>='W' && arr[i].charAt(0) <='Z') {
				sum += 9;
			} else if(arr[i].charAt(0)>='T' && arr[i].charAt(0) <='V') {
				sum += 8;
			} else {
				sum += ((int)arr[i].charAt(0)-65)/3 +2;
			}
		}
		bw.write(sum+"");
		bw.flush();
		bw.close();
		br.close();
	}
}
