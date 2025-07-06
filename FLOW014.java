import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sn=new Scanner(System.in);
		int T=sn.nextInt();
		double[] ar=new double[T];
		
		
		for(int i=0;i<T;i++){
		    
		    for(int j=0;j<3;j++){
		        ar[j]=sn.nextDouble();
		        
		        
		    }
		    if(ar[0]>50 && ar[1]<0.7 && ar[2]>5600){
		        System.out.println("10");
		    }else if(ar[0]>50 && ar[1]<0.7 ){
		        System.out.println("9");
		    }else if(ar[1]<0.7 && ar[2]>5600){
		        System.out.println("8");
		    }else if(ar[0]>50 && ar[2]>5600){
		        System.out.println("7");
		    }else if(ar[0]>50 || ar[1]<0.7 || ar[2]>5600){
		        System.out.println("6");
		    }else{
		        System.out.println("5");
		    }
		    
		}





	}
}
