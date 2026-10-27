import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && IntStream.range(0, 2 * n).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] sh
            && IntStream.range(0, n).mapToLong(i -> (long) sh[2 * i + 1] << 17 | i).sorted().mapToInt(x -> (int) (x & 131071)).toArray() instanceof int[] os
            && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && IntStream.range(0, 2 * m).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] cu
            && IntStream.range(0, m).mapToLong(i -> ((long) cu[2 * i + 1] << 31) | ((long) cu[2 * i] << 1)).toArray() instanceof long[] ck
            && IntStream.range(0, m).boxed().sorted(Comparator.comparingLong((Integer i) -> ck[i])).mapToInt(i -> i).toArray() instanceof int[] oc
            && Arrays.stream(oc).mapToLong(i -> ((long) cu[2 * i + 1] << 31) | ((long) cu[2 * i] << 1)).toArray() instanceof long[] Ks
            && ((ToIntFunction<int[]>) a -> (Integer) (~Arrays.binarySearch(Ks, (((long) a[0] << 31) | ((long) a[1] << 1)) - 1)) instanceof Integer p && (Integer) (p < m && oc[p] + 1 == a[2] ? p + 1 : p) instanceof Integer q
                && q < m && (Ks[q] >> 31) == a[0] ? oc[q] + 1 : -1) instanceof ToIntFunction<int[]> find
            && new long[n][2] instanceof long[][] dp && new int[n][2] instanceof int[][] bp
            && Arrays.stream(dp).allMatch(r -> (r[0] = Long.MIN_VALUE / 4) < 0 && (r[1] = Long.MIN_VALUE / 4) < 0)
            && IntStream.range(0, n).allMatch(i -> (Integer) sh[2 * os[i]] instanceof Integer c && (Integer) sh[2 * os[i] + 1] instanceof Integer sz
                && (Boolean) (i > 0 && sh[2 * os[i - 1] + 1] + 1 == sz) instanceof Boolean cons
                && IntStream.range(0, 2).allMatch(pf -> (Long) (i == 0 ? (pf == 0 ? 0L : Long.MIN_VALUE / 4) : dp[i - 1][pf]) instanceof Long base
                    && (base <= Long.MIN_VALUE / 8
                        || ((base > dp[i][0] ? (dp[i][0] = base) < Long.MAX_VALUE && (bp[i][0] = pf * 3) >= 0 : true)
                            && (find.applyAsInt(new int[]{sz - 1, c, cons && pf == 1 ? find.applyAsInt(new int[]{sz - 1, sh[2 * os[i - 1]], -1}) : -1}) < 0
                                || (base + c > dp[i][0] ? (dp[i][0] = base + c) < Long.MAX_VALUE && (bp[i][0] = pf * 3 + 1) >= 0 : true))
                            && (find.applyAsInt(new int[]{sz, c, -1}) < 0
                                || (base + c > dp[i][1] ? (dp[i][1] = base + c) < Long.MAX_VALUE && (bp[i][1] = pf * 3 + 2) >= 0 : true))))))
            && new int[n] instanceof int[] mode && new int[]{dp[n - 1][1] > dp[n - 1][0] ? 1 : 0} instanceof int[] f
            && IntStream.iterate(n - 1, i -> i >= 0, i -> i - 1).allMatch(i -> (mode[i] = bp[i][f[0]] % 3) >= 0 && (f[0] = bp[i][f[0]] / 3) >= 0)
            && new int[n] instanceof int[] cust
            && IntStream.range(0, n).mapToObj(i -> mode[i] == 0 ? null
                : (cust[i] = find.applyAsInt(new int[]{mode[i] == 1 ? sh[2 * os[i] + 1] - 1 : sh[2 * os[i] + 1], sh[2 * os[i]],
                    mode[i] == 1 && i > 0 && sh[2 * os[i - 1] + 1] + 1 == sh[2 * os[i] + 1] && mode[i - 1] == 2 ? cust[i - 1] : -1})) + " " + (os[i] + 1)).filter(Objects::nonNull).toList().reversed() instanceof List<String> pairs
            ? Math.max(dp[n - 1][0], dp[n - 1][1]) + "\n" + pairs.size() + (pairs.isEmpty() ? "" : "\n" + String.join("\n", pairs))
            : "");
    }
}



