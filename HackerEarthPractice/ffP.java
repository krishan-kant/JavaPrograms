import java.util.*;
class ffP{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int s=0;
        int i=sc.nextInt();
        for(int j=0;j<i;j++){
            int n=sc.nextInt();
            int x=sc.nextInt();
            for(int k=0;k<n;k++){
                s+=sc.nextInt();
            }
            if(s%x==0)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}