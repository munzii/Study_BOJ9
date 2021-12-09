import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P3009 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int x=0;
		int y=0;
		st= new StringTokenizer(br.readLine());
		int x1 = Integer.parseInt(st.nextToken());
		int y1 = Integer.parseInt(st.nextToken());
		
		st= new StringTokenizer(br.readLine());
		int x2 = Integer.parseInt(st.nextToken());
		int y2 = Integer.parseInt(st.nextToken());
		
		st= new StringTokenizer(br.readLine());
		int x3 = Integer.parseInt(st.nextToken());
		int y3 = Integer.parseInt(st.nextToken());
		
		if(x1==x2) {
			x=x3;
		}
		else if(x2==x3) {
			x=x1;
		}
		else x=x2;
		
		if(y1==y2) {
			y=y3;
		}
		else if(y2==y3) {
			y=y1;
		}
		else y=y2;
		
		bw.write(String.valueOf(x +" " + y));
		
		br.close();
		bw.flush();
		bw.close();

	}

}