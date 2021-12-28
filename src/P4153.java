import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P4153 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if(a == 0 && b == 0 && c == 0) break;
			
			if((a*a+b*b) == c*c) {
				bw.write("right"+"\n");
			}
			else if(a*a == (b*b+c*c)) {
				bw.write("right"+"\n");
			}
			else if(b*b==(a*a+c*c)) {
				bw.write("right"+"\n");
			}
			else {
				bw.write("wrong"+"\n");
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
		

	}

}