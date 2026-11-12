
import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Optional.of(Map.entry((new File("input.txt").exists() ? new FileInputStream("input.txt") : System.in).readAllBytes(), new File("input.txt").exists() ? new PrintStream(new FileOutputStream("output.txt"), true) : System.out)).ifPresent(io -> io.getValue().println(new StringTokenizer(new String(io.getKey())) instanceof StringTokenizer sc
            && Integer.valueOf(Integer.parseInt(sc.nextToken())) instanceof Integer n && Integer.valueOf(Integer.parseInt(sc.nextToken())) instanceof Integer m && Integer.valueOf(Integer.parseInt(sc.nextToken())) instanceof Integer r
            && IntStream.range(0, n).mapToObj(i -> sc.nextToken()).collect(Collectors.joining()).getBytes() instanceof byte[] g
            && new int[(n + 1) * m] instanceof int[] P
            && IntStream.range(0, n * m).allMatch(i -> (P[i + m] = P[i] + (g[i] == 'a' ? 1 : 0)) >= 0)
            && new int[n + 1] instanceof int[] R
            && IntStream.range(0, n).allMatch(i -> (R[i + 1] = R[i] + (int) IntStream.range(0, m).filter(j -> g[i * m + j] == 'a').count()) >= 0)
            && new long[n * 26 * 7] instanceof long[] BS
            && IntStream.range(0, n * m).allMatch(x -> Integer.valueOf(x / m) instanceof Integer ri && Integer.valueOf(x - ri * m) instanceof Integer cj && Long.valueOf(BS[(ri * 26 + g[x] - 97) * 7 + (cj >> 6)] |= 1L << cj) instanceof Long)
            && Integer.valueOf(IntStream.range(0, n * m).map(i -> g[i] - 'a').max().getAsInt() + 1) instanceof Integer nl
            && Long.valueOf(IntStream.range(0, n).parallel().mapToLong(t -> new int[2 * m + 2] instanceof int[] DUM && new int[3] instanceof int[] st && new int[26] instanceof int[] cnt && new long[1] instanceof long[] ans
                && Integer.valueOf(t * m) instanceof Integer tm
                && IntStream.range(t + 1, n).allMatch(b -> Integer.valueOf(b * m) instanceof Integer bm && Integer.valueOf((b + 1) * m) instanceof Integer b1m
                    && (R[b + 1] - R[t] <= r ? (Integer.valueOf(IntStream.range(0, nl).map(L -> Integer.valueOf((t * 26 + L) * 7) instanceof Integer pa && Integer.valueOf((b * 26 + L) * 7) instanceof Integer pb && Integer.valueOf(Long.bitCount(BS[pa + 0] & BS[pb + 0]) + Long.bitCount(BS[pa + 1] & BS[pb + 1]) + Long.bitCount(BS[pa + 2] & BS[pb + 2]) + Long.bitCount(BS[pa + 3] & BS[pb + 3]) + Long.bitCount(BS[pa + 4] & BS[pb + 4]) + Long.bitCount(BS[pa + 5] & BS[pb + 5]) + Long.bitCount(BS[pa + 6] & BS[pb + 6])) instanceof Integer e ? e * (e - 1) / 2 : 0).sum()) instanceof Integer S && (ans[0] += S) >= 0) : true
                    && (st[0] = 0) == 0 && (st[1] = 0) == 0 && (st[2] = 0) == 0
                    && Stream.of(0).peek(z0 -> Arrays.fill(cnt, 0)).findFirst().isPresent()
                    && Stream.of(0).peek(z0 -> Arrays.setAll(DUM, z -> st[0] < m
                        && (st[2] + (P[b1m + st[0]] - P[tm + st[0]]) > r
                            ? (st[1] < st[0]
                                ? (st[2] -= P[b1m + st[1]] - P[tm + st[1]]) >= 0 && (g[bm + st[1]] != g[tm + st[1]] || --cnt[g[tm + st[1]] - 'a'] >= 0) && ++st[1] > 0 && false
                                : (st[1] = ++st[0]) > 0 && false)
                            : (g[bm + st[0]] != g[tm + st[0]] || ((ans[0] += cnt[g[tm + st[0]] - 'a']) >= 0 && ++cnt[g[tm + st[0]] - 'a'] > 0))
                                && (st[2] += P[b1m + st[0]] - P[tm + st[0]]) >= 0 && ++st[0] > 0 && false) ? 1 : 0)).findFirst().isPresent())) ? ans[0] : 0L).sum()) instanceof Long tot
            ? tot : ""));
    }
}



