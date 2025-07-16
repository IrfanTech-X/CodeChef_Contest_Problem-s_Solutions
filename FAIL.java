import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sn=new Scanner(System.in);
		int T=sn.nextInt();
		int sum=0;
		int res=0;
		int count=0;
		
		while(T>0){
		    
		    int N=sn.nextInt();
		    int[] scores=new int[N];
		    
		    for(int i=0;i<N;i++){
		        scores[i]=sn.nextInt();
		        
		    }
		    for(int i=0;i<N;i++){
		        sum +=scores[i];
		        res =sum/(i+1);
		        
		        if(res<40){
		            System.out.println("NO");
		        break;
		    }else{
		       count++;
		    }
		        
		    }
		    
		    if(count==N){
		        System.out.println("YES");
		    }
		    
		    sum=0;
		    count=0;
		    T--;
		    
		}

	}
}
