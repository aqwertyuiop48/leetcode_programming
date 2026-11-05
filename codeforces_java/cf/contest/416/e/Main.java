import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] b && new int[b.length / 2 + 4] instanceof int[] t && new int[2] instanceof int[] acc
            && IntStream.range(0, b.length).map(i -> t[acc[1] = acc[1] + (b[i] < 48 && i > 0 && b[i - 1] >= 48 ? 1 : 0)] = acc[0] = (b[i] >= 48 ? acc[0] * 10 + b[i] - 48 : 0)).max().isPresent()
            && (Integer) t[0] instanceof Integer n && (Integer) t[1] instanceof Integer m
            && IntStream.range(0, 2 * m).map(e -> t[2 + 3 * (e >> 1) + (e & 1)] - 1).toArray() instanceof int[] fr0
            && IntStream.range(0, 2 * m).map(e -> t[3 + 3 * (e >> 1) - (e & 1)] - 1).toArray() instanceof int[] to0
            && IntStream.range(0, 2 * m).map(e -> t[4 + 3 * (e >> 1)]).toArray() instanceof int[] w0
            && new int[n][n] instanceof int[][] d
            && IntStream.range(0, n).allMatch(i -> IntStream.of(0).peek(z -> Arrays.setAll(d[i], j -> i == j ? 0 : 1000000000)).sum() == 0)
            && IntStream.range(0, 2 * m).allMatch(e -> (d[fr0[e]][to0[e]] = w0[e]) > 0)
            && IntStream.range(0, n).allMatch(k -> d[k] instanceof int[] dk && IntStream.range(0, n).allMatch(i -> d[i] instanceof int[] di && (Integer) di[k] instanceof Integer dik && (dik >= 1000000000 || IntStream.of(0).peek(z -> Arrays.setAll(di, j -> Math.min(di[j], dik + dk[j]))).sum() == 0)))
            && IntStream.range(0, 2 * m).filter(e -> w0[e] == d[fr0[e]][to0[e]]).toArray() instanceof int[] ok
            && Arrays.stream(ok).map(e -> fr0[e]).toArray() instanceof int[] fr && Arrays.stream(ok).map(e -> to0[e]).toArray() instanceof int[] to && Arrays.stream(ok).map(e -> w0[e]).toArray() instanceof int[] w
            && new int[n][n] instanceof int[][] ct
            && IntStream.range(0, fr.length).allMatch(e -> d[fr[e]] instanceof int[] du && d[to[e]] instanceof int[] dv && ct[to[e]] instanceof int[] cv && (Integer) w[e] instanceof Integer we && IntStream.of(0).peek(z -> Arrays.setAll(cv, a -> cv[a] + (du[a] + we == dv[a] ? 1 : 0))).sum() == 0)
            && IntStream.range(0, n).mapToObj(a -> IntStream.range(0, n).map(v -> ct[v][a]).toArray()).toArray(int[][]::new) instanceof int[][] cnt
            ? IntStream.range(0, n).mapToObj(a -> d[a] instanceof int[] da && cnt[a] instanceof int[] ca && new int[n] instanceof int[] res
                && IntStream.range(0, n).allMatch(v -> ca[v] == 0 || d[v] instanceof int[] dv && (Integer) da[v] instanceof Integer dav && (Integer) ca[v] instanceof Integer c && IntStream.of(0).peek(z -> IntStream.range(a + 1, n).forEach(q -> res[q] += dav + dv[q] == da[q] ? c : 0)).sum() == 0)
                ? Arrays.stream(res, a + 1, n).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "").filter(s -> !s.isEmpty()).collect(Collectors.joining(" ")) : "");
    }
}

