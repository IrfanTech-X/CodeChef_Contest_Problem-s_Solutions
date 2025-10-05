import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sn=new Scanner(System.in);
		
		int t=sn.nextInt();
		
		for(int i=0;i<t;i++){
		    int x=sn.nextInt();
		    int y=sn.nextInt();
		    
		    int mx_des=x*15;
		    int total_des=2*y;
		    
		    if(mx_des>=total_des){
		        System.out.println("Yes");
		    }else{
		        System.out.println("No");
		    }
		    
		}

	}
}
