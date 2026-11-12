
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] b && new int[b.length / 2 + 2] instanceof int[] t && new int[3] instanceof int[] w
            && IntStream.rangeClosed(0, b.length).map(i -> (i < b.length ? b[i] : 10) >= 48 ? (w[0] = w[0] * 10 + b[i] - 48) + (w[1] = 1) : w[1] == 1 ? (t[w[2]++] = w[0]) + (w[0] = 0) + (w[1] = 0) : 0).asLongStream().sum() >= 0
            && Integer.valueOf(t[0]) instanceof Integer q && Integer.valueOf(2 * q + 4) instanceof Integer M
            && new int[M + 1] instanceof int[] par && new int[M + 1] instanceof int[] sz && new int[M + 1] instanceof int[] dep
            && new int[M + 1] instanceof int[] tin && new int[M + 1] instanceof int[] nxt
            && IntStream.rangeClosed(2, M).map(v -> par[v] = v <= 4 ? 1 : t[(v - 3) / 2]).asLongStream().sum() > 0
            && IntStream.rangeClosed(1, M).map(v -> sz[v] = 1).asLongStream().sum() > 0
            && IntStream.iterate(M, v -> v >= 2, v -> v - 1).map(v -> sz[par[v]] += sz[v]).asLongStream().sum() > 0
            && (nxt[1] = 1) > 0
            && IntStream.rangeClosed(2, M).map(v -> (dep[v] = dep[par[v]] + 1) + (tin[v] = nxt[par[v]]) + (nxt[par[v]] += sz[v]) + (nxt[v] = tin[v] + 1)).asLongStream().sum() > 0
            && Integer.valueOf(32 - Integer.numberOfLeadingZeros(M)) instanceof Integer K
            && IntStream.range(0, K).mapToObj(k -> new int[M - (1 << k) + 1]).toArray(int[][]::new) instanceof int[][] tab
            && IntStream.rangeClosed(1, M).map(v -> tab[0][tin[v]] = dep[v]).asLongStream().sum() > 0
            && IntStream.range(1, K).filter(k -> IntStream.range(0, tab[k].length).map(i -> tab[k][i] = Math.min(tab[k - 1][i], tab[k - 1][i + (1 << (k - 1))])).asLongStream().sum() >= 0).count() >= 0
            && ((IntBinaryOperator) (x, y) -> x == y ? 0
                : Integer.valueOf(Math.min(tin[x], tin[y]) + 1) instanceof Integer l && Integer.valueOf(Math.max(tin[x], tin[y])) instanceof Integer r
                    && Integer.valueOf(31 - Integer.numberOfLeadingZeros(r - l + 1)) instanceof Integer k
                    ? dep[x] + dep[y] - 2 * (Math.min(tab[k][l], tab[k][r - (1 << k) + 1]) - 1) : -1) instanceof IntBinaryOperator dist
            && new int[]{2, 3, 2} instanceof int[] s && new StringBuilder() instanceof StringBuilder sb
            && IntStream.rangeClosed(1, q).map(i -> (Integer.valueOf(dist.applyAsInt(2 * i + 3, s[0])) instanceof Integer d1 && Integer.valueOf(dist.applyAsInt(2 * i + 3, s[1])) instanceof Integer d2
                    ? (d1 > s[2] && d1 >= d2 ? new int[]{s[1] = 2 * i + 3, s[2] = d1}.length : d2 > s[2] ? new int[]{s[0] = 2 * i + 3, s[2] = d2}.length : 0) : 0)
                + sb.append(s[2]).append('\n').length()).asLongStream().sum() >= 0
            ? sb.toString().trim() : "");
    }
}



