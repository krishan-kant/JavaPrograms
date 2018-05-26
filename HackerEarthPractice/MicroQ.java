import java.util.*;
public class MicroQ {
	int a[];
	int front;
	int rear;
	public MicroQ(int N) {
		a=new int[N];
		front=0;
		rear=0;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int testCase=sc.nextInt();
		MicroQ ob=new MicroQ(testCase);
		char ch;
		int input;
		while(testCase>0) {
			 ch=(sc.next()).charAt(0);
			 switch(ch) {
			 case 'E' :
				 input=sc.nextInt();
				 ob.enqueue(input);
				 break;
			 case 'D' :
				 ob.dequeue();
			 }
			 testCase--;
		}
		sc.close();
	}
	void enqueue(int input) {
		a[rear]=input;
		rear++;
		System.out.println(rear-front);
	}
	void dequeue() {
		if(front==rear)System.out.print("-1 ");
		else {
			System.out.print(a[front]+" ");
			++front;
		}
		System.out.print(rear-front+"\n");
	}
}