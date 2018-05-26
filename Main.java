import java.util.*;
class Main{
		public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			int tc=sc.nextInt();
			while(tc>0) {
				int m=sc.nextInt();
				int n=sc.nextInt(); 
				for(int i=0;i<m;i++) {
					for(int j=0;j<n;j++) {
						if(i==0 || j==0 || i==(m-1) || j==(n-1))
							System.out.print("*");
						else
							System.out.print(".");
					}
					System.out.println();
				}
				System.out.println();
				tc--;
			}
			sc.close();
		}
}