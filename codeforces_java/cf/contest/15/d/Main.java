import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.print(
            new BufferedReader(new InputStreamReader(System.in)).lines().filter(l -> !l.isBlank()).toList() instanceof List<String> lines
            && Arrays.stream(lines.get(0).trim().split(" ")).mapToInt(Integer::parseInt).toArray() instanceof int[] d
            && lines.stream().skip(1).limit(d[0]).map(l -> Arrays.stream(l.trim().split(" ")).mapToLong(Long::parseLong).toArray()).toArray(long[][]::new) instanceof long[][] h
            && new long[d[0] + 1][d[1] + 1] instanceof long[][] pre
            && IntStream.rangeClosed(1, d[0]).allMatch(i -> IntStream.rangeClosed(1, d[1]).allMatch(j -> (pre[i][j] = h[i - 1][j - 1] + pre[i - 1][j] + pre[i][j - 1] - pre[i - 1][j - 1]) >= Long.MIN_VALUE))
            && ((BiFunction<long[], Integer, long[]>) (x, w) ->
                new long[x.length] instanceof long[] pf
                && new long[x.length] instanceof long[] sf
                && IntStream.range(0, x.length).allMatch(j -> (pf[j] = j % w == 0 ? x[j] : Math.min(pf[j - 1], x[j])) > Long.MIN_VALUE)
                && IntStream.iterate(x.length - 1, j -> j >= 0, j -> j - 1).allMatch(j -> (sf[j] = (j % w == w - 1 || j == x.length - 1) ? x[j] : Math.min(sf[j + 1], x[j])) > Long.MIN_VALUE)
                ? IntStream.rangeClosed(0, x.length - w).mapToLong(l -> Math.min(sf[l], pf[l + w - 1])).toArray()
                : null) instanceof BiFunction<long[], Integer, long[]> sl
            && Arrays.stream(h).map(r -> sl.apply(r, d[3])).toArray(long[][]::new) instanceof long[][] rm
            && IntStream.range(0, d[1] - d[3] + 1).mapToObj(j -> sl.apply(IntStream.range(0, d[0]).mapToLong(i -> rm[i][j]).toArray(), d[2])).toArray(long[][]::new) instanceof long[][] cm
            && Integer.valueOf(d[1] - d[3] + 1) instanceof Integer wc
            && Integer.valueOf(d[0] - d[2] + 1) instanceof Integer wr
            && IntStream.range(0, wr * wc).mapToLong(k -> pre[k / wc + d[2]][k % wc + d[3]] - pre[k / wc][k % wc + d[3]] - pre[k / wc + d[2]][k % wc] + pre[k / wc][k % wc] - cm[k % wc][k / wc] * d[2] * d[3]).toArray() instanceof long[] cost
            && Arrays.stream(cost).sorted().distinct().toArray() instanceof long[] vals
            && IntStream.range(0, cost.length).mapToLong(k -> (long) Arrays.binarySearch(vals, cost[k]) << 20 | k).sorted().toArray() instanceof long[] keys
            && new boolean[wr * wc] instanceof boolean[] blocked
            && new StringBuilder() instanceof StringBuilder sb
            && new int[1] instanceof int[] cnt
            && Arrays.stream(keys).allMatch(key ->
                (Integer) (int) (key & 1048575) instanceof Integer k
                && (blocked[k]
                    || (++cnt[0] > 0
                        && sb.append(k / wc + 1).append(' ').append(k % wc + 1).append(' ').append(cost[k]).append('\n') != null
                        && IntStream.rangeClosed(Math.max(0, k / wc - d[2] + 1), Math.min(wr - 1, k / wc + d[2] - 1)).allMatch(r ->
                            IntStream.rangeClosed(Math.max(0, k % wc - d[3] + 1), Math.min(wc - 1, k % wc + d[3] - 1)).allMatch(c -> (blocked[r * wc + c] = true))))))
            ? cnt[0] + "\n" + sb
            : "");
    }
}



