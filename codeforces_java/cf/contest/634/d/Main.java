import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] b && Arrays.copyOf(b, b.length + 1) instanceof byte[] raw
            && new long[2] instanceof long[] st && new int[]{0} instanceof int[] ix && new long[raw.length / 2 + 2] instanceof long[] v
            && IntStream.range(0, raw.length).filter(k -> raw[k] > 47 && raw[k] < 58 ? (st[0] = st[0] * 10 + raw[k] - 48) < 0
                : k > 0 && raw[k - 1] > 47 && raw[k - 1] < 58 && (v[ix[0]++] = st[0]) + (st[0] = 0) < 0).count() >= 0
            && Long.valueOf(v[0]) instanceof Long d && Long.valueOf(v[1]) instanceof Long n && Integer.valueOf((int) v[2]) instanceof Integer m
            && IntStream.range(0, m).mapToLong(i -> v[3 + 2 * i] << 20 | v[4 + 2 * i]).sorted().toArray() instanceof long[] ks
            && IntStream.rangeClosed(0, m).mapToLong(i -> i < m ? ks[i] >> 20 : d).toArray() instanceof long[] xs
            && IntStream.rangeClosed(0, m).mapToLong(i -> i < m ? ks[i] & 1048575 : 0).toArray() instanceof long[] ps
            && new int[m + 1] instanceof int[] nl
            && IntStream.range(0, m).map(t -> m - 1 - t).filter(i -> (nl[i] = IntStream.iterate(i + 1, j -> nl[j]).filter(j -> ps[j] < ps[i]).findFirst().getAsInt()) < 0).count() >= 0
            && new long[]{m == 0 ? 0 : n - xs[0], 0} instanceof long[] fc
            ? (m == 0 ? (d <= n ? 0 : -1)
                : fc[0] >= 0 && IntStream.range(0, m).allMatch(i -> Long.valueOf(Math.max(0, Math.min(n, xs[nl[i]] - xs[i]) - fc[0])) instanceof Long buy
                    && (fc[1] += buy * ps[i]) >= 0 && (fc[0] += buy - (xs[i + 1] - xs[i])) >= 0) ? fc[1] : -1) : "");
    }
}
