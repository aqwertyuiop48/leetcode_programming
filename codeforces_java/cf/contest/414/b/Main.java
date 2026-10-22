import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        final int M = 1000000007;
        int[] dp = new int[n + 1], nd = new int[n + 1];
        Arrays.fill(dp, 1); dp[0] = 0;
        for (int len = 2; len <= k; len++) {
            Arrays.fill(nd, 0);
            for (int i = 1; i <= n; i++) {
                int v = dp[i];
                if (v == 0) continue;
                for (int j = i; j <= n; j += i) { nd[j] += v; if (nd[j] >= M) nd[j] -= M; }
            }
            int[] t = dp; dp = nd; nd = t;
        }
        long ans = 0;
        for (int i = 1; i <= n; i++) ans += dp[i];
        System.out.println(ans % M);
    }
}
