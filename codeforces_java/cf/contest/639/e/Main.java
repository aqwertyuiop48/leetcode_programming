import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] v
            && new int[]{0, 0, 0} instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).filter(i -> i < raw.length && raw[i] > 47
                ? (st[2] = 1) + (st[1] = st[1] * 10 + raw[i] - 48) < 0
                : st[2] == 1 && (v[st[0]++] = st[1]) + (st[1] = 0) + (st[2] = 0) < 0).count() == 0
            && Integer.valueOf(v[0]) instanceof Integer n
            && IntStream.range(0, n).mapToLong(i -> v[1 + i]).toArray() instanceof long[] p
            && IntStream.range(0, n).mapToLong(i -> v[1 + n + i]).toArray() instanceof long[] t
            && IntStream.range(0, n).mapToDouble(i -> (double) t[i] / p[i]).toArray() instanceof double[] dr
            && IntStream.range(0, n).boxed().sorted((x, y) -> Double.compare(dr[x], dr[y])).sorted((x, y) -> Long.compare(t[x] * p[y], t[y] * p[x]))
                .mapToInt(Integer::intValue).toArray() instanceof int[] ord
            && new boolean[n + 1] instanceof boolean[] nb && new int[n] instanceof int[] bs && new int[n] instanceof int[] be && new long[n + 1] instanceof long[] pre
            && IntStream.range(0, n).filter(k -> (pre[k + 1] = pre[k] + t[ord[k]]) < 0
                || (nb[k] = k == 0 || t[ord[k]] * p[ord[k - 1]] != t[ord[k - 1]] * p[ord[k]]) && false
                || (bs[k] = nb[k] ? k : bs[k - 1]) < 0).count() == 0
            && (nb[n] = true)
            && IntStream.range(0, n).map(r -> n - 1 - r).filter(k -> (be[k] = nb[k + 1] ? k : be[k + 1]) < 0).count() == 0
            && new double[n] instanceof double[] xmin && new double[n] instanceof double[] xmax
            && IntStream.range(0, n).filter(k -> (xmin[ord[k]] = pre[bs[k]] + t[ord[k]]) + (xmax[ord[k]] = pre[be[k] + 1]) < 0).count() == 0
            && IntStream.range(0, n).mapToLong(i -> p[i] << 18 | i).sorted().toArray() instanceof long[] key
            && new double[n] instanceof double[] ps && new double[n] instanceof double[] xa && new double[n] instanceof double[] xb
            && new int[n] instanceof int[] gs && new double[n + 1] instanceof double[] pm
            && IntStream.range(0, n).filter(k -> (ps[k] = p[(int) (key[k] & 262143)]) + (xa[k] = xmin[(int) (key[k] & 262143)]) + (xb[k] = xmax[(int) (key[k] & 262143)]) < 0
                || (gs[k] = k > 0 && ps[k] == ps[k - 1] ? gs[k - 1] : k) < 0).count() == 0
            && new double[]{0, 1, 0, pre[n]} instanceof double[] lh
            && IntStream.range(0, 40).filter(it -> (lh[2] = (lh[0] + lh[1]) / 2) > -1
                && ((pm[0] = -1e300) < 0 && IntStream.range(0, n).filter(k -> (pm[k + 1] = Math.max(pm[k], ps[k] * (1 - lh[2] * xa[k] / lh[3]))) < -1e301).count() == 0
                    && IntStream.range(0, n).noneMatch(k -> pm[gs[k]] > ps[k] * (1 - lh[2] * xb[k] / lh[3]))
                    ? (lh[0] = lh[2]) < 0 : (lh[1] = lh[2]) < 0)).count() == 0
            ? String.format(Locale.ROOT, "%.11f", lh[0])
            : "");
    }
}
