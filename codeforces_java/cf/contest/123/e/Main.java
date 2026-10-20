import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] t
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((t[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf(t[0]) instanceof Integer n
            && new double[n] instanceof double[] x
            && new double[n] instanceof double[] y
            && IntStream.range(0, n).allMatch(i -> (x[i] = t[2 * n - 1 + 2 * i]) >= 0 && (y[i] = t[2 * n + 2 * i]) >= 0)
            && (Double) Arrays.stream(x).sum() instanceof Double X
            && (Double) Arrays.stream(y).sum() instanceof Double Y
            && new int[n] instanceof int[] dg
            && new int[n] instanceof int[] nb
            && IntStream.range(0, n - 1).allMatch(i ->
                dg[t[1 + 2 * i] - 1]++ >= 0
                && dg[t[2 + 2 * i] - 1]++ >= 0
                && (nb[t[1 + 2 * i] - 1] ^= t[2 + 2 * i] - 1) >= 0
                && (nb[t[2 + 2 * i] - 1] ^= t[1 + 2 * i] - 1) >= 0)
            && new int[n + 1] instanceof int[] order
            && new int[]{0} instanceof int[] tail
            && IntStream.range(0, n).allMatch(v -> dg[v] != 1 || (order[tail[0]++] = v) >= 0)
            && new double[n] instanceof double[] sz
            && new double[n] instanceof double[] sx
            && new double[n] instanceof double[] cs
            && IntStream.range(0, n).allMatch(i -> (sz[i] = 1) > 0 && (sx[i] = x[i]) >= 0)
            && IntStream.range(0, n - 1).allMatch(qi ->
                (Integer) order[qi] instanceof Integer v
                && (Integer) nb[v] instanceof Integer p
                && (cs[p] += sx[v] * (n - sz[v])) >= 0
                && (sz[p] += sz[v]) > 0
                && (sx[p] += sx[v]) >= 0
                && (nb[p] ^= v) >= 0
                && (--dg[p] != 1 || (order[tail[0]++] = p) >= 0))
            ? String.format(Locale.US, "%.12f",
                (X * Y * n - IntStream.range(0, n).mapToDouble(v -> y[v] * (sz[v] * (X - sx[v]) + x[v] * n + cs[v])).sum()) / (X * Y))
            : "");
    }
}

