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
            && Integer.valueOf(v[0]) instanceof Integer d && Integer.valueOf(v[1]) instanceof Integer n && Integer.valueOf(v[2]) instanceof Integer m
            && IntStream.rangeClosed(0, m).mapToLong(i -> i == m ? (long) d << 20 : (long) v[3 + 2 * i] << 20 | v[4 + 2 * i]).sorted().toArray() instanceof long[] key
            && new int[m + 1] instanceof int[] pr && new int[m + 1] instanceof int[] xs && new int[m + 1] instanceof int[] nxt
            && new int[m + 1] instanceof int[] stk && new int[]{0} instanceof int[] sp
            && IntStream.rangeClosed(0, m).filter(i -> (xs[i] = (int) (key[i] >> 20)) + (pr[i] = (int) (key[i] & 1048575)) < 0).count() == 0
            && IntStream.rangeClosed(0, m).map(r -> m - r).filter(i -> (sp[0] -= IntStream.iterate(sp[0], s -> s > 0 && pr[stk[s - 1]] >= pr[i], s -> s - 1).count()) < 0
                || (nxt[i] = sp[0] > 0 ? stk[sp[0] - 1] : m) + (stk[sp[0]++] = i) < 0).count() == 0
            && new long[]{n, 0, 0} instanceof long[] sim
            ? IntStream.rangeClosed(0, m).allMatch(i -> (sim[0] -= xs[i] - sim[1]) >= 0 && (sim[1] = xs[i]) >= 0
                && (i == m || Long.valueOf(xs[nxt[i]] - xs[i] <= n ? Math.max(0, xs[nxt[i]] - xs[i] - sim[0]) : n - sim[0]) instanceof Long need
                    && (sim[2] += need * pr[i]) >= 0 && (sim[0] += need) >= 0)) ? sim[2] : -1
            : "");
    }
}
