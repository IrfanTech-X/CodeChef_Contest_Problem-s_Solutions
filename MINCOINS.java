import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sn=new Scanner(System.in);
		int T=sn.nextInt();
		int a=10;
		int b=5;
		while(T>0){
		    
		    int A=sn.nextInt();
		    int r=A%a;
		    int res=A/a;
		    
		    if(r == 0){
		        System.out.println(res);
		    }else if(r%b == 0){
		
		        int res1=r/b;
		        int result=res1+res;
		        System.out.println(result);
		    }else{
		        System.out.println("-1");
		    }
		    
		    
		    
		    T--;
		}
	}
}
