package codechef;
import java.util.*;
public class Atm {
			public static void main(String arg[]) {
				try {
					    Scanner sc=new Scanner(System.in);
					    //taking input in n and max
						int n=sc.nextInt();
						float max=sc.nextFloat();
						//cheking if inputs are valid
						if((0<n&&n<=2000)&&(0.00<max&&max<=2000.00))
						{
							if((n+.5)>max||n%5!=0)
								System.out.printf("%.2f",max);
							else
								System.out.printf("%.2f",(max-n-.50));
						}//printing output upto two decimal places
						else
							System.out.println("Invalid Input");
				}
				catch(Exception e) {
					System.out.println("Input Error");
}}}