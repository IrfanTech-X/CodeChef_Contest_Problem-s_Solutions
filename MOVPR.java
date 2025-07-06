import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sn = new Scanner(System.in);
        int X = sn.nextInt();
        int Y = sn.nextInt();
        int Z = sn.nextInt();

        int r = (Z * 2) + Y;
        int r2 = (X * 2) + (Y * 3);

        if (r < r2) {
            System.out.println(r);
        } else {
            System.out.println(r2);
        }

    }
}