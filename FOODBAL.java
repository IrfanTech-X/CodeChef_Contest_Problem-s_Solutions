import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sn=new Scanner(System.in);
		int A1=sn.nextInt();
		int b1=sn.nextInt();
		int A2=sn.nextInt();
		int b2=sn.nextInt();
		
		int r1=Math.abs(A1-b1);
		int r2=Math.abs(A2-b2);
		
		if(r1<r2){
		    System.out.println("First");
		}else if(r1==r2){
		    System.out.println("Both");
		}else{
		    System.out.println("Second");
		}

	}
}
