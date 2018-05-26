import java.util.*;
public class Nqueen {
	int board[][];
	int N1;
	public Nqueen(int i,int j) {
		board=new int[i][j];
		N1=i;
	}
	boolean isAttacked(int x,int y) {
		for(int i=0;i<N1;i++)
			if(board[i][y]==1)
				return true;
		for(int i=0;i<N1;i++)
			if(board[x][i]==1)
				return true;
		for(int i=0;i<N1;i++) {
			for(int j=0;j<N1;j++) {
				if(i+j==x+y)
					if(board[i][j]==1)
						return true;
				if(i-j==x-y)
					if(board[i][j]==1)
						return true;
			}
		}
		return false;		
	}
	boolean N_queen(int N) {
		if(N==0)
			return true;
		for(int i=0;i<N1;i++) {
			for(int j=0;j<N1;j++) {
				if(isAttacked(i,j))
					continue;
				board[i][j]=1;
				if(N_queen(N-1))
					return true;
				board[i][j]=0;
			}
		}
		return false;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int i=N,j=N;
		Nqueen ob=new Nqueen(i,j);
		for(i=0;i<N;i++)
			for(j=0;j<N;j++)
				ob.board[i][j]=0;
		if(ob.N_queen(i)) {
			System.out.println("YES");
			for(i=0;i<N;i++) {
				for(j=0;j<N;j++)
					System.out.print(ob.board[i][j]+" ");
				System.out.println();
			}
		}
		else
			System.out.println("NO");
		sc.close();
	}
} 