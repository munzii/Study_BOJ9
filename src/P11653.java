import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P11653 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		
		for(int i=2; i<=n; i++) {
			while(n%i==0) {
				bw.write(String.valueOf(i+"\n"));
				n/=i;
			}
		}
		
		if(n!=1) {
			bw.write(String.valueOf(n));
		}
		
		br.close();
		bw.flush();
		bw.close();

	}

}