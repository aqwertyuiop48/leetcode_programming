import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new String(System.in.readAllBytes()).trim().split("[ \r\n]+") instanceof String[] t
            && (Integer) Integer.parseInt(t[0]) instanceof Integer n
            && IntStream.range(0, n).mapToDouble(i -> Double.parseDouble(t[2 * n - 1 + 2 * i])).toArray() instanceof double[] x
            && IntStream.range(0, n).mapToDouble(i -> Double.parseDouble(t[2 * n + 2 * i])).toArray() instanceof double[] y
            && (Double) Arrays.stream(x).sum() instanceof Double X
            && (Double) Arrays.stream(y).sum() instanceof Double Y
            && IntStream.generate(() -> -1).limit(n).toArray() instanceof int[] hd
            && new int[2 * n] instanceof int[] nxt
            && new int[2 * n] instanceof int[] to
            && IntStream.range(0, n - 1).allMatch(i ->
                (to[2 * i] = Integer.parseInt(t[2 + 2 * i]) - 1) >= 0
                && (nxt[2 * i] = hd[Integer.parseInt(t[1 + 2 * i]) - 1]) >= -1
                && (hd[Integer.parseInt(t[1 + 2 * i]) - 1] = 2 * i) >= 0
                && (to[2 * i + 1] = Integer.parseInt(t[1 + 2 * i]) - 1) >= 0
                && (nxt[2 * i + 1] = hd[Integer.parseInt(t[2 + 2 * i]) - 1]) >= -1
                && (hd[Integer.parseInt(t[2 + 2 * i]) - 1] = 2 * i + 1) >= 0)
            && new int[n] instanceof int[] order
            && new int[n] instanceof int[] par
            && (par[0] = -1) == -1
            && new int[]{1} instanceof int[] tail
            && IntStream.range(0, n).allMatch(qi ->
                IntStream.iterate(hd[order[qi]], e -> e != -1, e -> nxt[e])
                    .filter(e -> to[e] != par[order[qi]])
                    .allMatch(e -> (par[to[e]] = order[qi]) >= -1 && (order[tail[0]++] = to[e]) >= 0))
            && new double[n] instanceof double[] sz
            && new double[n] instanceof double[] sx
            && new double[n] instanceof double[] cs
            && IntStream.range(0, n).allMatch(i -> (sz[i] = 1) > 0 && (sx[i] = x[i]) >= 0)
            && IntStream.iterate(n - 1, i -> i >= 1, i -> i - 1).allMatch(i ->
                (Integer) order[i] instanceof Integer v
                && (cs[par[v]] += sx[v] * (n - sz[v])) >= 0
                && (sz[par[v]] += sz[v]) > 0
                && (sx[par[v]] += sx[v]) >= 0)
            ? String.format(Locale.US, "%.12f",
                (X * Y * n - IntStream.range(0, n).mapToDouble(v -> y[v] * (sz[v] * (X - sx[v]) + x[v] * n + cs[v])).sum()) / (X * Y))
            : "");
    }
}
