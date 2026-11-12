import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(new BufferedReader(new InputStreamReader(System.in)).lines().iterator() instanceof Iterator<String> it
            && Integer.valueOf(it.next().trim()) instanceof Integer m
            && new String[2][20][] instanceof String[][][] ws && new int[2][20][][] instanceof int[][][][] gr
            && ((Function<String[], int[][]>) w -> Integer.valueOf(Arrays.stream(w).mapToInt(String::length).sum() + 1) instanceof Integer tot
                && new int[tot * 26] instanceof int[] g && new int[tot] instanceof int[] cnt && new int[tot] instanceof int[] f && new int[tot] instanceof int[] q && new int[]{1, 0} instanceof int[] c
                && Arrays.stream(w).filter(s -> ++cnt[s.chars().reduce(0, (u, ch) -> g[u * 26 + ch - 97] != 0 ? g[u * 26 + ch - 97] : (g[u * 26 + ch - 97] = c[0]++))] > 0).count() >= 0
                && IntStream.range(0, 26).filter(ch -> g[ch] != 0 && (q[c[1]++] = g[ch]) >= 0).count() >= 0
                && IntStream.iterate(0, h -> h < c[1], h -> h + 1).filter(h -> Integer.valueOf(q[h]) instanceof Integer u && (cnt[u] += cnt[f[u]]) >= 0
                    && IntStream.range(0, 26).filter(ch -> g[u * 26 + ch] == 0 ? (g[u * 26 + ch] = g[f[u] * 26 + ch]) >= 0 : (f[g[u * 26 + ch]] = g[f[u] * 26 + ch]) >= 0 & (q[c[1]++] = g[u * 26 + ch]) >= 0).count() >= 0).count() >= 0
                ? new int[][]{g, cnt} : null) instanceof Function<String[], int[][]> build
            && ((ToLongBiFunction<int[][], String>) (a, s) -> new int[]{0} instanceof int[] cur && new long[]{0} instanceof long[] sum
                && s.chars().filter(ch -> (cur[0] = a[0][cur[0] * 26 + ch - 97]) >= 0 & (sum[0] += a[1][cur[0]]) >= 0).count() >= 0 ? sum[0] : 0L) instanceof ToLongBiFunction<int[][], String> run
            && IntStream.range(0, m).filter(i -> it.next() instanceof String line
                && (line.charAt(0) == '3'
                    ? System.out.append(IntStream.range(0, 40).filter(z -> ws[z / 20][z % 20] != null).mapToLong(z -> (z < 20 ? 1L : -1L) * run.applyAsLong(gr[z / 20][z % 20], line.substring(2))).sum() + "\n") != null
                    : Integer.valueOf(line.charAt(0) - '1') instanceof Integer t
                    && Integer.valueOf(IntStream.range(0, 20).filter(j -> ws[t][j] == null).findFirst().getAsInt()) instanceof Integer lv
                    && Stream.concat(Stream.of(line.substring(2)), IntStream.range(0, lv).boxed().flatMap(j -> Arrays.stream(ws[t][j]))).toArray(String[]::new) instanceof String[] mg
                    && IntStream.range(0, lv).filter(j -> (ws[t][j] = null) == null & (gr[t][j] = null) == null).count() >= 0
                    && (ws[t][lv] = mg) != null && (gr[t][lv] = build.apply(mg)) != null)).count() >= 0
            ? "" : "");
    }
}
