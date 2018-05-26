package compeCoder;
import java.util.*;
public class TestClass {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int testcase=sc.nextInt();
	while(testcase>0) {
	int n=sc.nextInt();
	int m=sc.nextInt();
	if(n>m)
		System.out.println("No");
	else {
		if(m%n==0)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
	testcase--;
	}
	sc.close();
	}
}