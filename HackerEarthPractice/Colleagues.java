import java.util.*;
public class Colleagues {
	int roll[];
	String names[];
	public Colleagues(int size) {
		roll=new int[size];
		names=new String[size];
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		Colleagues ob=new Colleagues(input);
		int n=input;
		for(int i=0;i<n;i++) {
			ob.roll[i]=sc.nextInt();
			ob.names[i]=sc.next();
		}
		int n1,index;
		int copy=n;
		while(copy>0) {
			n1=sc.nextInt();
			index=ob.index(n1,n); 
			System.out.println(ob.names[index]);
			copy--;
		}
		sc.close();
	}
	int index(int n,int size) {
		for(int i=0;i<size;i++)
			if(roll[i]==n)
				return i;
		return 0;
	}
}