import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sn=new Scanner(System.in);
		int a=sn.nextInt();
		int b=sn.nextInt();
		int sum=0;
		
		if(a>b){
		    sum=a-b;
		    System.out.println(sum);
		}else{
		    sum=b-a;
		    System.out.println(sum);
		}
		

	}
}
