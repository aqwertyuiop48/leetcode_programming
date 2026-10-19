import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToLong(t -> Long.parseLong((String) t)).iterator() instanceof PrimitiveIterator.OfLong it
            && Integer.valueOf((int) it.nextLong()) instanceof Integer n && Integer.valueOf((int) it.nextLong()) instanceof Integer q
            && LongStream.range(0, n).map(i -> it.nextLong()).toArray() instanceof long[] v
            && LongStream.range(0, n).mapToInt(i -> (int) it.nextLong()).toArray() instanceof int[] c
            ? LongStream.range(0, q).mapToObj(qi -> Long.valueOf(it.nextLong()) instanceof Long a && Long.valueOf(it.nextLong()) instanceof Long b
                && new long[n + 1] instanceof long[] dp && Arrays.stream(new int[n + 1]).allMatch(z -> true) && IntStream.rangeClosed(0, n).allMatch(i -> (dp[i] = Long.MIN_VALUE / 4) < 0)
                && new long[]{0, Long.MIN_VALUE / 4} instanceof long[] top && new int[]{0} instanceof int[] topc
                && IntStream.range(0, n).allMatch(i -> Long.valueOf(Math.max(dp[c[i]] + v[i] * a, (topc[0] != c[i] ? top[0] : top[1]) + v[i] * b)) instanceof Long cand
                    && (dp[c[i]] = Math.max(dp[c[i]], cand)) < Long.MAX_VALUE
                    && (dp[c[i]] <= top[0] && topc[0] != c[i] ? dp[c[i]] <= top[1] || (top[1] = dp[c[i]]) < Long.MAX_VALUE
                        : dp[c[i]] <= top[0] || (topc[0] == c[i] ? (top[0] = dp[c[i]]) < Long.MAX_VALUE : (top[1] = top[0]) < Long.MAX_VALUE && (top[0] = dp[c[i]]) < Long.MAX_VALUE && (topc[0] = c[i]) > 0)))
                ? String.valueOf(top[0]) : "").collect(Collectors.joining("\n")) : "");
    }
}
