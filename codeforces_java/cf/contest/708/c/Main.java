import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && Integer.valueOf(raw.length) instanceof Integer len
            && new int[len / 2 + 2] instanceof int[] t && new int[4] instanceof int[] f
            && IntStream.range(0, len + 1).map(i -> Integer.valueOf(i < len ? raw[i] : 32) instanceof Integer c
                ? (c >= 48 && c <= 57 ? (f[3] = f[3] * 10 + c - 48) + (f[1] = 1) : f[1] == 1 ? (t[f[2]++] = f[3]) + (f[3] = 0) + (f[1] = 0) : 0) * 0 : 0).sum() == 0
            && Integer.valueOf(t[0]) instanceof Integer n
            && IntStream.generate(() -> -1).limit(n + 1).toArray() instanceof int[] hd && new int[2 * n] instanceof int[] nxt && new int[2 * n] instanceof int[] to
            && IntStream.range(0, n - 1).filter(i -> (to[2 * i] = t[2 + 2 * i]) + (nxt[2 * i] = hd[t[1 + 2 * i]]) + (hd[t[1 + 2 * i]] = 2 * i)
                + (to[2 * i + 1] = t[1 + 2 * i]) + (nxt[2 * i + 1] = hd[t[2 + 2 * i]]) + (hd[t[2 + 2 * i]] = 2 * i + 1) < -1000000000).count() >= 0
            && ((IntFunction<int[][]>) root -> new int[n] instanceof int[] ord && new int[n + 1] instanceof int[] par && new int[n + 1] instanceof int[] sub && new int[] {1} instanceof int[] tl
                && Integer.valueOf(ord[0] = root) != null
                && IntStream.range(0, n).filter(i -> IntStream.iterate(hd[ord[i]], e -> e >= 0, e -> nxt[e]).filter(e -> to[e] != par[ord[i]])
                    .filter(e -> (par[to[e]] = ord[i]) + (ord[tl[0]++] = to[e]) < 0).count() > 100).count() >= 0
                && IntStream.rangeClosed(1, n).filter(v -> (sub[v] = 1) < 0).count() >= 0
                && IntStream.range(0, n - 1).filter(i -> (sub[par[ord[n - 1 - i]]] += sub[ord[n - 1 - i]]) < 0).count() >= 0
                ? new int[][] {ord, par, sub} : null) instanceof IntFunction<int[][]> bfs
            && bfs.apply(1) instanceof int[][] r1 && new int[n + 1] instanceof int[] mc
            && IntStream.rangeClosed(2, n).filter(v -> (mc[r1[1][v]] = Math.max(mc[r1[1][v]], r1[2][v])) < 0).count() >= 0
            && (Integer) IntStream.rangeClosed(1, n).filter(v -> n - r1[2][v] <= n / 2 && mc[v] <= n / 2).findFirst().orElse(1) instanceof Integer cen
            && bfs.apply(cen) instanceof int[][] r2 && new int[n + 1] instanceof int[] br
            && IntStream.range(1, n).filter(i -> (br[r2[0][i]] = r2[1][r2[0][i]] == cen ? r2[0][i] : br[r2[1][r2[0][i]]]) < 0).count() >= 0
            && (Integer) IntStream.rangeClosed(1, n).filter(v -> r2[1][v] == cen).map(v -> r2[2][v]).max().orElse(0) instanceof Integer mx1
            && (Integer) IntStream.rangeClosed(1, n).filter(v -> r2[1][v] == cen && r2[2][v] == mx1).findFirst().orElse(0) instanceof Integer arg1
            && (Integer) IntStream.rangeClosed(1, n).filter(v -> r2[1][v] == cen && v != arg1).map(v -> r2[2][v]).max().orElse(0) instanceof Integer mx2
            ? IntStream.rangeClosed(1, n).mapToObj(v -> v == cen || n - r2[2][v] <= n / 2 || n - r2[2][v] - (br[v] == arg1 ? mx2 : mx1) <= n / 2 || r2[2][br[v]] * 2 == n ? "1" : "0").collect(Collectors.joining(" ")) : "");
    }
}
