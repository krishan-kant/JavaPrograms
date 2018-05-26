import java.util.*;
public class remFri {
	int a[];
	public remFri(int size) {
		a=new int[size];
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int testCase=sc.nextInt();
		int orsize;
		int size;
		while(testCase>0) {
			orsize=sc.nextInt();
			size=orsize;
			remFri ob=new remFri(size);
			int rem=sc.nextInt();
			for(int i=0;i<size;i++)
				ob.a[i]=sc.nextInt();
			for(int i=0;i<size-1;i++) {
				for(int j=0;j<size-1;j++) {
					if(ob.a[j]<ob.a[j+1]) {
						for(int k=j;k<size-1;k++)
							ob.a[k]=ob.a[k+1];
						--size;
					}
					if(orsize-size==rem)
						break;
				}
			}
			for(int i=0;i<size;i++)
				System.out.print(ob.a[i]+" ");
			System.out.println();
			testCase--;
		}
		sc.close();
	}
}