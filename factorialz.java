package codechef;
import java.util.*;
class Factorial{
	int A[]=new int[250];
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num;
		Factorial ob=new Factorial();
		for(int i=0;i<n;i++) {
			num=sc.nextInt();
			ob.initialize();
			ob.fac(num);
			ob.print();
		}
	}
	void fac(int num) {
		int s=1,j=0,i,k=0,copy;
		A[0]=1;
		for(i=1;i<=num;i++) {
			j=0;
				while(A[j]!=-1) {
					s=A[j]*i;
					s+=k;
					A[j]=s%10;
					k=s/10;
					j++;
				}
				while((A[j]==-1)&&(k!=0)) {
					copy=k;
					A[j]=(k%10);
				}
		}
	}
	void initialize() {
		for(int i=0;i<250;i++)
			A[i]=-1;
	}
	void print() {
		int i=0;
		while(A[i]!=-1) 
			i++;
		--i;
		while(i>-1) {
			System.out.print(A[i]);
			i--;
		}
	}
}