import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine())/4;
		for(int i=0; i<a; i++) {
			System.out.print("long ");
			if(i == a-1) System.out.println("int");
		}
		br.close();
	}
}
