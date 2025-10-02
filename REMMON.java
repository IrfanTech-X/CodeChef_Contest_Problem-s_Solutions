import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sn=new Scanner(System.in);
		
		int[] arr= new int[3];
		for(int i=0;i<3;i++){
		    arr[i]=sn.nextInt();
		}
		int a=arr[1]*arr[2];
		int b= arr[0]-a;
		
		System.out.println(b);

	}
}
