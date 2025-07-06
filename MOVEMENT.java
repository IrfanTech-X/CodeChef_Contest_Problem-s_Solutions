import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sn=new Scanner(System.in);
		int[] ar=new int[4];
		
		for(int i=0;i<4;i++){
		    ar[i]=sn.nextInt();
		}
		int r1=ar[0]-ar[2];
		int r2=ar[1]-ar[3];
		
		System.out.println(r1+" "+r2);

	}
}
