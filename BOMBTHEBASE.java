import java.util.*;

public class BombTheBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // number of test cases
        
        while (T-- > 0) {
            int N = sc.nextInt(); // number of houses
            int X = sc.nextInt(); // bomb attack strength
            
            int[] A = new int[N]; // defense strengths of houses
            
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            
            int maxDestroyed = 0;
            
            for (int i = 0; i < N; i++) {
                if (A[i] < X) {
                    maxDestroyed = i + 1; // i is 0-based index, so add 1
                }
            }
            
            System.out.println(maxDestroyed);
        }
        
        sc.close();
    }
}
