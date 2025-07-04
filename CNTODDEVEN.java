import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sn=new Scanner(System.in);
		int T=sn.nextInt();
		int[] ar=new int[T];
		
		int even=0;
		int odd=0;
		
		for(int i=0;i<T;i++){
		    ar[i]=sn.nextInt();
		}
		
			for(int i=0;i<T;i++){
		    for(int j=2;j<=ar[i];j=j+2){
		        if((ar[i]%j)==0){
		            even +=1;
		        }
		    }
		    for(int j=1;j<=ar[i];j=j+2){
		        if((ar[i]%j)==0){
		            odd +=1;
		        }
		    }
		    System.out.println(odd+" "+even);
		    even=0;
		    odd=0;
		}
		

	}
}
