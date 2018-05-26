import java.util.*;
public class testClass01 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int a[][]=new int[N][2];
		//input
		for(int j=0;j<N;j++) {
			a[j][0]=sc.nextInt();
		}
		for(int j=0;j<N;j++) {
			a[j][1]=sc.nextInt();
		}
		//soting
		int temp;
		for(int j=0;j<N-1;j++) {
			for(int k=0;k<N-j-1;k++) {
				if(a[k+1][0]<a[k][0]) {
					temp=a[k+1][0];
					a[k+1][0]=a[k][0];
					a[k][0]=temp;
					temp=a[k+1][1];
					a[k+1][1]=a[k][1];
					a[k][1]=temp;
				}
			}
		}
		//checking
		int i=0;
		long comb1=0;
		long comb2=Long.MAX_VALUE;
		while(i<N) {
			if(a[i][1]==3) {
				comb2=a[i][0];
				break;
			}
			i++;
		}
		i=0;int min=0;
		while(i<N) {
			if(a[i][1]==1 || a[i][1]==2)
				break;
			i++;
		}
		min=i;
		if(min<N) {
			i=0;
			while(i<N){
				if(a[min][1]==1)
					if(a[i][1]==2)
						break;
				if(a[min][1]==2)
					if(a[i][1]==1)
						break;
				i++;
			}
			if(i==N)comb1=Long.MAX_VALUE;
			else comb1=(a[min][0]+a[i][0]);
			if(comb1<comb2)
				System.out.println(comb1);
			else
				System.out.println(comb2);
		}
		else
			System.out.println(comb2);
		sc.close();
	}
}