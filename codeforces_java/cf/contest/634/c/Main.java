import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] b && Arrays.copyOf(b, b.length + 1) instanceof byte[] raw
            && new long[2] instanceof long[] st && new int[]{0} instanceof int[] ix && new long[raw.length / 2 + 2] instanceof long[] v
            && IntStream.range(0, raw.length).filter(k -> raw[k] > 47 && raw[k] < 58 ? (st[0] = st[0] * 10 + raw[k] - 48) < 0
                : k > 0 && raw[k - 1] > 47 && raw[k - 1] < 58 && (v[ix[0]++] = st[0]) + (st[0] = 0) < 0).count() >= 0
            && Integer.valueOf((int) v[0]) instanceof Integer n && Integer.valueOf((int) v[1]) instanceof Integer k && Long.valueOf(v[2]) instanceof Long ca && Long.valueOf(v[3]) instanceof Long cb
            && Integer.valueOf((int) v[4]) instanceof Integer q
            && new long[n + 1] instanceof long[] ord && new long[n + 1] instanceof long[] ta && new long[n + 1] instanceof long[] tb && new int[]{5} instanceof int[] pt
            ? IntStream.range(0, q).mapToObj(qi -> v[pt[0]] == 1
                ? Integer.valueOf((int) v[pt[0] + 1]) instanceof Integer d && Long.valueOf(v[pt[0] + 2]) instanceof Long x && (pt[0] += 3) > 0
                    && Long.valueOf(Math.min(cb, ord[d] + x) - Math.min(cb, ord[d])) instanceof Long db && Long.valueOf(Math.min(ca, ord[d] + x) - Math.min(ca, ord[d])) instanceof Long da
                    && (ord[d] += x) > 0
                    && IntStream.iterate(d, i -> i <= n, i -> i + (i & -i)).filter(i -> (tb[i] += db) + (ta[i] += da) < 0).count() >= 0 ? "" : ""
                : Integer.valueOf((int) v[pt[0] + 1]) instanceof Integer p && (pt[0] += 2) > 0
                    ? String.valueOf(IntStream.iterate(p - 1, i -> i > 0, i -> i - (i & -i)).mapToLong(i -> tb[i]).sum()
                        + IntStream.iterate(n, i -> i > 0, i -> i - (i & -i)).mapToLong(i -> ta[i]).sum()
                        - IntStream.iterate(p + k - 1, i -> i > 0, i -> i - (i & -i)).mapToLong(i -> ta[i]).sum()) : "")
                .filter(s -> !s.isEmpty()).collect(Collectors.joining("\n")) : "");
    }
}
