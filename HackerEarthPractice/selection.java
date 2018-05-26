import java.util.*;
public class selection {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int x=sc.nextInt();
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int flag=0;
		int k=-1;
		int temp;int j;
		int minimum=0;
		for(int i=0;i<n-1;i++) {
			flag+=1;
			minimum=a[i];
			for(j=i;j<n;j++) {
				if(a[j]<minimum) {
					minimum=a[j];
					k=j;
				}
			}
			if(k!=-1) {
			temp=a[k];
			a[k]=a[i];
			a[i]=temp;
			}
			k=-1;
			if(flag==x)break;
		}
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		sc.close();
	}
}