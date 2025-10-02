import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] arr=new int[4];
		Scanner sn=new Scanner(System.in);
		for(int i=0;i<4;i++){
		    arr[i]=sn.nextInt();
		}
		int a=arr[0]*arr[2];
		int b=arr[1]*arr[3];
		if(a>b){
		    System.out.println(a);
		}
		else{
		    System.out.println(b);
		}
		

	}
}
