import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] b && Arrays.copyOf(b, b.length + 1) instanceof byte[] raw
            && new long[2] instanceof long[] st && new int[]{0} instanceof int[] ix && new long[raw.length / 2 + 2] instanceof long[] v
            && IntStream.range(0, raw.length).filter(k -> raw[k] > 47 && raw[k] < 58 ? (st[0] = st[0] * 10 + raw[k] - 48) < 0
                : k > 0 && raw[k - 1] > 47 && raw[k - 1] < 58 && (v[ix[0]++] = st[0]) + (st[0] = 0) < 0).count() >= 0
            && Integer.valueOf((int) v[0]) instanceof Integer n
            && new int[n + 1] instanceof int[] head && new int[2 * n + 2] instanceof int[] nxt && new int[2 * n + 2] instanceof int[] to
            && IntStream.range(0, n - 1).filter(e -> Integer.valueOf((int) v[n + 1 + 2 * e]) instanceof Integer u && Integer.valueOf((int) v[n + 2 + 2 * e]) instanceof Integer w
                && (to[2 * e + 1] = w) + (nxt[2 * e + 1] = head[u]) + (head[u] = 2 * e + 1) + (to[2 * e + 2] = u) + (nxt[2 * e + 2] = head[w]) + (head[w] = 2 * e + 2) < 0).count() >= 0
            && new int[n] instanceof int[] ord && new int[n + 1] instanceof int[] par && new int[]{1} instanceof int[] ct && (ord[0] = 1) == 1
            && IntStream.range(0, n).filter(qi -> Integer.valueOf(ord[qi]) instanceof Integer x
                && IntStream.iterate(head[x], e -> e > 0, e -> nxt[e]).filter(e -> to[e] != par[x] && (par[to[e]] = x) > 0 && (ord[ct[0]++] = to[e]) > 0).count() < 0).count() >= 0
            && new long[n + 1] instanceof long[] d && new long[n + 1] instanceof long[] bb && new long[3 * n + 3] instanceof long[] TV && new long[3 * n + 3] instanceof long[] TI
            && new long[2 * n + 2] instanceof long[] BV && new long[n + 1] instanceof long[] BI
            && IntStream.range(0, n).filter(t -> Integer.valueOf(ord[n - 1 - t]) instanceof Integer x
                && (d[x] = v[x] + TV[3 * x]) > 0 && (bb[x] = Math.max(BV[2 * x], v[x] + TV[3 * x] + TV[3 * x + 1])) > 0
                && (x == 1 || Integer.valueOf(par[x]) instanceof Integer p
                    && (d[x] > TV[3 * p] ? (TV[3 * p + 2] = TV[3 * p + 1]) + (TI[3 * p + 2] = TI[3 * p + 1]) + (TV[3 * p + 1] = TV[3 * p]) + (TI[3 * p + 1] = TI[3 * p]) + (TV[3 * p] = d[x]) + (TI[3 * p] = x)
                        : d[x] > TV[3 * p + 1] ? (TV[3 * p + 2] = TV[3 * p + 1]) + (TI[3 * p + 2] = TI[3 * p + 1]) + (TV[3 * p + 1] = d[x]) + (TI[3 * p + 1] = x)
                        : d[x] > TV[3 * p + 2] ? (TV[3 * p + 2] = d[x]) + (TI[3 * p + 2] = x) : 0L) > -2L
                    && (bb[x] > BV[2 * p] ? (BV[2 * p + 1] = BV[2 * p]) + (BV[2 * p] = bb[x]) + (BI[p] = x)
                        : bb[x] > BV[2 * p + 1] ? (BV[2 * p + 1] = bb[x]) : 0L) > -2L)).count() >= 0
            && new long[n + 1] instanceof long[] upc && new long[n + 1] instanceof long[] outB
            ? IntStream.range(1, n).mapToLong(qi -> Integer.valueOf(ord[qi]) instanceof Integer x && Integer.valueOf(par[x]) instanceof Integer p
                && Long.valueOf(TI[3 * p] == x ? TV[3 * p + 1] + TV[3 * p + 2] : TI[3 * p + 1] == x ? TV[3 * p] + TV[3 * p + 2] : TV[3 * p] + TV[3 * p + 1]) instanceof Long pair
                && Long.valueOf(TI[3 * p] == x ? TV[3 * p + 1] : TV[3 * p]) instanceof Long single
                && Long.valueOf(BI[p] == x ? BV[2 * p + 1] : BV[2 * p]) instanceof Long sib
                && (upc[x] = v[p] + single) > 0 && (outB[x] = Math.max(outB[p], Math.max(sib, v[p] + pair))) > 0
                && (upc[x] > TV[3 * x] ? (TV[3 * x + 2] = TV[3 * x + 1]) + (TI[3 * x + 2] = TI[3 * x + 1]) + (TV[3 * x + 1] = TV[3 * x]) + (TI[3 * x + 1] = TI[3 * x]) + (TV[3 * x] = upc[x]) + (TI[3 * x] = -1)
                    : upc[x] > TV[3 * x + 1] ? (TV[3 * x + 2] = TV[3 * x + 1]) + (TI[3 * x + 2] = TI[3 * x + 1]) + (TV[3 * x + 1] = upc[x]) + (TI[3 * x + 1] = -1)
                    : upc[x] > TV[3 * x + 2] ? (TV[3 * x + 2] = upc[x]) + (TI[3 * x + 2] = -1) : 0L) > -2L
                ? bb[x] + outB[x] : 0L).max().orElse(v[1]) : "");
    }
}
