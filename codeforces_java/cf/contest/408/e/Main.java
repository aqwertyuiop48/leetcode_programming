import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n && Integer.valueOf(it.nextInt()) instanceof Integer m && IntStream.range(0, n).map(i -> it.nextInt()).toArray() instanceof int[] a
            && IntStream.range(0, m).mapToObj(i -> new int[] {it.nextInt(), it.nextInt(), it.nextInt()}).toArray(int[][]::new) instanceof int[][] op
            && Long.valueOf(1000000007L) instanceof Long M && new long[n + m + 205] instanceof long[] f && new long[n + m + 205] instanceof long[] g && (f[0] = 1) == 1
            && IntStream.range(1, f.length).allMatch(i -> (f[i] = f[i - 1] * i % M) > 0)
            && (g[f.length - 1] = java.math.BigInteger.valueOf(f[f.length - 1]).modInverse(java.math.BigInteger.valueOf(M)).longValue()) > 0
            && IntStream.iterate(f.length - 1, i -> i > 0, i -> i - 1).allMatch(i -> (g[i - 1] = g[i] * i % M) > 0) && new long[n + 2] instanceof long[] s
            && IntStream.iterate(100, j -> j >= 0, j -> j - 1).allMatch(j -> IntStream.range(0, m).filter(q -> op[q][2] >= j).allMatch(q -> (s[op[q][0]] += op[q][2] == j ? 1 : 0) >= 0
                    && (s[op[q][1] + 1] = Math.floorMod(s[op[q][1] + 1] - f[op[q][1] - op[q][0] + op[q][2] - j] * g[op[q][2] - j] % M * g[op[q][1] - op[q][0]] % M, M)) >= 0)
                && IntStream.rangeClosed(1, n).allMatch(i -> (s[i] = (s[i] + s[i - 1]) % M) >= 0))
            ? IntStream.rangeClosed(1, n).mapToObj(i -> String.valueOf((a[i - 1] + s[i]) % M)).collect(Collectors.joining(" ")) : "");
    }
}
