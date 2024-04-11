import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		List<Integer> list;
		while(true) {
			list = new ArrayList<>();
			int a = Integer.parseInt(br.readLine());
			if(a==-1) break;
			int sum =0;
			bw.write(a+" ");
			String s = "";
			for(int i=1; i<a; i++) {
				if(a%i==0) {
					sum += i;
					list.add(i);
				}
			}
			if(sum == a) {
				bw.write("= ");
				for(int i=0; i<list.size(); i++) {
					if(i==list.size()-1) {
						bw.write(list.get(i)+"");
					}else {
						bw.write(list.get(i)+" + ");
					}
				}
				bw.newLine();
			}else {
				bw.write("is NOT perfect."+"\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
