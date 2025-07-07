import java.util.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sn = new Scanner(System.in);
        int T = sn.nextInt();
        
        while (T-- > 0) {
            int X = sn.nextInt(); // small shirts
            int Y = sn.nextInt(); // large shirts
            int Z = sn.nextInt(); // XL shirts
            int A = sn.nextInt(); // small need
            int B = sn.nextInt(); // large need
            int C = sn.nextInt(); // XL need

            int happy = 0;

            // Satisfy XL requests
            int xl = Math.min(Z, C);
            Z -= xl;
            C -= xl;
            happy += xl;

            // Satisfy L requests with L shirts
            int l = Math.min(Y, B);
            Y -= l;
            B -= l;
            happy += l;

            // If more L needed, convert XL to L
            int xl_to_l = Math.min(Z, B);
            Z -= xl_to_l;
            B -= xl_to_l;
            happy += xl_to_l;

            // Satisfy S requests with S shirts
            int s = Math.min(X, A);
            X -= s;
            A -= s;
            happy += s;

            // If more S needed, convert L to S
            int l_to_s = Math.min(Y, A);
            Y -= l_to_s;
            A -= l_to_s;
            happy += l_to_s;

            // If still more S needed, convert XL to S
            int xl_to_s = Math.min(Z, A);
            Z -= xl_to_s;
            A -= xl_to_s;
            happy += xl_to_s;

            System.out.println(happy);
        }
    }
}
