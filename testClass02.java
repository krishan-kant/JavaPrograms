import java.util.*;
class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		Main ob=new Main();
		while(tc>0) {
			int m=sc.nextInt();
			int n=sc.nextInt();
			for(int i=m;i<=n;i++) {
				if(ob.isPrime(i))
					System.out.println(i);
			}
			System.out.println();
			tc--;
		}
	}
	boolean isPrime(int n){
		for(int i=2;i<n/2;i++)
			if(n%i==0)
				return false;
		return true;
	}
}