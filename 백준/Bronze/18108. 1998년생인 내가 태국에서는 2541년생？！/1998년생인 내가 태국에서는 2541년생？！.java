import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int byear = Integer.parseInt(br.readLine());
		int year = byear - 543;
		System.out.println(year);
		br.close();
	}
}
