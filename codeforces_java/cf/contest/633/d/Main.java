import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] b && Arrays.copyOf(b, b.length + 1) instanceof byte[] raw
            && new long[4] instanceof long[] st && new int[]{0} instanceof int[] ix && new long[raw.length / 2 + 2] instanceof long[] v
            && IntStream.range(0, raw.length).allMatch(k -> raw[k] > 47 && raw[k] < 58 ? (st[0] = st[0] * 10 + raw[k] - 48) + (st[1] = 1) > 0
                : raw[k] == 45 ? (st[3] = 1) > 0
                : st[1] == 0 || ((v[ix[0]++] = st[3] == 1 ? -st[0] : st[0]) + (st[0] = 0) + (st[1] = 0) + (st[3] = 0)) * 0 == 0)
            && Integer.valueOf((int) v[0]) instanceof Integer n
            && IntStream.rangeClosed(1, n).mapToLong(i -> v[i]).sorted().distinct().toArray() instanceof long[] vals
            && new int[vals.length] instanceof int[] cnt && Integer.valueOf(vals.length) instanceof Integer d
            && IntStream.rangeClosed(1, n).allMatch(i -> ++cnt[Arrays.binarySearch(vals, v[i])] > 0)
            && new long[3] instanceof long[] s && new int[n + 3] instanceof int[] stk && new int[]{0} instanceof int[] sp
            && ((IntPredicate) q -> Integer.valueOf(Arrays.binarySearch(vals, s[2] = s[0] + s[1])) instanceof Integer x
                && x >= 0 && cnt[x] > 0 && --cnt[x] >= 0 && (stk[sp[0]++] = x) >= 0 && (s[0] = s[1]) == s[1] && (s[1] = s[2]) == s[2]) instanceof IntPredicate stp
            ? IntStream.range(0, d * d).map(idx -> Integer.valueOf(idx / d) instanceof Integer i && Integer.valueOf(idx % d) instanceof Integer j
                && (s[0] = vals[i]) + (s[1] = vals[j]) > Long.MIN_VALUE && (sp[0] = 0) == 0
                && Boolean.valueOf(--cnt[i] >= 0 & --cnt[j] >= 0) instanceof Boolean ok
                && (!ok || stp.test(0) && stp.test(0) && stp.test(0) && stp.test(0) && stp.test(0) && IntStream.iterate(0, q -> q + 1).takeWhile(stp).count() >= 0 || true)
                && (sp[0] == 0 || IntStream.range(0, sp[0]).allMatch(q -> ++cnt[stk[q]] > 0)) && ++cnt[i] + ++cnt[j] > Integer.MIN_VALUE ? (ok ? 2 + sp[0] : 0) : 0).max().getAsInt() : "");
    }
}
