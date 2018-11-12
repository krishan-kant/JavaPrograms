import java.util.*;
public class dubstep{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int len=s.length();
        String s1="";
        int i=0;
        int l=0;
        while(i<len-2){
            if(s.charAt(i)=='W' && s.charAt(i+1)=='U' && s.charAt(i+2)=='B'){
                l=s1.length();
                if(l>0){
                if(s1.charAt(l-1)!=' ')
                    s1+=' ';
                }
                i+=3;
            }
            else{
                s1+=s.charAt(i);
                i++;
            }
        }
        if(i==len-2){
            s1+=s.charAt(i);
            s1+=s.charAt(i+1);
        }
        else if(i==len-1){
            s1+=s.charAt(i);
        }
        s1=s1.trim();
        System.out.println(s1);
    }
}