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
		    int n=sn.nextInt();
		    int k=sn.nextInt();
		    
		    int a=n*k;
		    
		    int remainder=a%60;
		    
		    int result= (a-remainder)/60;
		    
		    System.out.println(result+" "+remainder);
		}

	}
}
