import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		Set<String> set = new HashSet<>();
		for(int i=0; i<s.length(); i++) {
			String c = "";
			for(int j=i; j<s.length(); j++) {
				c += s.charAt(j);
				set.add(c);
			}
		}
		bw.write(set.size()+"");
		bw.flush();
		bw.close();
		br.close();
	}
}
