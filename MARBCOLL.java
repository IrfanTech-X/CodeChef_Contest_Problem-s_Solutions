import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sn = new Scanner(System.in);
        int T = sn.nextInt();  // number of test cases

        while(T-- > 0){
            int N = sn.nextInt();
            int M = sn.nextInt();
            int[] types = new int[N];

            for(int i = 0; i < N; i++) {
                types[i] = sn.nextInt();
            }

            Arrays.sort(types);  // Important step to group duplicates

            int count = 1;  // At least one type exists
            for(int i = 1; i < N; i++) {
                if(types[i] != types[i-1]) {
                    count++;  // new unique type found
                }
            }

            int result = M - count;
            System.out.println(result);
        }
    }
}
