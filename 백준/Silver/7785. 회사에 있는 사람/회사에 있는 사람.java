import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		Set<String> set = new HashSet<>();
		for(int i=0; i<N; i++) {
			String s = br.readLine();
			String name = s.split(" ")[0];
			String el = s.split(" ")[1];
			if(el.equals("enter")) {
				set.add(name);
			} else {
				set.remove(name);
			}
		}
		String[] arr = new String[set.size()];
		Iterator<String> it = set.iterator();
		int idx = 0;
		while(it.hasNext()) {
			arr[idx] = it.next();
			idx ++;
		}
        // 사전 역순 정렬
		Arrays.sort(arr, Collections.reverseOrder());
		for(int i=0; i<arr.length; i++) {
			bw.write(arr[i]+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
