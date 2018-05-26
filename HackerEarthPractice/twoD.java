import java.util.*;
public class twoD {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int A[][]=new int[x][y];
		for(int i=0;i<x;i++)
			for(int j=0;j<y;j++)
				A[i][j]=sc.nextInt();
		for(int j=0;j<y;j++){
			for(int i=0;i<x;i++)
				System.out.print(A[i][j]+" ");
			System.out.println();
		sc.close();
		}
	}
}