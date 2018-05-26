import java.util.*;
public class bubble{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int temp;
		int k=0;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(a[j+1]<a[j]){
					temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
					k++;
				}
			}
		}
		System.out.println(k);
	}
}