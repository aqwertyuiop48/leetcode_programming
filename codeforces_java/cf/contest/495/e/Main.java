import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new String(System.in.readAllBytes()).trim().split("[ \r\n]+") instanceof String[] tk
            && Integer.valueOf(tk[0]) instanceof Integer n
            && Integer.valueOf(tk[1]) instanceof Integer q
            && IntStream.range(0, n).map(i -> Integer.parseInt(tk[2 + i])).toArray() instanceof int[] a
            && new int[17][n] instanceof int[][] sp
            && IntStream.range(0, n).allMatch(i -> (sp[0][i] = a[i]) >= 0)
            && IntStream.range(1, 17).allMatch(k -> IntStream.rangeClosed(0, n - (1 << k)).allMatch(i ->
                (sp[k][i] = Math.max(sp[k - 1][i], sp[k - 1][i + (1 << (k - 1))])) >= 0))
            && new int[q + 1] instanceof int[] L
            && new int[q + 1] instanceof int[] R
            && new double[q + 1] instanceof double[] Pr
            && (L[0] = 1) > 0
            && (R[0] = n) > 0
            && IntStream.rangeClosed(1, q).allMatch(i ->
                Integer.valueOf(2 + n + 3 * (i - 1)) instanceof Integer base
                && (L[i] = Integer.parseInt(tk[base])) > 0
                && (R[i] = Integer.parseInt(tk[base + 1])) > 0
                && (Pr[i] = Double.parseDouble(tk[base + 2])) >= 0)
            && IntStream.rangeClosed(0, q).map(i ->
                Math.max(sp[31 - Integer.numberOfLeadingZeros(R[i] - L[i] + 1)][L[i] - 1],
                    sp[31 - Integer.numberOfLeadingZeros(R[i] - L[i] + 1)][R[i] - (1 << (31 - Integer.numberOfLeadingZeros(R[i] - L[i] + 1)))])).toArray() instanceof int[] mx
            && IntStream.rangeClosed(0, q).mapToLong(i -> ((long) L[i] << 40) | ((long) (n - R[i]) << 20) | i).sorted()
                .mapToInt(key -> (int) (key & 0xFFFFF)).toArray() instanceof int[] ord
            && new int[q + 1] instanceof int[] par
            && new int[q + 2] instanceof int[] st
            && new int[1] instanceof int[] top
            && IntStream.rangeClosed(0, q).allMatch(k ->
                Integer.valueOf(ord[k]) instanceof Integer v
                && (top[0] -= (int) IntStream.iterate(top[0], s -> s > 0 && R[st[s - 1]] < L[v], s -> s - 1).count()) >= 0
                && (par[v] = k == 0 ? 0 : st[top[0] - 1]) >= 0
                && (st[top[0]++] = v) >= 0)
            && new int[q + 1] instanceof int[] cnt
            && IntStream.rangeClosed(0, q).allMatch(i -> (cnt[i] = 1) > 0)
            && IntStream.iterate(q, k -> k >= 1, k -> k - 1).allMatch(k -> (cnt[par[ord[k]]] += cnt[ord[k]]) > 0)
            && new double[q + 3] instanceof double[] ob
            && IntStream.of(0).peek(z -> Arrays.setAll(ob, i -> 1.0)).findFirst().isPresent()
            && (IntFunction<double[]>) (m -> Arrays.copyOf(ob, m)) instanceof IntFunction<double[]> ones
            && new double[q + 1][] instanceof double[][] G
            && new double[1] instanceof double[] ans
            && IntStream.iterate(q, k -> k >= 0, k -> k - 1).allMatch(k ->
                Integer.valueOf(ord[k]) instanceof Integer v
                && Integer.valueOf(cnt[v]) instanceof Integer c
                && (G[v] == null ? ones.apply(c + 1) : G[v]) instanceof double[] g
                && new double[c + 1] instanceof double[] f
                && IntStream.of(0).peek(z -> Arrays.setAll(f, j -> (j > 0 ? Pr[v] * g[j - 1] : 0) + (1 - Pr[v]) * g[j])).findFirst().isPresent()
                && (k == 0
                    ? (ans[0] = mx[v] + IntStream.range(0, c).mapToDouble(j -> 1 - f[j]).sum()) >= 0
                    : Integer.valueOf(par[v]) instanceof Integer P
                        && (G[P] != null || (G[P] = ones.apply(cnt[P] + 1)) != null)
                        && IntStream.rangeClosed(0, Math.min(cnt[P], c - 1 - mx[P] + mx[v])).allMatch(j -> (G[P][j] *= f[Math.min(j + mx[P] - mx[v], c)]) >= 0)
                        && (G[v] = null) == null))
            ? String.format(Locale.US, "%.9f", ans[0])
            : "");
    }
}
