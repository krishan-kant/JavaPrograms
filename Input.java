package codechef;
import java.util.*;
class Input {
		 public static void main(String args[]) {
			 try{
			 Scanner sc=new Scanner(System.in);
			 int n=sc.nextInt();
			 int k=sc.nextInt();
			 int t=0,c=0;
			 if(k<(Math.pow(10,7))){
				 for(int i=0;i<n;i++) {
					 t=sc.nextInt();
				 	if(t%k==0)
				 		c++;
				 }
				 System.out.println(c);
			 }
			 else
				 System.out.println("Invalid input");
			 }
			 catch(Exception e) {
				 System.out.println("Input Error");
}}}