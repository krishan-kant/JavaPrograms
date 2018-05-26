import java.util.*;
public class modsort {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[][]=new int[n][2];
		for(int i=0;i<n;i++) {
			a[i][0]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			a[i][1]=a[i][0]%k;
		}
		int temp;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(a[j+1][1]<a[j][1]){
					temp=a[j+1][0];
					a[j+1][0]=a[j][0];
					a[j][0]=temp;
					temp=a[j+1][1];
					a[j+1][1]=a[j][1];
					a[j][1]=temp;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(a[i][0]+" ");
		}
		sc.close();
	}
}
