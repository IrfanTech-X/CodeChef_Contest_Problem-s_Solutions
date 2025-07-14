import java.util.*;

 class CodeChef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sn = new Scanner(System.in);
        int T = sn.nextInt();

        while (T > 0) {
            int A = sn.nextInt();
            int B = sn.nextInt();
            int M = sn.nextInt();

            int clockwise = (B - A + M) % M;
            int counterClockwise = (A - B + M) % M;

            int result = Math.min(clockwise, counterClockwise);
            System.out.println(result);
            T--;
        }
    }
}
