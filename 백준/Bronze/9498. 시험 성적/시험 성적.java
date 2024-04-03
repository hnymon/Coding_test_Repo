import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int s = Integer.parseInt(br.readLine());
		if(s>=90) System.out.println("A");
		else if(s>=80) System.out.println("B");
		else if(s>=70) System.out.println("C");
		else if(s>=60) System.out.println("D");
		else System.out.println("F");
		br.close();
	}
}
