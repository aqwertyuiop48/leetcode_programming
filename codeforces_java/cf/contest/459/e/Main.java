import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Stream.generate(st::nextToken).limit(st.countTokens()).mapToInt(Integer::parseInt).toArray() instanceof int[] g
            && Integer.valueOf(g[0]) instanceof Integer n
            && Integer.valueOf(g[1]) instanceof Integer m
            && IntStream.range(0, m).mapToLong(i -> (long) g[4 + 3 * i] << 20 | i).sorted().toArray() instanceof long[] ks
            && new int[n + 1] instanceof int[] dp
            && new int[m] instanceof int[] pv
            && new int[m] instanceof int[] pw
            && new int[1] instanceof int[] gs
            && IntStream.range(0, m).allMatch(q ->
                (Integer) (int) (ks[q] & 1048575) instanceof Integer e
                && (pv[q] = g[3 + 3 * e]) > 0
                && (pw[q] = dp[g[2 + 3 * e]] + 1) > 0
                && (q + 1 < m && ks[q + 1] >> 20 == ks[q] >> 20
                    || (IntStream.rangeClosed(gs[0], q).allMatch(k -> (dp[pv[k]] = Math.max(dp[pv[k]], pw[k])) > 0) && (gs[0] = q + 1) > 0)))
            ? String.valueOf(Arrays.stream(dp).max().getAsInt())
            : "");
    }
}
