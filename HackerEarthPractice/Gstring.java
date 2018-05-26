import java.util.*;
public class Gstring {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		Gstring ob=new Gstring();
		int flag=0,c=0,max=0;
		for(int i=0;i<s.length();i++){
			if(flag==1){
				if(ob.isVovel(s.charAt(i))) {
					++c;
					if(max<c)max=c;
				}
				else {
					if(max<c)max=c;
					flag=0;
					c=0;
				}
			}
			else
				if(ob.isVovel(s.charAt(i))) {
					flag=1;
					++c;
				}
		}
		if(max==0 || ob.isVovel(s.charAt((s.length()-1))))max=1;
		System.out.println(max);	
		sc.close();
	}
	boolean isVovel(char ch) {
		switch(ch) {
		case 'a':
		case 'e':
		case 'i': 
		case 'o': 
		case 'u': return true;
		}
		return false;
	}
}