import java.util.*;
public class right {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		while(tc>0) {
		int n=sc.nextInt();
		int k=sc.nextInt();
		int A[]=new int[n];
		for(int i=0;i<n;i++)
			A[i]=sc.nextInt();
		for(int i=n-k;i<n;i++)
			System.out.print(A[i]+" ");
		for(int i=0;i<n-k;i++)
			System.out.print(A[i]+" ");
		System.out.println();
		tc--;
		}
		sc.close();
	}
}