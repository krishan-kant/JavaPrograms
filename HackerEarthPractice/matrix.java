import java.util.*;
public class matrix{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		while(tc>0) {
			int count=0;
			int s=sc.nextInt();
			int A[]=new int[(s*s)];
			for(int i=0;i<(s*s);i++)
				A[i]=sc.nextInt();
			for(int i=0;i<(s*s)-1;i++) {
				int j=i;
				int k=i%s;
				while(j<(s*s)) {
					if(A[i]>A[j])count++;
					if((j+1)%s==0)
						j+=(k+1);
					else 
						j++;
				}
			}
			System.out.println(count);
			tc--;
		}
		sc.close();
	}
}