import java.util.*;
import java.lang.*;
import java.io.*;

class CodeChef{
    
    public static void main(String[] args)throws java.lang.Exception{
        
        Scanner sn=new Scanner(System.in);
        
        int t=sn.nextInt();
        while(t !=0){
            
            int x=sn.nextInt();
            int y=sn.nextInt();
            
            if(y<=x){
                System.out.println(y);
            }else{
                System.out.println(x);
            }
            --t;
        }
    
    }
}