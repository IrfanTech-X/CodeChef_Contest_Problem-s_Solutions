import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sn=new Scanner(System.in);
		int t=sn.nextInt();
		while(t!=0){
		    
		    int x=sn.nextInt();
		    
		    if(x!=0){
		        int rm=x%3;
		        int r=x/3;
		            
		            if(rm!=0){
		             r =(r*3)+3;
		             int y=r-x;
		    
		    System.out.println(y);
		            
		        }else{
		        System.out.println(rm);
		    }
		    }
		    else{
		        System.out.println(0);
		    }
		    t--;
		}

	}
}
