import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Arrays.stream(l.trim().split("\\s+"))).filter(w -> !w.isEmpty()).mapToInt(Integer::parseInt).toArray() instanceof int[] t
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(Arrays.stream(t, 1, n + 1).sum()) instanceof Integer S && new long[1] instanceof long[] ans
            && IntStream.rangeClosed(1, n).boxed().reduce(new int[2 * S + 1], (dp, i) -> IntStream.rangeClosed(0, 2 * S).map(j -> ((j - t[i] >= 0 ? dp[j - t[i]] : 0) + (j + t[i] <= 2 * S ? dp[j + t[i]] : 0)
                    + (j == S + t[i] ? 1 : 0) + (j == S - t[i] ? 1 : 0)) % 1000000007).toArray() instanceof int[] nw && (ans[0] += nw[S]) >= 0 ? nw : dp, (x, y) -> x) instanceof int[] last
            ? ans[0] % 1000000007 : "");
    }
}
