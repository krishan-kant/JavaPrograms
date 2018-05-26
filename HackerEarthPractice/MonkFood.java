import java.util.*;
public class MonkFood {
	int s[];
	int top;
	int size;
	public MonkFood(int n) {
		s=new int[n];
		top=-1;
		size=n;
	}
	void push(int n) {
		if(top==size-1)
			System.out.println("Full");
		else
			s[++top]=n;
	}
	void pop() {
		if(top==-1)
			System.out.println("No Food");
		else 
			System.out.println(s[top--]);
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		MonkFood ob=new MonkFood(n);
		while(n>0) {
			int i=sc.nextInt();
			if(i==1)
				ob.pop();
			else {
				int j=sc.nextInt();
				ob.push(j);
			}
			n--;
		}
		sc.close();
	}
}