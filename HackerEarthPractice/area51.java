package hackerearth;
import java.util.*;
import java.io.*;
public class area51 {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine()); 
		while(t!=0) {
			String x=br.readLine();
			StringTokenizer str=new StringTokenizer(x," ");
			long n=Long.parseLong(str.nextToken());
			long k=Long.parseLong(str.nextToken());
			long ans=1;
			for(int i=0;i<=n;i++) {
				if(i%k!=0)
					ans*=(i%k);
				ans%=k;
			}
			System.out.println(ans);
			t--;
		}
	}
}
