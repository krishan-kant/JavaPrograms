import java.util.*;
public class pallindrome {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		int flag=0;
		while(tc>0) {
			String s=sc.next();
			for(int i=0;i<((s.length()/2));i++) {
				if(s.charAt(i)!=s.charAt(s.length()-i-1))
					flag=1;
			}
			if(flag==1)
				System.out.println("NO");
			else {
				System.out.print("YES ");
				if(s.length()%2==0)
					System.out.print("EVEN");
				else
					System.out.print("ODD");
			}
			System.out.println();
			tc--;
			flag=0;
		}
		sc.close();
	}
}