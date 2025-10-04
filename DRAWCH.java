import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sn = new Scanner(System.in);
        int t = sn.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sn.nextInt();
            int m = sn.nextInt();
            String s = sn.next();  // ✅ read binary string like "1010"

            int alice = 0, bob = 0;
            for (int j = 0; j < m; j++) {
                if (s.charAt(j) == '1') alice++;
                else bob++;
            }

            if (n % 2 != 0) {
                System.out.println("No");
                continue;
            }

            int remaining = n - m;
            int neededForTie = (n / 2) - alice;

            if (neededForTie >= 0 && neededForTie <= remaining)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
