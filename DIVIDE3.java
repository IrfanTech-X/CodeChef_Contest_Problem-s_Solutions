import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        
        int result;
        
        // If divisible by 3, imbalance = 0, else = 1
        if (n % 3 == 0) {
            result = 0;
        } else {
            result = 1;
        }
        
        System.out.println(result);
    }
}
