import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sn=new Scanner(System.in);
		int[] ar=new int[3];
		for(int i=0;i<3;i++){
		    ar[i]=sn.nextInt();
		}
		int rec,square;
		
		rec=ar[0]*ar[1];
		square=ar[2]*ar[2];
		
		if(rec==square){
		    System.out.println("Yes");
		    
		}
		else{
		    System.out.println("No");
		}

	}
}
