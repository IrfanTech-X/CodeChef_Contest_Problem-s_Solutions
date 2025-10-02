import java.util.*;

class assignment{
    
    public static void main(String[] args){
        
        Scanner sn=new Scanner(System.in);
        
        int a=sn.nextInt();
        int result= a*5;
        
        
        if(result<=60){
            System.out.println("Yes");
        }
        else{
            System.out.println("NO");
        }
    }
}