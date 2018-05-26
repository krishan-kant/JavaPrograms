package compeCoder;
import java.util.*;
public class prob4 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int testcase=sc.nextInt();
		while(testcase>0){
			String s=sc.next();
			int N=s.length();
			for(int i = 0;i < (1 << N); ++i){
	            for(int j = 0;j < N;++j)
	                if((i & (1 << j))) 
	                    System.out.println(s.charAt(j));
	            System.out.println();  
	        }
			testcase--;
		}
		sc.close();
	}
}