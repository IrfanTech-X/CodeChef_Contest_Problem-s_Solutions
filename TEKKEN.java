import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sn = new Scanner(System.in);
        int T = sn.nextInt();
        int a = T * 3;
        int[] ar = new int[a];

        for (int i = 0; i < a; i++) {
            ar[i] = sn.nextInt();
        }

        for (int i = 0; i < a; i += 3) {


            int r3 = Math.min(ar[i + 1], ar[i + 2]);
            ar[i + 1] = ar[i + 1] - r3;
            ar[i + 2] = ar[i + 2] - r3;

            int r1 = Math.min(ar[i], ar[i + 1]);
            ar[i] = ar[i] - r1;
            ar[i + 1] = ar[i + 1] - r1;


            int r2 = Math.min(ar[i], ar[i + 2]);
            ar[i] = ar[i] - r2;
            ar[i + 2] = ar[i + 2] - r2;



            if (ar[i] > 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}