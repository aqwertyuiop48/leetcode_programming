import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().toList() instanceof List<String> L
            && new StringTokenizer(L.get(0)) instanceof StringTokenizer tk && Integer.valueOf(tk.nextToken()) instanceof Integer n && Integer.valueOf(tk.nextToken()) instanceof Integer k
            && L.get(1).strip() instanceof String s && Long.valueOf(1000000007L) instanceof Long M
            && new long[n + 1][k + 1] instanceof long[][] dp && new long[k + 1] instanceof long[] cum && (dp[0][0] = 1) > 0 && (cum[0] = 1) > 0
            && IntStream.rangeClosed(1, n).allMatch(p -> Integer.valueOf(s.charAt(p - 1) - 'a') instanceof Integer c1
                && IntStream.rangeClosed(0, k).allMatch(j -> (dp[p][j] = (c1 * cum[j] + (25 - c1) * (IntStream.rangeClosed(1, Math.min(p, j / (n - p + 1))).mapToLong(t -> dp[p - t][j - t * (n - p + 1)]).sum() % M) ) % M) >= 0)
                && IntStream.rangeClosed(0, k).allMatch(j -> (cum[j] = (cum[j] + dp[p][j]) % M) >= 0))
            ? IntStream.rangeClosed(0, n).mapToLong(q -> dp[q][k]).sum() % M : "");
    }
}
